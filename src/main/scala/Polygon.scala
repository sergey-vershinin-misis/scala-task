case class Polygon(vertices: List[Vector2]) {

  private def getAxes: List[Vector2] = {
    val axes = for {
      (v1, i) <- vertices.zipWithIndex
      v2 = vertices((i + 1) % vertices.length)
      edge = Vector2(v1.x - v2.x, v1.y - v2.y)
    } yield Vector2(-edge.y, edge.x)
    axes
  }

  private def projectionOnAxis(axis: Vector2): Projection = {
    var min = Double.PositiveInfinity
    var max = Double.NegativeInfinity
    for (vertex <- vertices) {
      val p = axis.x * vertex.x + axis.y * vertex.y
      if (p < min) min = p
      if (p > max) max = p
    }
    Projection(min, max)
  }

  def overlaps(other: Polygon): Boolean = {
    val axes = this.getAxes ++ other.getAxes
    for (axis <- axes) {
      val p1 = this.projectionOnAxis(axis)
      val p2 = other.projectionOnAxis(axis)
      if (!p1.overlaps(p2)) return false
    }
    true
  }
}

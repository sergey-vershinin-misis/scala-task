case class Projection(min: Double, max: Double) {
  def overlaps(otherProj: Projection): Boolean = {
    if (max < otherProj.min || otherProj.max < min) false
    else true
  }
}

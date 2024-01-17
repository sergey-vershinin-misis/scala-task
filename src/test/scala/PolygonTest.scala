import org.scalatest.funsuite.AnyFunSuiteLike

class PolygonTest extends AnyFunSuiteLike {

  test("testOverlaps") {
    val polygon1 = Polygon(List(Vector2(0.0, 0.0), Vector2(0.0, 2.0), Vector2(1.0, 4.0), Vector2(2.0, 2.0), Vector2(2.0, 0.0)))
    val polygon2 = Polygon(List(Vector2(4.0, 0.0), Vector2(4.0, 2.0), Vector2(5.0, 4.0), Vector2(6.0, 2.0), Vector2(6.0, 0.0)))
    val polygon3 = Polygon(List(Vector2(1.0, 0.0), Vector2(1.0, 2.0), Vector2(5.0, 4.0), Vector2(9.0, 2.0), Vector2(9.0, 0.0)))

    assert(!polygon1.overlaps(polygon2))
    assert(polygon1.overlaps(polygon3))
    assert(polygon2.overlaps(polygon3))
  }

}

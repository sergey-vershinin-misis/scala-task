## Реализация задачи на Scala
Репозиторий содержит реализованное на Scala решение задачи определения
пересечения двух полигонов, [размещенной на ресурсе rosettacode.org](https://rosettacode.org/wiki/Check_if_two_polygons_overlap)

Решение основано на _separating axis theorem_, о котором можно почитать 
[здесь](https://code.tutsplus.com/collision-detection-using-the-separating-axis-theorem--gamedev-169t)

За основу взята реализация на python. Классы решения размещены в файлах 
[Polygon.scala](src/main/scala/Polygon.scala),
[Projection.scala](src/main/scala/Projection.scala) и 
[Vector2.scala](src/main/scala/Vector2.scala). Тестовые примеры оформлены в 
виде unit-теста с импользованием библиотеки _scalatest_ и содержатся в файле
[PolygonTest.scala](src/test/scala/PolygonTest.scala).


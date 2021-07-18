package flyweight.problem

import flyweight.PointType

class PointService {

    fun getPoints(): List<Point> {
        val points = ArrayList<Point>()
        points.add(Point(12, 43, PointType.Funeral))
        points.add(Point(7, 7, PointType.General))
        points.add(Point(432, 9, PointType.PointOfInterest))

        return points
    }

}
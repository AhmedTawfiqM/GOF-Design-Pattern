package flyweight.solution

import flyweight.PointType

class PointService(private val iconsFactory: PointsIconsFactory) {

    fun getPoints(): List<Point> {
        val points = ArrayList<Point>()
        points.add(Point(12, 43, iconsFactory.create(PointType.Funeral)))
        points.add(Point(7, 7, iconsFactory.create(PointType.General)))
        points.add(Point(432, 9, iconsFactory.create(PointType.PointOfInterest)))

        return points
    }

}
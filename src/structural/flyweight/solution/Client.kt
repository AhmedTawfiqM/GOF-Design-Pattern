package flyweight.solution

object Client {

    @JvmStatic
    fun main(args: Array<String>){
        val pointService = PointService(PointsIconsFactory())
        val points = pointService.getPoints()
        points.forEach {
            it.draw()
        }
    }
}
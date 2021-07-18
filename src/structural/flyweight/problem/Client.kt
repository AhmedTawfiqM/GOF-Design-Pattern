package flyweight.problem

object Client {

    @JvmStatic
    fun main(args: Array<String>) {

        val pointService = PointService()
        pointService.getPoints().forEach {
            it.draw()
        }
        //todo if u draw 1000 points , u will consume '20 MB' in memory
        //todo use FlyWeight pattern to reduce memory consume
    }
}
package flyweight.solution

data class Point(
    val x: Int,  //4 bytes
    val y: Int,  //4 bytes
    val pointIcon: PointIcon
){

    fun draw() {
        System.out.printf("drawing %s at (%d , %d))", pointIcon.type, x, y)
        println()
    }

}
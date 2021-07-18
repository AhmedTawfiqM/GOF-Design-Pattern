package flyweight.problem

import flyweight.PointType

data class Point(
    val x: Int,  //4 bytes
    val y: Int,  //4 bytes
    val type: PointType,  //4 bytes
    var icon: ByteArray? = null  //20 kb  //todo if u draw 1000 points , u will consume '20 MB' in memory
) {

    fun draw() {
        System.out.printf("%s at (%d , %d))", type, x, y)
        println()
    }

    //Nothing
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Point

        if (x != other.x) return false
        if (y != other.y) return false
        if (type != other.type) return false
        if (!icon.contentEquals(other.icon)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        result = 31 * result + type.hashCode()
        result = 31 * result + icon.contentHashCode()
        return result
    }
}


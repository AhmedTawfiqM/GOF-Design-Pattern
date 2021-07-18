package flyweight.solution

import flyweight.PointType

data class PointIcon(
    val type: PointType,  //4 bytes
    var icon: ByteArray? = null
)
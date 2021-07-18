package flyweight.solution

import flyweight.PointType

class PointsIconsFactory {
    //cashing the icons
    private val icons = HashMap<PointType, PointIcon>()

    fun create(pointType: PointType): PointIcon {
        if (!icons.containsKey(pointType)) {
            val icon = PointIcon(pointType, null)
            icons[pointType] = icon
        }

        return icons[pointType]!!
    }
}
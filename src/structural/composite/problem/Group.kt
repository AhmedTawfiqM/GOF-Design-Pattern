package composite.problem


class Group {
    private val shapes = ArrayList<Any>()

    fun addShape(obj: Any) {
        shapes.add(obj)
    }

    fun render(){
        shapes.forEach {
            when (it) {
                is Shape -> it.render()
                is Group -> it.render()
                else -> throw ExceptionInInitializerError("not Type")
            }
        }
    }
}
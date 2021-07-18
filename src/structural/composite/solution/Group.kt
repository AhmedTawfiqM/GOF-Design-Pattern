package composite.solution

//Composite
class Group : Shape{
    private val shapes = ArrayList<Shape>()

    fun add(shape: Shape){
        shapes.add(shape)
    }

    override fun render() {
        shapes.forEach { it.render() }
    }

    override fun move(x: Double, y: Double) {
        shapes.forEach { it.move(x,y) }
    }

}
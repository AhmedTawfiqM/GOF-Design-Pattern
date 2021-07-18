package composite.solution

//Leaf
class Square : Shape {

    override fun render() {
        println("Render Square")
    }

    override fun move(x: Double, y: Double) {
        println("move Square")
    }
}
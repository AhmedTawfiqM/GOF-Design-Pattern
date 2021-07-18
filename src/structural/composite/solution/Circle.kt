package composite.solution

class Circle : Shape {
    override fun render() {
        println("Render Circle")
    }

    override fun move(x: Double, y: Double) {
        println("move Circle")
    }
}
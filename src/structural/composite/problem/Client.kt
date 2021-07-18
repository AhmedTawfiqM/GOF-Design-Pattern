package composite.problem

object Client {

    @JvmStatic
    fun main(args: Array<String>) {

        val group1 = Group()
        group1.addShape(Shape())
        group1.addShape(Shape())

        val group2 = Group()
        group2.addShape(Shape())
        group2.addShape(Shape())

        val group = Group()
        group.addShape(group1)
        group.addShape(group2)

        group.render()
        //todo problem is to another functionality in group class , u have to duplicate the same logic check type and iterate again
        //todo little complex and ugly because of Not Maintainable and Flexible
    }
}
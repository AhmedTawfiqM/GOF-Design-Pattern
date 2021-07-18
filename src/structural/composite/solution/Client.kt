package composite.solution

object Client {

    @JvmStatic
    fun main(args: Array<String>){
        val group1 = Group()
        group1.add(Square())
        group1.add(Square())

        val group2 = Group()
        group2.add(Square())
        group2.add(Square())

        val group = Group()
        group.add(group1)
        group.add(group2)
        group.add(Circle())

        group.render()
        println(".....Move...............")
        group.move(4.7,12.6)
    }
}
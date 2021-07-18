package proxy.solution


object Client {

    @JvmStatic
    fun main(args: Array<String>){

        val library = Library()
        val fileNames = listOf("x.pdf","y.docs","z.txt")
        //can replace with EBookLoggingProxy
        fileNames.forEach { library.add(EBookProxy(it)) }

        //lazy initialization in action
        library.openEbook("x.pdf")
        //library.openEbook("y.docs")


    }
}
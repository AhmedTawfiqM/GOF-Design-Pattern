package proxy.problem

object Client {

    @JvmStatic
    fun main(args: Array<String>){

        val library = Library()
        //todo problem loading all books , imagine u use 1000 books and just need one book
        val fileNames = listOf("x.pdf","y.docs","z.txt")
        fileNames.forEach { library.add(EBook(it)) }

        library.openEbook("x.pdf")
    }
}
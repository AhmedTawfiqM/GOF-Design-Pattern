package proxy.problem

class EBook(private var fileName: String = "") {

    init {
        load()
    }

    private fun load() {
        println("Loading EBook $fileName")
    }

    fun show() {
        println("Showing EBook $fileName")
    }

    fun getFileName() = fileName
}
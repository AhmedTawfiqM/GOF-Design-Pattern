package proxy.solution

class RealEBook(private val mFileName: String) : EBook {

    init {
        load()
    }

    private fun load() {
        println("Loading EBook $mFileName")
    }

    override fun show() {
        println("Showing EBook $mFileName")
    }

    override fun getFileName() = mFileName
}
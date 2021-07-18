package proxy.problem

class Library {
    private val eBooks = HashMap<String, EBook>()

    fun add(eBook: EBook) {
        eBooks[eBook.getFileName()] = eBook
    }

    fun openEbook(fileName: String) = eBooks[fileName]?.show()
}
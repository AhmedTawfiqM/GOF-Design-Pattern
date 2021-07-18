package proxy.solution

class EBookProxy(private val mFileName: String) : EBook {

    private var realEBook: RealEBook? = null

    override fun show() {
        //lazy initialization
        if (realEBook == null)
            realEBook = RealEBook(mFileName)

        realEBook?.show()
    }

    override fun getFileName(): String {
        return mFileName
    }
}
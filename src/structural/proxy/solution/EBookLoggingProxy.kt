package proxy.solution

//todo open closed principle applied on this class
class EBookLoggingProxy(private val mFileName: String) : EBook {

    private var realEBook: RealEBook? = null

    override fun show() {
        //lazy initialization
        if (realEBook == null)
            realEBook = RealEBook(mFileName)

        println("perform logging")
        realEBook?.show()
    }

    override fun getFileName(): String {
        return mFileName
    }
}
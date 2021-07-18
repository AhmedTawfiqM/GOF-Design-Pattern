package decorator.problem

open class CompressedCloudStream : CloudStream() {

    fun store(data: String) {
        val compressed = compress(data)
        super.storeData(compressed)
    }

    private fun compress(data: String) = "#@@#$#@$ 543543 $data"


}
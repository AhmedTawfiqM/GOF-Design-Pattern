package decorator.problem

open class EncryptedCloudStream : CloudStream() {

    fun store(data: String) {
        val encrypted = encrypt(data)
        super.storeData(encrypted)
    }

    private fun encrypt(data: String) = "uyiytrrewr $data"

}
package decorator.problem

object Client {

    @JvmStatic
    fun main(args: Array<String>) {

        val compressedCloudStream = CompressedCloudStream()
        compressedCloudStream.store("Ahmed")

        val encryptedCloudStream = EncryptedCloudStream()
        encryptedCloudStream.store("Ali")

        //todo now try to add 2 behaviors to CloudStream like CompressedAndEncryptedCloudStream "u Can't" one class to inherit
        //todo and more complexity to add lots of numbers combined features
        //todo  Not Flexible Not Maintainable
        //todo favor composition over inheritance

    }
}
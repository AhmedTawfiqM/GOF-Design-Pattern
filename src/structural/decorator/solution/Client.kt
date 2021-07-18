package decorator.solution

object Client {

    @JvmStatic
    fun main(args: Array<String>) {

        val cloudStream = CloudStream()
        val encrypted = Encrypted(cloudStream)
        val compressed = Compressed(encrypted)

        storeEmailUser(cloudStream)
        storeEmailUser(encrypted)
        storeEmailUser(compressed)

        //use Decorator that lets you attach new behaviors to objects by placing these objects inside
        // special wrapper objects that contain the behaviors.
    }


    private fun storeEmailUser(stream: Stream) {
        stream.write("ahmed@mail.com")
    }
}
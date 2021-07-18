package decorator.solution

class Encrypted(private val stream: Stream) : Stream {

    override fun write(data: String) {
        val encrypted = encrypt(data)
        stream.write(encrypted)
    }

    private fun encrypt(data: String) = "ENCRYPT $data"
}
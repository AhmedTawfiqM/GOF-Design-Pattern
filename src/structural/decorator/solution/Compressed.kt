package decorator.solution

class Compressed(private val stream: Stream) : Stream {

    override fun write(data: String) {
        val compressed = compress(data)
        stream.write(compressed)
    }

    private fun compress(data: String) = "COMPRESS $data"
}
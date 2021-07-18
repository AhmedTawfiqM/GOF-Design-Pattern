package decorator.solution

class CloudStream : Stream {

    override fun write(data: String) {
        println("write $data")
    }
}
package facade

class Connection(private val ipAddress: String) {

    fun disConnect(){
        println("Connection disConnect")
    }
    override fun toString(): String {
        return ipAddress
    }
}
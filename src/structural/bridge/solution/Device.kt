package bridge.solution

interface Device {
    fun turnOn()
    fun turnOff()
    fun setChannel(number: Int)
}
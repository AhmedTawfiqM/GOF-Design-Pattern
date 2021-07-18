package bridge.solution

open class RemoteDevice(private val device: Device) {

    fun turnOn() = device.turnOn()
    fun turnOff() = device.turnOff()

}
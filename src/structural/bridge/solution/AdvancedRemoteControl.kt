package bridge.solution

class AdvancedRemoteControl(private val device: Device) : RemoteDevice(device){

    fun setChannel(number:Int) = device.setChannel(number)
}
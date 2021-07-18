package bridge.solution

object Client {

    @JvmStatic
    fun main(args: Array<String>){

        val remoteDevice = RemoteDevice(SamsungDevice())
        val adRemoteDevice = AdvancedRemoteControl(SamsungDevice())

        remoteDevice.turnOn()
        remoteDevice.turnOff()
        adRemoteDevice.setChannel(12)
    }
}
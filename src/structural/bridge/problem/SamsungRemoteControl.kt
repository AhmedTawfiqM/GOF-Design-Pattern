package bridge.problem

class SamsungRemoteControl : RemoteControl() {
    override fun turnOn() {
        println("Samsung: Turn On")
    }

    override fun turnOff() {
        println("Samsung: Turn Off")
    }
}
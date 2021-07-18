package bridge.problem

class SamsungAdvancedRemoteControl : AdvancedRemoteControl() {
    override fun setChannel(nummber: Int) {
        println("Samsung Advanced: setChannel")
    }

    override fun turnOn() {
        println("Samsung Advanced: Turn On")
    }

    override fun turnOff() {
        println("Samsung Advanced: Turn off")
    }
}
package bridge.solution

class SamsungDevice : Device {
    override fun turnOn() {
        println("turnOn")
    }

    override fun turnOff() {
        println("turnOff")
    }

    override fun setChannel(number: Int) {
        println("setChannel: $number")
    }
}
package facade.solution

object Client {

    @JvmStatic
    fun main(args: Array<String>) {
        //reducing coupling by composing all classes in Single Service
        val notificationService = NotificationService()
        notificationService.send("Hello from AtDev", "Egypt")
    }
}
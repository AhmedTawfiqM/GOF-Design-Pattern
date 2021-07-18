package facade.problem

import facade.Message
import facade.NotificationServer

object Client {

    @JvmStatic
    fun main(args: Array<String>) {

        val server = NotificationServer()

        val connection = server.connect("120.21.43.44")
        val authToken = server.authenticate("ew32", "FNFJFJKFKJKFF")
        val message = Message("Hello from Tawfiq")

        server.send(authToken = authToken, message = message, target = "ATDEV")
        connection.disConnect()
        //todo the problem is every time u want to push notification u follow the same steps
        //todo So many steps  - Coupling on 4 classes (lot of coupling)
    }
}
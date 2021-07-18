package facade.solution

import facade.Message
import facade.NotificationServer

class NotificationService {

    fun send(msg: String, target: String) {
        val server = NotificationServer()

        val connection = server.connect("120.21.43.44")
        val authToken = server.authenticate("ew32", "FNFJFJKFKJKFF")
        val message = Message("Hello from Tawfiq")

        server.send(authToken = authToken, message = Message(msg), target = target)
        connection.disConnect()
    }
}
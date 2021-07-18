package facade

class NotificationServer {

    fun connect(ipAddress: String) = Connection(ipAddress)

    fun authenticate(appId: String, key: String) = AuthToken(appId, key)

    fun send(authToken: AuthToken, message: Message, target: String) {
        println("Sending Notification ..$authToken $message $target")
    }
}
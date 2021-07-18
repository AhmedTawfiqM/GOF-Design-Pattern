package facade

class AuthToken(val appId: String,val  key: String) {

    override fun toString(): String {
        return "AuthToken"
    }
}
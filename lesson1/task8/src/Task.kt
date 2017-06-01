fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
){
    return mailer.sendMessage(client?.personalInfo?.email?:return,message?:return)
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
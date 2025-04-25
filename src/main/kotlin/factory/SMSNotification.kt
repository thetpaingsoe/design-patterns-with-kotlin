package factory

class SMSNotification : Notification {
    override fun notifyUser() : Boolean {
        println("SMS notification sent to user.")

        return true
    }
}
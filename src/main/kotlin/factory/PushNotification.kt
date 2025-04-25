package factory

class PushNotification : Notification {
    override fun notifyUser() : Boolean{
        println("Push notification sent to user.")

        return true
    }
}
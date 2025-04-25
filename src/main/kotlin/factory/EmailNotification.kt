package factory

class EmailNotification : Notification {
    override fun notifyUser() : Boolean {
        println("Email notification sent to user.")

        return true
    }
}
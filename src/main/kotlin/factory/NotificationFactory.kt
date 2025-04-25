package factory

enum class NotificationType { EMAIL, SMS, PUSH }

object NotificationFactory {
    fun createNotification(type: NotificationType) : Notification {
        return when(type) {
            NotificationType.SMS -> SMSNotification()
            NotificationType.PUSH -> PushNotification()
            NotificationType.EMAIL -> EmailNotification()
        }
    }
}
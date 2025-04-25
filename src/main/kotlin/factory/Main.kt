package factory

fun main() {
    val sms = NotificationFactory.createNotification(NotificationType.SMS)
    sms.notifyUser()

    val push = NotificationFactory.createNotification(NotificationType.PUSH)
    push.notifyUser()

    val email = NotificationFactory.createNotification(NotificationType.EMAIL)
    email.notifyUser()
}
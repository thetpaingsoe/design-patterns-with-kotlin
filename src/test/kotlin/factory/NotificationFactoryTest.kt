package factory

import kotlin.test.Test
import kotlin.test.assertIs
import kotlin.test.assertTrue

class NotificationFactoryTest {

    @Test
    fun `SMS Notification Test`() {
        val sms = NotificationFactory.createNotification(NotificationType.SMS)

        // Validate Class
        assertIs<SMSNotification>(sms)

        // Validate Function Execute till the End
        val returnStatus = sms.notifyUser()
        assertTrue { returnStatus }
    }

    @Test
    fun `Push Notification Test`() {
        val push = NotificationFactory.createNotification(NotificationType.PUSH)

        // Validate Class
        assertIs<PushNotification>(push)

        // Validate Function Execute till the End
        val returnStatus = push.notifyUser()
        assertTrue { returnStatus }

    }

    @Test
    fun `Email Notification Test`() {
        val email = NotificationFactory.createNotification(NotificationType.EMAIL)

        // Validate Class
        assertIs<EmailNotification>(email)

        // Validate Function Execute till the End
        val returnStatus = email.notifyUser()
        assertTrue { returnStatus }

    }
}
package strategy

import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Test
import kotlin.test.assertTrue

class PaymentStrategyTest {
    @Test
    fun `When strategy is credit card, it should pay with card`() {
        val payment = PaymentContext()
        payment.setPaymentStrategy(CreditCardPayment("1234-1234-1234-1234"))

        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        payment.pay(1000.0)

        val output = outputStream.toString().trim()
        assertTrue { output.contains("Pay 1000.0 with card number of 1234-1234-1234-1234") }
    }

    @Test
    fun `When strategy is Paypal, it should pay with paypal `() {
        val payment = PaymentContext()
        payment.setPaymentStrategy(PaypalPayment("abc@gmail.com"))

        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        payment.pay(100.0)

        val output = outputStream.toString().trim()
        assertTrue { output.contains("Pay 100.0 with Paypal : abc@gmail.com") }
    }

    @Test
    fun `When strategy is Google Pay, it should pay with google id`() {
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        val payment = PaymentContext()
        payment.setPaymentStrategy(GooglePayPayment("eesdeff-321aseFsd"))

        payment.pay(30.50)

        val output = outputStream.toString().trim()
        assertTrue { output.contains("Pay 30.5 with Google Pay : eesdeff-321aseFsd") }
    }

}
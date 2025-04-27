package adapter

import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Test
import kotlin.test.assertTrue

class OldPaymentSystemAdapterTest {

    @Test
    fun `Testing OldPaymentSystemAdapter` () {
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // Of course, we have to mock for the actual testing
        // But here, I will not do that.
        val oldPaymentSystem = OldPaymentSystem()
        val paymentProcessor: PaymentProcessor = OldPaymentSystemAdapter(oldPaymentSystem)

        paymentProcessor.pay(100.0)
        val output = outputStream.toString().trim()
        assertTrue { output.contains("Paid 100.0 using old payment system") }
    }
}
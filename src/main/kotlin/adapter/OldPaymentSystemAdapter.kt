package adapter

class OldPaymentSystemAdapter(private val oldPaymentSystem: OldPaymentSystem) : PaymentProcessor{
    override fun pay(dollar: Double) {
        oldPaymentSystem.makingPayment(dollar)
    }
}
package strategy

class PaypalPayment(private val email : String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Pay $amount with Paypal : $email")
    }
}
package strategy

class GooglePayPayment(private var googleId: String) : PaymentStrategy {
    override fun pay(amount : Double) {
        println("Pay $amount with Google Pay : $googleId")
    }
}
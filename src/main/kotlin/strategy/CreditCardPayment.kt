package strategy

class CreditCardPayment(private val cardNo: String) : PaymentStrategy{
    override fun pay(amount: Double) {
        println("Pay $amount with card number of $cardNo");
    }
}
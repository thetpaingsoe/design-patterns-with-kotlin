package strategy

class PaymentContext {
    private var strategy : PaymentStrategy? = null

    fun setPaymentStrategy(paymentStrategy: PaymentStrategy) {
        this.strategy = paymentStrategy
    }

    fun pay(amount: Double) {
        strategy?.pay(amount)
    }
}
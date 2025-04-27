package adapter

interface PaymentProcessor {
    fun pay(dollar: Double)
}
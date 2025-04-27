package adapter

fun main() {
    /**
     * ---------------------------------------------------------------------
     * Adapter Pattern
     * ---------------------------------------------------------------------
     * - Adapter make incompatible class work together
     * - Example : RecycleView.Adapter is technically an Adapter Pattern
     */

    val oldPaymentSystem = OldPaymentSystem();

    val paymentProcessor : PaymentProcessor = OldPaymentSystemAdapter(oldPaymentSystem);

    paymentProcessor.pay(100.0)

}
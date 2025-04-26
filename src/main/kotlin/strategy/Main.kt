package strategy

fun main() {

    val paymentContext = PaymentContext();
    paymentContext.setPaymentStrategy(CreditCardPayment("1234-1234-1234-1234"))
    paymentContext.pay(100.00)

    paymentContext.setPaymentStrategy(PaypalPayment("abc@gmail.com"))
    paymentContext.pay(120.50)

    paymentContext.setPaymentStrategy(GooglePayPayment("eesdeff-321aseFsd"))
    paymentContext.pay(2.50)

}
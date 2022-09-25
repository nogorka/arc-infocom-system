package chainofResponsibility

abstract class PaymentHandler {
    lateinit var successor: PaymentHandler
    abstract fun handle(receiver: Receiver)
}
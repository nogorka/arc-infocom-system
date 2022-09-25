package chainofResponsibility


class BankPaymentHandler : PaymentHandler() {

    override fun handle(receiver: Receiver) {
        if (receiver.bankTransfer)
            println("Выполняем банковский перевод");
        else
            if (successor != null)
                successor.handle(receiver);
    }
}

class MoneyPaymentHandler : PaymentHandler() {

    override fun handle(receiver: Receiver) {
        if (receiver.bankTransfer)
            println("Выполняем перевод через системы денежных переводов");
        else
            if (successor != null)
                successor.handle(receiver);
    }
}

class PayPalPaymentHandler : PaymentHandler() {

    override fun handle(receiver: Receiver) {
        if (receiver.payPalTransfer)
            println("Выполняем перевод через paypal")
        else
            if (successor != null)
                successor.handle(receiver)
    }
}
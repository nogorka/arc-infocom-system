package chainofResponsibility

class Receiver(
    var bankTransfer: Boolean,
    var moneyTransfer: Boolean,
    var payPalTransfer: Boolean
) {

}
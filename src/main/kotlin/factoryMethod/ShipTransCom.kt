package factoryMethod

class ShipTransCom(name: String) : TransportCompany(name) {
    override fun create(n: String, t: Int): TransportService {
        return Shipping(name, t);
    }
}
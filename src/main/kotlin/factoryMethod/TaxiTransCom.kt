package factoryMethod

class TaxiTransCom(name: String) : TransportCompany(name) {
    override fun create(n: String, c: Int): TransportService {
        return TaxiServices(name, c);
    }
}
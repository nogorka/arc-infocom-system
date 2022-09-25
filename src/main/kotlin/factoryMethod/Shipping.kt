package factoryMethod

class Shipping(name: String, var tariff: Int) : TransportService(name) {
    override fun costTransportation(distance: Double): Double {
        return distance * tariff;
    }

    override fun toString(): String {
        return "Фирма ${name}, доставка по тарифу ${tariff}"
    }
}
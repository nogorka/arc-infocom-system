package factoryMethod

class TaxiServices(name: String, var category: Int) : TransportService(name) {

    override fun costTransportation(distance: Double): Double {
        return distance * category
    }

    override fun toString(): String {
        return String.format("Фирма %s, поездка категории %s", name, category)
    }
}
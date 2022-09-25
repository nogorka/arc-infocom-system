package factoryMethod

class Moving(name: String, var Time: Int) : TransportService(name) {
    override fun costTransportation(distance: Double): Double {
        return distance * Time ;
    }

    override fun toString(): String {
        return "Фирма ${name}, поездка в течении ${Time} минут"
    }
}
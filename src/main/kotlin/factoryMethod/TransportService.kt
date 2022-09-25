package factoryMethod

abstract class TransportService(val name: String) {
    abstract fun costTransportation(distance: Double): Double
}
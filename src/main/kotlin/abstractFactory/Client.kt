package abstractFactory

class Client() {
    private lateinit var abstractCar: AbstractCar
    private lateinit var abstractEngine: AbstractEngine

    constructor (car_factory: CarFactory) : this() {
        abstractCar = car_factory.createCar()
        abstractEngine = car_factory.createEngine()
    }

    fun runMaxSpeed(): Int {
        return abstractCar.maxSpeed(abstractEngine)
    }

    override fun toString(): String {
        return abstractCar.toString()
    }

    // клиент возвращает тип кузова
    fun showBodyType(): String {
        return abstractCar.bodyType
    }
}

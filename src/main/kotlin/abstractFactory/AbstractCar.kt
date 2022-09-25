package abstractFactory

abstract class AbstractCar {
    open val name: String
        get() {
            TODO()
        }

    // новое свойство тип кузова
    open val bodyType: String
        get() {
            TODO()
        }

    abstract fun maxSpeed(engine: AbstractEngine): Int
}
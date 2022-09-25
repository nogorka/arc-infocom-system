package abstractFactory

abstract class CarFactory {
    abstract fun createCar(): AbstractCar
    abstract fun createEngine(): AbstractEngine
}
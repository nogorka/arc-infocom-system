package abstractFactory

class AudiCar(override val name: String, override val bodyType: String) : AbstractCar() {

    override fun maxSpeed(engine: AbstractEngine): Int {
        return engine.maxSpeed;
    }

    override fun toString(): String {
        return "Автомобиль $name";
    }
}
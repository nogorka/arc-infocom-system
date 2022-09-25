package abstractFactory

class AudiFactory : CarFactory() {
    override fun createCar(): AbstractCar {
        return AudiCar("Ауди", "Кроссовер")
    }

    override fun createEngine(): AbstractEngine {
        return AudiEngine()
    }
}



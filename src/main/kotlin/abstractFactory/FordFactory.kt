package abstractFactory

class FordFactory :CarFactory(){
    override fun createCar(): AbstractCar {
        return FordCar("Форд", "Седан")
    }

    override fun createEngine(): AbstractEngine {
        return FordEngine()
    }
}
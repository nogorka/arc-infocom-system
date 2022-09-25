package decorator

class Audi(
    override var name: String,
    override var description: String,
    override var costBase: Double
) : AutoBase(name, description, costBase) {

    override fun getCost(): Double {
        return costBase * 2;
    }
}
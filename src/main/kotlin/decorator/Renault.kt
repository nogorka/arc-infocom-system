package decorator

class Renault(
    override var name: String,
    override var description: String,
    override var costBase: Double
) : AutoBase(name, description, costBase) {

    override fun getCost(): Double {
        return costBase * 1.18;
    }

}
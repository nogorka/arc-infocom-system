package decorator

abstract class AutoBase(
    open var name: String,
    open var description: String,
    open var costBase: Double
) {
    abstract fun getCost(): Double

    override fun toString(): String {
        return "Ваш автомобиль: \n$name \nОписание: $description \nСтоимость ${getCost()}\n"
    }
}
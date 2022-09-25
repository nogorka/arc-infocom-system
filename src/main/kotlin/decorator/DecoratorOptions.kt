package decorator

open class DecoratorOptions(val autoProperty: AutoBase, val title: String) :
    AutoBase(autoProperty.name, autoProperty.description, autoProperty.costBase) {
    override fun getCost(): Double {
        TODO("Not yet implemented")
    }
}
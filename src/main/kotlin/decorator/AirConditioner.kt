package decorator

class AirConditioner(autoProperty: AutoBase, title: String) : DecoratorOptions(autoProperty, title) {
    override fun getCost(): Double {
        return autoProperty.getCost() + 50.99;
    }
}
package decorator

class FastHeating(autoProperty: AutoBase, title: String) : DecoratorOptions(autoProperty, title) {
    override fun getCost(): Double {
        return autoProperty.getCost() + 10.99;
    }
}
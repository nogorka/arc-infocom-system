package decorator

class SystemSecurity(autoProperty: AutoBase, title: String) : DecoratorOptions(autoProperty, title) {
    override fun getCost(): Double {
        return autoProperty.getCost() + 20.99;
    }
}
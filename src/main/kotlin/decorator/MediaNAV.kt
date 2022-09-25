package decorator

class MediaNAV(autoProperty: AutoBase, title: String) : DecoratorOptions(autoProperty, title) {

    override fun getCost(): Double {
        return autoProperty.getCost() + 15.99;
    }
}
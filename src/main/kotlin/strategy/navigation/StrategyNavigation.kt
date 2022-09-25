package strategy.navigation

abstract class StrategyNavigation {
    abstract fun getMap(): String
    abstract fun getSearch(): String
    abstract fun getRoute(): String
}
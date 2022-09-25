package strategy.navigation

class AutoRoute : StrategyNavigation() {
    override fun getMap(): String {
        return "It's map for autoroute"
    }

    override fun getSearch(): String {
        return "It's search for autoroute"
    }

    override fun getRoute(): String {
        return "It's route for autoroute"
    }
}
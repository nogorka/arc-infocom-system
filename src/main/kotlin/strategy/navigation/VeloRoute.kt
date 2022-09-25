package strategy.navigation

class VeloRoute() : StrategyNavigation() {
    override fun getMap(): String {
        return "It's map for veloroute"
    }

    override fun getSearch(): String {
        return "It's search for veloroute"
    }

    override fun getRoute(): String {
        return "It's route for veloroute"
    }
}
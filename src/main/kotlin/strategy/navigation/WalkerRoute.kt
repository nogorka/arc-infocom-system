package strategy.navigation

class WalkerRoute : StrategyNavigation() {

    override fun getMap(): String {
        return "It's map for walker route"
    }

    override fun getSearch(): String {
        return "It's search for walker route"
    }

    override fun getRoute(): String {
        return "It's route for walker route"
    }
}
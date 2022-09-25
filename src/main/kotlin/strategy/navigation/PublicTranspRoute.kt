package strategy.navigation

class PublicTranspRoute : StrategyNavigation() {

    override fun getMap(): String {
        return "It's map for public transport route"
    }

    override fun getSearch(): String {
        return "It's search for public transport route"
    }

    override fun getRoute(): String {
        return "It's route for public transport route"
    }
}
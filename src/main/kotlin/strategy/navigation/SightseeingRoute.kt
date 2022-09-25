package strategy.navigation

class SightseeingRoute : StrategyNavigation() {

    override fun getMap(): String {
        return "It's map for sightseeing route"
    }

    override fun getSearch(): String {
        return "It's search for sightseeing route"
    }

    override fun getRoute(): String {
        return "It's route for sightseeing route"
    }
}
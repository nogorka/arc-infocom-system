package adapter.game

class Gamer(val name: String) {
    override fun toString(): String {
        return name
    }

    fun seansGame(ig: IGame): Int {
        return ig.brosok()
    }
}
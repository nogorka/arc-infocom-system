package adapter.game;

class AdapterGame(var mot: Monet) : IGame {
    override fun brosok(): Int {
        return mot.brosokM();
    }
}

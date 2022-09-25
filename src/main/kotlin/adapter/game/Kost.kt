package adapter.game

import java.util.*

class Kost : IGame {
    var r: Random = Random()

    override fun brosok(): Int {
        // Случайное число от 1 до 6.
        return r.nextInt(6) + 1;
    }
}
package adapter.game

import java.util.*

class Monet {
    var r: Random = Random()

    fun brosokM(): Int {
        //Случаное число 1 или 2.
        return r.nextInt(2) + 1
    }
}
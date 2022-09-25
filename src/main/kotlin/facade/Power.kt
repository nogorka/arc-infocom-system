package facade

import java.beans.EventHandler

class Power {
    lateinit var powerevent: EventHandler
    private val _power = 0
    var microwavePower = 0

    fun setMicropower(power: Int) {
        microwavePower = power
        println("Задана мощность $microwavePower")
    }
}
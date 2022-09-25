package facade

import java.beans.EventHandler

class Drive {
    lateinit var driveEvent: EventHandler
    private var twist: String

    init {
        println("исходная позиция".also { twist = it })
    }

    fun turnLeft() {
        println("Поверот налево".also { twist = it })
    }

    fun turnRight() {
        println("Поверот направо".also { twist = it })
    }

    fun stop() {
        println("Стоп".also { twist = it })
    }

    override fun toString(): String {
        return "Привод: $twist"
    }
}
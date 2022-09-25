package facade

import java.beans.EventHandler

class Notification {
    lateinit var notificationEvent: EventHandler
    private  var mess: String = ""
        get() {
            TODO()
        }
        set(value) {
            field = value

            //if (notificationEvent != null) notificationEvent(this, EventArgs())
        }

    fun startNotification() {
        println("Операция началась".also { mess = it })
    }

    fun stopNotification() {
        println("Операция завершена".also { mess = it })
    }

    override fun toString(): String {
        return "Информация: mess"
    }
}
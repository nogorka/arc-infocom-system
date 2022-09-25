package facade

class Microwave(
    private val _drive: Drive,
    private val _power: Power,
    private val _notification: Notification
) {
    fun defrost() {
        _notification.startNotification()
        _power.microwavePower = 1000
        _drive.turnRight()
        _drive.turnRight()
        _power.microwavePower = 500
        _drive.stop()
        _drive.turnLeft()
        _drive.turnLeft()
        _power.microwavePower = 200
        _drive.stop()
        _drive.turnRight()
        _drive.turnRight()
        _drive.stop()
        _power.microwavePower = 0
        _notification.stopNotification()
    }

    fun cook() {
        _notification.startNotification()
        _power.microwavePower = 0
        _drive.turnRight()
        _drive.turnRight()
        _power.microwavePower = 500
        _drive.stop()

        _drive.turnRight()
        _drive.turnRight()
        _power.microwavePower = 200
        _drive.stop()

        _drive.turnLeft()
        _drive.turnRight()
        _drive.stop()

        _power.microwavePower = 0
        _notification.stopNotification()
    }
}
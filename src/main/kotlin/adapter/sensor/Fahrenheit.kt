package adapter.sensor

class Fahrenheit : ISensor {
    var temp: Float = 0.0f

    fun setValue(value: Float) {
        temp = value
    }

    override fun measure(): Float {
        return temp
    }
}
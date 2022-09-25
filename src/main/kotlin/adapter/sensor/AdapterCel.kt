package adapter.sensor

class AdapterCel(var fahrenheit: Fahrenheit) : ISensor {
    override fun measure(): Float {
        return (fahrenheit.measure() - 32) / 9 * 5
    }
}
package strategy.sort

class Context(val strategy: StrategySort, val array: IntArray) {
    fun sort() {
        strategy.sort(array)
    }

    fun printArray() {
        println(strategy.toString())
        for (element in array)
            println("$element ")
        println()
    }
}
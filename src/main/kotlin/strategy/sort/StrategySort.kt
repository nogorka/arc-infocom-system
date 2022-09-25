package strategy.sort

abstract class StrategySort() {
    open val title: String
        get() {
            TODO()
        }


    abstract fun sort(array: IntArray)
}
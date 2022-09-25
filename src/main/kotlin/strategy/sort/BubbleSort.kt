package strategy.sort

class BubbleSort(override val title: String = "Пузырьковая сортировка") : StrategySort() {
    override fun toString(): String {
        return title
    }

    override fun sort(array: IntArray) {
        var hasSwap = true
        while (hasSwap) {

            hasSwap = false
            for (i in 0 until array.indices.last) {
                if (array[i] > array[i + 1]) {
                    val temp = array[i]
                    array[i] = array[i + 1]
                    array[i + 1] = temp

                    hasSwap = true
                }
            }
        }
    }
}
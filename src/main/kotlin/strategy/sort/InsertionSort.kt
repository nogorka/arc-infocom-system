package strategy.sort

class InsertionSort(override val title: String = "Сортировка вставками") : StrategySort() {
    override fun toString(): String {
        return title
    }

    override fun sort(array: IntArray) {

        for (i in 1 until array.size) {
            var j = 0
            val buffer = array[i]
            j = i - 1
            while (j >= 0) {
                if (array[j] < buffer) break
                array[j + 1] = array[j]
                j--
            }
            array[j + 1] = buffer
        }
    }
}
package strategy.sort

class SelectionSort(override val title: String = "Сортировка выбором") : StrategySort() {
    override fun toString(): String {
        return title
    }

    override fun sort(array: IntArray) {

        for (i in 0 until array.size - 1) {
            var k = i
            for (j in i + 1 until array.size) {
                if (array[k] > array[j])
                    k = j
            }
            if (k != i) {
                val temp = array[k]
                array[k] = array[i]
                array[i] = temp
            }
        }
    }
}
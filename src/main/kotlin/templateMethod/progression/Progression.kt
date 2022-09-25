package templateMethod.progression

abstract class Progression(
    var first: Int,
    var last: Int,
    var h: Int
) {

    var progList: MutableList<Int> = ArrayList()
    abstract fun progress()


    fun print(progList: List<Int>) {
        println("Последовательность:");
        for (item in progList) {
            print(" $item");
        }
        println();
    }

    fun initializeProgression(a: Int, b: Int, hh: Int) {
        first = a;
        last = b;
        h = hh;
    }


    fun templateMethod() {
        initializeProgression(first, last, h)
        progress()
        print(progList)
    }
}

package templateMethod.progression

class ArithmeticProgression(first: Int, last: Int, h: Int) : Progression(first, last, h) {
    override fun progress() {
        var fF: Int = first
        do {
            progList.add(fF)
            fF += h
        } while (fF < last)
    }
}
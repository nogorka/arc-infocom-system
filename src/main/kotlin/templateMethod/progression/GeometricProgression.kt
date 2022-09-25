package templateMethod.progression

class GeometricProgression(first: Int, last: Int, h: Int) : Progression(first, last, h) {
    override fun progress() {
        var fF: Int = first
        do {
            progList.add(fF)
            fF *= h
        } while (fF < last)
    }
}
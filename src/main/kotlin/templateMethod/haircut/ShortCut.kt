package templateMethod.haircut

class ShortCut() : Haircut() {
    override fun cutHair() {
        println("And now the magic starts - client will be happy with new short cut")
    }
}
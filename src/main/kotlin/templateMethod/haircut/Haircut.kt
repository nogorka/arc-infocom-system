package templateMethod.haircut

abstract class Haircut() {
    fun washHair() {
        println("First of all we should check if hair needs to be washed")
    }
    abstract fun cutHair()
    fun combHair() {
        println("After all hair requires combing")
    }
    fun dryHair() {
        println("And last touch is drying. Voila")
    }

    fun templateMethod(){
        washHair()
        cutHair()
        combHair()
        dryHair()
    }
}
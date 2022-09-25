package command

class ArithmeticUnit {
    var register: Double = 0.0

    fun run(operationCode: Char, operand: Double) {
        when (operationCode) {
            '+' -> register += operand
            '-' -> register -= operand
            '*' -> register *= operand
            '/' -> register /= operand
        }
    }
}

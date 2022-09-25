package singleton

class Operation {

    fun run(operationCode: Char, operand: Int): Double {
        val lg2 = Log
        var rez = 0.0
        when (operationCode) {
            '+' -> {
                rez += operand
                lg2?.logExecution("Сложение $operand")
            }
            '-' -> {
                rez -= operand
                lg2?.logExecution("Вычитание $operand")
            }
            '*' -> rez *= operand
            '/', ':' -> rez /= operand
        }
        return rez
    }
}


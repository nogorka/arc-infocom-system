package command

class Calculator(
    var arithmeticUnit: ArithmeticUnit = ArithmeticUnit(),
    var controlUnit: ControlUnit = ControlUnit()
) {


    private fun run(command: Command): Double {
        controlUnit.storeCommand(command)
        controlUnit.executeCommand()
        return arithmeticUnit.register
    }

    fun add(operand: Double): Double {
        return run(ConcreteCommand.Add(arithmeticUnit, operand))
    }

    fun subtraction(operand: Double): Double {
        return run(ConcreteCommand.Subtraction(arithmeticUnit, operand))
    }

    fun multiply(operand: Double): Double {
        return run(ConcreteCommand.Multiply(arithmeticUnit, operand))
    }

    fun division(operand: Double): Double {
        return run(ConcreteCommand.Division(arithmeticUnit, operand))
    }

}
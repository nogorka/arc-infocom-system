package command

class ConcreteCommand {
    class Add(override var unit: ArithmeticUnit?, override var operand: Double) : Command() {
        override fun execute() {
            unit!!.run('+', operand)
        }
        override fun unExecute() {
            unit!!.run('-', operand)
        }
    }

    class Subtraction(override var unit: ArithmeticUnit?, override var operand: Double) : Command() {
        override fun execute() {
            unit!!.run('-', operand)
        }
        override fun unExecute() {
            unit!!.run('+', operand)
        }
    }

    class Multiply(override var unit: ArithmeticUnit?, override var operand: Double) : Command() {
        override fun execute() {
            unit!!.run('*', operand)
        }
        override fun unExecute() {
            unit!!.run('/', operand)
        }
    }

    class Division(override var unit: ArithmeticUnit?, override var operand: Double) : Command() {
        override fun execute() {
            unit!!.run('/', operand)
        }
        override fun unExecute() {
            unit!!.run('*', operand)
        }
    }
}
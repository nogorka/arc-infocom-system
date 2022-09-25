package command

abstract class Command {
    protected open var unit: ArithmeticUnit? = null
    protected open var operand = 0.0

    abstract fun execute()
    abstract fun unExecute()
}
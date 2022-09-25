package command


class ControlUnit {
    private val commands: MutableList<Command> = ArrayList()
    private var current: Int = 0

    fun storeCommand(command: Command) {
        commands.add(command) // добавление в массив команд
    }

    fun executeCommand() {
        commands[current].execute()
        current++
    }

    fun undo() {
        commands[current - 1].unExecute()
    }

    fun undo(i: Int) {
        if (i > current) {
            throw RuntimeException()
        }
        commands[current - i].unExecute()
    }

    fun redo() {
        commands[current - 1].execute()
    }

    fun redo(i: Int) {
        if (i > current) {
            throw RuntimeException()
        }
        commands[current - i].execute()
    }
}
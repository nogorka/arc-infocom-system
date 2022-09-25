package singleton

import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.time.LocalDateTime
import java.util.*


object Log {
    fun logExecution(mes: String?) {
        val file = File("src/main/kotlin/log.txt")
        try {
            FileWriter(file, true).use { writer -> loger(mes!!, writer) }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }


    @Throws(IOException::class)
    private fun loger(logMessage: String, w: FileWriter) {
        w.write("\r\nLog Entry : ")
        w.write(LocalDateTime.now().toLocalDate().toString())
        w.write(LocalDateTime.now().toLocalTime().toString())
        w.write(String.format(" Действие: %s", logMessage))
        w.write("-------------------------------")
        w.flush()
    }
}


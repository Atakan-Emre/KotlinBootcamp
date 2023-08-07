import javax.swing.text.View

fun main() {
    startThread()
}


fun startThread() {
    for (i in 0 until 10) {
        try {
            println("start Thread: $i")

        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
}
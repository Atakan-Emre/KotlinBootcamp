fun main() {

    val manager = Manager()
    val officer = Officer()

    manager.calculatePayment()
    officer.calculatePayment()

}

interface Worker {
    fun calculatePayment()
}

class Manager : Worker {
    override fun calculatePayment() {
        println("Manager")
    }
}

class Officer : Worker {
    override fun calculatePayment() {
        println("Employee")
    }
}
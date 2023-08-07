import kotlin.concurrent.thread

fun main() {
    val numbers = arrayOf(10, 4, 7, 23, 18, 3, 14, 5, 9)


    val maxThread = thread {
        var maxNumber = Int.MIN_VALUE
        for (number in numbers) {
            if (number > maxNumber) {
                maxNumber = number
            }
        }
        println("En büyük sayı: $maxNumber")
    }


    val minThread = thread {
        var minNumber = Int.MAX_VALUE
        for (number in numbers) {
            if (number < minNumber) {
                minNumber = number
            }
        }
        println("En küçük sayı: $minNumber")
    }
    maxThread.join()
    minThread.join()
}



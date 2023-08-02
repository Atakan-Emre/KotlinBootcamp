import kotlin.concurrent.thread

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    val midIndex = numbers.size / 2
    var sum1 = 0
    var sum2 = 0

    // İlk yarıyı toplayan thread
    val thread1 = thread {
        for (i in 0 until midIndex) {
            sum1 += numbers[i]
        }
    }

    // İkinci yarıyı toplayan thread
    val thread2 = thread {
        for (i in midIndex until numbers.size) {
            sum2 += numbers[i]
        }
    }

    // İki thread'in de tamamlanmasını bekler
    thread1.join()
    thread2.join()

    // İki yarıyı toplar
    val totalSum = sum1 + sum2

    println("Toplam: $totalSum") // Çıktı: Toplam: 36
}

/*

import kotlin.concurrent.thread

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)

    var sum1: Int = 0
    var sum2: Int = 0

    // İlk yarıyı toplayan thread
    val thread1 = thread {
        sum1 = numbers.sliceArray(0 until numbers.size / 2).sum()
    }

    // İkinci yarıyı toplayan thread
    val thread2 = thread {
        sum2 = numbers.sliceArray(numbers.size / 2 until numbers.size).sum()
    }

    // İki thread'in de tamamlanmasını bekler
    thread1.join()
    thread2.join()

    // İki yarıyı toplar
    val totalSum = sum1 + sum2

    println("Toplam: $totalSum")
}


*/
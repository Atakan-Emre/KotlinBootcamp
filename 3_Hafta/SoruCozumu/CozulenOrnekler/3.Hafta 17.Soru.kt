fun main() {

    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val halfSize = numberList.size / 2

    var totalSum = 0

    val thread1 = Thread {
        // İlk yarıdaki sayıları topla
        for (i in 0 until halfSize) {
            totalSum += numberList[i]
        }
    }

    val thread2 = Thread {
        // İkinci yarıdaki sayıları topla
        for (i in halfSize until numberList.size) {
            totalSum += numberList[i]
        }
    }

    thread1.run {
        start()
        join()
    }

    thread2.run {
        start()
        join()
    }


    println("Toplam: $totalSum")
}


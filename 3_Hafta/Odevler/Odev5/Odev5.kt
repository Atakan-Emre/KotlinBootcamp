fun main() {
    println("Ana thread basliyor...")

    val thread1 = Thread {
        println("Thread 1 basliyor...")
        Thread.sleep(5000) // 5 saniye uyuyacak
        println("Thread 1 bitiyor...")
    }

    val thread2 = Thread {
        println("Thread 2 basliyor...")
        Thread.sleep(3000) // 3 saniye uyuyacak
        println("Thread 2 bitiyor...")
    }

    thread1.start()
    thread2.start()

    println("Ana thread diger threadlerin çalismasini bekliyor...")
    Thread.sleep(6000) // Ana thread 6 saniye uyuyacak

    println("Ana thread bitiyor...")
}

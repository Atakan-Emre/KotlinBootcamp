import kotlin.random.Random

fun main() {
    val maxGuessAttempts = 6
    val targetNumber = Random.nextInt(1, 101)

    println("1 ile 100 arasinda bir sayiyi tahmin et. Toplam $maxGuessAttempts hakkin var.")

    for (guessCount in 1..maxGuessAttempts) {
        print("Tahmininizi girin: ")
        val userGuess = readLine()?.toIntOrNull()

        if (userGuess == null) {
            println("Gecersiz giris. Lütfen bir sayi girin.")
            continue
        }

        if (userGuess == targetNumber) {
            println("Tebrikler! Dogru tahmin ettiniz. Hedeflenen sayi: $targetNumber")
            return
        } else if (userGuess < targetNumber) {
            println("Daha yuksek bir sayi girin.")
        } else {
            println("Daha dusuk bir sayi girin.")
        }
    }

    println("Uzgunum, hakkiniz bitti. Hedeflenen sayi: $targetNumber")
}

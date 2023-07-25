fun faktoriyel(sayi: Int): Long {
    return if (sayi <= 1) {
        1
    } else {
        var sonuc: Long = 1
        for (i in 2..sayi) {
            sonuc *= i
        }
        sonuc
    }
}

fun main() {
    print("Faktoriyelini hesaplamak istediginiz sayiyi girin: ")
    val userInput = readLine()?.toIntOrNull()

    if (userInput != null) {
        val sonuc = faktoriyel(userInput)
        println("$userInput! = $sonuc")
    } else {
        println("Gecersiz giris. Lütfen bir sayi girin.")
    }
}


import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val nameList = arrayListOf("ahmet", "mehmet", "ayse", "feyza", "emir")
    println("Mevcut liste: $nameList")

    try {
        print("Guncellemek istediginiz ismin indeksini girin (0-${nameList.size - 1}): ")
        val index = scanner.nextInt()

        if (index >= 0 && index < nameList.size) {
            print("Yeni ismi girin: ")
            val newName = scanner.next()

            updateNameAtIndex(nameList, index, newName)

            println("Guncellenmis liste: $nameList")
        } else {
            println("Gecersiz indeks numarasi girdiniz.")
        }
    } catch (e: InputMismatchException) {
        println("Gecersiz giris. Lütfen bir sayi girin.")
    }
}

fun updateNameAtIndex(nameList: ArrayList<String>, index: Int, newName: String) {
    if (index >= 0 && index < nameList.size) {
        nameList[index] = newName
    } else {
        println("Gecersiz indeks numarasi.")
    }
}

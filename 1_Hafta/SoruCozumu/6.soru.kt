fun main() {
    print("Bir ay ismi giriniz: ")
    val ayIsmi = readLine()?.toLowerCase()

    val mevsim = if (ayIsmi in listOf("aralık", "ocak", "subat")) {
        "Kis"
    } else if (ayIsmi in listOf("mart", "nisan", "mayis")) {
        "Ilkbahar"
    } else if (ayIsmi in listOf("haziran", "temmuz", "agustos")) {
        "Yaz"
    } else if (ayIsmi in listOf("eylul", "ekim", "kasim")) {
        "Sonbahar"
    } else {
        "Gecersiz ay ismi"
    }

    println("$ayIsmi ayı $mevsim mevsimine aittir.")
}
n
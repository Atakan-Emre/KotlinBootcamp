import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Bir kelime giriniz: ")
    val girdi = scanner.next()
    println("Sesli harfler cikarildiktan sonra: ${sesliHarfleriKaldir(girdi)}")
}

fun sesliHarfleriKaldir(metin: String): String {
    val sesliHarfler = "aeiouAEIOU"
    return metin.filter { it !in sesliHarfler }
}
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Sayiyi giriniz: ")
    val sayi = scanner.nextInt()
    println("$sayi! = ${faktoriyelHesapla(sayi)}")
}

fun faktoriyelHesapla(sayi: Int): Int {
    return if (sayi == 0 || sayi == 1) {
        1
    } else {
        sayi * faktoriyelHesapla(sayi - 1)
    }
}
class Dikdortgen(val uzunluk: Double, val genislik: Double) {
    fun alanHesapla(): Double {
        return uzunluk * genislik
    }

    fun cevreHesapla(): Double {
        return 2 * (uzunluk + genislik)
    }
}

fun main() {
    val dikdortgen = Dikdortgen(5.0, 3.0)
    val alan = dikdortgen.alanHesapla()
    val cevre = dikdortgen.cevreHesapla()

    println("Dikdortgenin Alani: $alan")
    println("Dikdortgenin Cevresi: $cevre")
}

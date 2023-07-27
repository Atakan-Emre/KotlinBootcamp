fun main() {
    val dikdortgen = Dikdortgen(5.0, 4.0)
    println("Dikdörtgenin alanı: ${dikdortgen.alanHesapla()}")
    println("Dikdörtgenin çevresi: ${dikdortgen.cevreHesapla()}")

    val daire = Daire(3.0)
    println("Dairenin alanı: ${daire.alanHesapla()}")
    println("Dairenin çevresi: ${daire.cevreHesapla()}")
}

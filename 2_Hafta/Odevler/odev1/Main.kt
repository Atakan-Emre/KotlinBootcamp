fun main() {
    println("Dikdörtgenin uzunlugunu girin:")
    val dikdortgenUzunluk = readLine()?.toDouble() ?: 0.0

    println("Dikdörtgenin genisligini girin:")
    val dikdortgenGenislik = readLine()?.toDouble() ?: 0.0

    val dikdortgen = Dikdortgen(dikdortgenUzunluk, dikdortgenGenislik)
    println("Dikdörtgenin alanı: ${dikdortgen.alanHesapla()}")
    println("Dikdörtgenin cevresi: ${dikdortgen.cevreHesapla()}")

    println("Dairenin yaricapini girin:")
    val daireYaricap = readLine()?.toDouble() ?: 0.0

    val daire = Daire(daireYaricap)
    println("Dairenin alani: %.2f".format(daire.alanHesapla()))
    println("Dairenin cevresi: %.2f".format(daire.cevreHesapla()))
}

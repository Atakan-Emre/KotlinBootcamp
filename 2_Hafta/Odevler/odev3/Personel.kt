class Personel(
    var ad: String,
    var soyad: String,
    var pozisyon: String,
    var maas: Double
) {
    fun maasArttir(artisMiktari: Double) {
        maas += artisMiktari
        println("$ad $soyad kişisinin maaşı $artisMiktari kadar arttırıldı. Yeni maaş: $maas")
    }

    fun bilgileriGoster() {
        println("Adı: $ad")
        println("Soyadı: $soyad")
        println("Pozisyonu: $pozisyon")
        println("Maaşı: $maas")
    }
}

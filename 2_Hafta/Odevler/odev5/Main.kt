fun main() {
    val kullanici = Kullanici(null, null)

    val ad = kullanici.ad ?: "Ad bilgisi yok" // eğer ad null ise, "Ad bilgisi yok" değerini döndürür
    val soyad = kullanici.soyad ?: "Soyad bilgisi yok" // eğer soyad null ise, "Soyad bilgisi yok" değerini döndürür

    println(ad) // Ad bilgisi yok
    println(soyad) // Soyad bilgisi yok
}

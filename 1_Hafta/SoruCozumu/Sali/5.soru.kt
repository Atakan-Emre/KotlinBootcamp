class Ogrenci(val ad: String, val soyad: String, val sinif: String)

fun main() {
    val ogrenci1 = Ogrenci("Ali", "Yilmaz", "10-A")
    val ogrenci2 = Ogrenci("Ayse", "Kara", "9-B")
    val ogrenci3 = Ogrenci("Mehmet", "Demir", "11-C")
    val ogrenci4 = Ogrenci("Fatma", "Yildiz", "12-D")
    val ogrenci5 = Ogrenci("Ahmet", "Can", "8-E")

    yazdir(ogrenci1)
    yazdir(ogrenci2)
    yazdir(ogrenci3)
    yazdir(ogrenci4)
    yazdir(ogrenci5)
}

fun yazdir(ogrenci: Ogrenci) {
    println("Ad: ${ogrenci.ad}")
    println("Soyad: ${ogrenci.soyad}")
    println("Sınıf: ${ogrenci.sinif}")
    println("--------------")
}

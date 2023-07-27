fun main() {
    val personel1 = Personel("Ahmet", "Yılmaz", "Müdür", 10000.0)
    personel1.bilgileriGoster()

    personel1.maasArttir(2000.0)
    personel1.bilgileriGoster()
}
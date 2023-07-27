class Basketbolcu(isim: String, yas: Int, val pozisyon: String) : Oyuncu(isim, yas) {
    override fun oyna() {
        println("$isim, $pozisyon pozisyonunda basketbol oynuyor.")
    }
}
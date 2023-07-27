class Futbolcu(isim: String, yas: Int, val mevki: String) : Oyuncu(isim, yas) {
    override fun oyna() {
        println("$isim, $mevki mevkinde futbol oynuyor.")
    }
}
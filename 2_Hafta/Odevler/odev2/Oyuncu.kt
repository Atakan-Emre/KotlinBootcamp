open class Oyuncu(val isim: String, val yas: Int) {
    open fun oyna() {
        println("$isim oynuyor.")
    }
}
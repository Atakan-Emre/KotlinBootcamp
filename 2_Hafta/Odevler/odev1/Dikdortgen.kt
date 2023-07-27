class Dikdortgen(val uzunluk: Double, val genislik: Double): GeometrikSekil() {
    override fun alanHesapla(): Double {
        return uzunluk * genislik
    }

    override fun cevreHesapla(): Double {
        return 2 * (uzunluk + genislik)
    }
}

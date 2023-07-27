class Daire(val yaricap: Double) : GeometrikSekil() {
    override fun alanHesapla(): Double {
        return Math.PI * yaricap * yaricap
    }

    override fun cevreHesapla(): Double {
        return 2 * Math.PI * yaricap
    }
}

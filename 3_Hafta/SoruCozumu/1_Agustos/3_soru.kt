fun birlestirVeSirala(l1: List<Int>, l2: List<Int>) = (l1 + l2).sorted()

fun main() {
    val l1 = listOf(5, 2, 8)
    val l2 = listOf(1, 6, 3)
    
    val s = birlestirVeSirala(l1, l2)
    println("Sonuç: $s")
}


/*
fun birlestirVeSirala(liste1: List<Int>, liste2: List<Int>): List<Int> {
    val birlesikListe = liste1 + liste2 // İki listeyi birleştiriyoruz
    return birlesikListe.sorted() // Birleşik listeyi sıralıyoruz
}

fun main() {
    val liste1 = listOf(5, 2, 8)
    val liste2 = listOf(1, 6, 3)
    
    val sonuc = birlestirVeSirala(liste1, liste2)
    println("Birleştirilmiş ve sıralanmış liste: $sonuc")
}

*/
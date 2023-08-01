fun elemanlariCikar(set1: Set<Int>, set2: Set<Int>): Set<Int> {
    return set1.union(set2).subtract(set2)
}

fun main() {
    val set1 = setOf(1, 2, 3, 4, 5)
    val set2 = setOf(4, 5, 6)
    val sonuc = elemanlariCikar(set1, set2)
    println("Sonuc: $sonuc")
}


/*

fun main() {
    val set1 = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val set2 = setOf(1, 2, 3, 4, 5)
    differenceSetOf(set1, set2)
}

private fun differenceSetOf(set1: Set<Int>, set2: Set<Int>) {
    println(set1.minus(set2))
}


*/
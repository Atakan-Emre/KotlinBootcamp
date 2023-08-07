fun main() {

    val set1 = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val set2 = setOf(1, 2, 3, 4, 5)

    differanceSetOf(set1, set2)
}

private fun differanceSetOf(set1: Set<Int>, set2: Set<Int>) {
    println(set1.minus(set2))
}
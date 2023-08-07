fun main() {
    val hashSet = hashSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

    println(isSelectedContains(4, hashSet))
    println(isSelectedContains(-1, hashSet))

}

private fun isSelectedContains(selected: Int, hashSet: HashSet<Int>): Boolean {
    return selected in hashSet
}
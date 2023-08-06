fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3, 4, 5, 6)
    repeatativeIndividuals(list).forEach { println(it) }
}

private fun repeatativeIndividuals(list: List<Any>): HashSet<Any> {
    val uniqueList = HashSet<Any>()
    val repeatativeList = HashSet<Any>()

    list.forEach { number ->
        if (!uniqueList.add(number)) {
            repeatativeList.add(number)
        }
    }
    return repeatativeList
}
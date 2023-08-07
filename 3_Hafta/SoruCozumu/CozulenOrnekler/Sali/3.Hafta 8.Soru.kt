fun main() {
    // write me a list that has repeatative elements
    var listOfNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3, 4, 5)
    dropRepeatativeIndividuals(listOfNumbers).forEach { println(it) }
}

private fun dropRepeatativeIndividuals(list: List<Any>): Set<Any> {
    return list.toSet()
    //return list.toHashSet()

    /*val uniqueList = HashSet<Any>()
    val repeatativeList = HashSet<Any>()
    list.forEach {
        if (!uniqueList.add(it)) {
            repeatativeList.add(it)
        }
    }
    return uniqueList*/
}
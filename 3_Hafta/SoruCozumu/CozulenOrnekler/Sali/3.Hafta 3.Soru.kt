fun main() {
    //write me two different list

    val listOfNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val listOfLetters = listOf("a", "b", "c", "d", "e", "f", "g", "h", "i")

    println(combineLists(listOfNumbers, listOfLetters))

}

private fun combineLists(list1: List<Any>, list2: List<Any>): List<Any> {

    //write me a function that combines two lists
    //and returns a list that contains the elements of both lists
    //example: combineLists(listOfNumbers, listOfLetters) -> [1, 2, 3, 4, 5, 6, 7, 8, 9, "a", "b", "c", "d", "e", "f", "g", "h", "i"]
    return list1 + list2
}



fun main() {

    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    countElements(list).forEach { println(it) }

}

fun countElements(list: List<Any>): HashMap<Any, Int> {
    val map = HashMap<Any, Int>()
    list.forEach { number ->
        if (map.containsKey(number)) {
            map[number] = map[number]!! + 1
        } else {
            map[number] = 1
        }
    }
    return map
}
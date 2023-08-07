fun main() {
    val hasMap = hashMapOf("a" to 1, "b" to 2, "c" to 3, "d" to 4, "e" to 5)

    biggestValueAndKey(hasMap)
}

private fun biggestValueAndKey(hasMap: HashMap<String, Int>) {
    var biggestValue = 0
    var biggestKey = ""
    hasMap.forEach { (key, value) ->
        if (value > biggestValue) {
            biggestValue = value
            biggestKey = key
        }
    }
    println("Biggest value is $biggestValue and key is $biggestKey")
}
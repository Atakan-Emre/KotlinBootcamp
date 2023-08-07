import java.util.HashMap

fun main() {
    val hashMap = hashMapOf("a" to 1, "b" to 2, "c" to 3)

    println(sumOfValues(hashMap))

}

fun sumOfValues(hashMap: HashMap<String, Int>): Any {
    var sum = 0
    hashMap.forEach { sum += it.value }
    return sum
}

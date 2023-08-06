import java.util.HashMap

fun main() {
    val hashMap1 = hashMapOf<Any, Any>(1 to "a", 2 to "b", 3 to "c", 4 to "d", 5 to "e")
    val hashMap2 = hashMapOf<Any, Any>(1 to "a", 2 to "b")

    println(commonElements(hashMap1, hashMap2))

}

fun commonElements(hashMap1: HashMap<Any, Any>, hashMap2: HashMap<Any, Any>): Any {

    /*val commonElements = HashMap<Any, Any>()
    for (key in hashMap1.keys) {
        if (hashMap2.containsKey(key)) {
            commonElements[key] = hashMap1[key] as Any
        }
    }
    return commonElements*/

    return hashMap1.filterKeys { hashMap2.containsKey(it) }

}


fun main(){
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    println(numbers.sum())
    var sum = 0
    numbers.forEach {
        sum += it
    }
    println(sum)
}
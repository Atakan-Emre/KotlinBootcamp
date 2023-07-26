import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val numberList = ArrayList<Int>()

    for (i in 1..5) {
        print("$i. sayiyi girin: ")
        val number = scanner.nextInt()
        numberList.add(number)
    }

    val totalSum = calculateSum(numberList)
    println("Listedeki sayilarin toplami: $totalSum")
}

fun calculateSum(numbers: ArrayList<Int>): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}

fun main(){
    val listOfNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val listOfOddNumbers = listOfNumbers.filter {number ->
        number % 2 != 0
    }
    println(listOfOddNumbers)

}
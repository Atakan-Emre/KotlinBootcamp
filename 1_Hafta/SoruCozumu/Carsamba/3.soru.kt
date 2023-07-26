fun removeVowels(input: String): String {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    val result = StringBuilder()

    for (char in input) {
        if (char.toLowerCase() !in vowels) {
            result.append(char)
        }
    }

    return result.toString()
}

fun main() {
    print("Bir string girin: ")
    val userInput = readLine()

    if (userInput != null) {
        val result = removeVowels(userInput)
        println("Sesli harfler cikarildiktan sonra: $result")
    } else {
        println("Gecersiz giris. Lütfen bir string girin.")
    }
}

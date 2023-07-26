fun main() {
    val scanner = java.util.Scanner(System.`in`)

    print("Sinav notunuzu girin: ")
    val not = scanner.nextInt()

    if (not >= 70) {
        println("Gectiniz")
    } else {
        println("Kaldiniz")
    }
}

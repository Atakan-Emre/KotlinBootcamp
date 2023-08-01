fun main() {
    val scanner = java.util.Scanner(System.`in`)

    print("Bir harf giriniz: ")
    val input = scanner.next().lowercase()

    if (input.length == 1 && input in "abcdefghijklmnopqrstuvwxyz") {
        val sesliHarfler = "aeıioöuü"
        if (input in sesliHarfler) {
            println("$input harfi bir sesli harftir.")
        } else {
            println("$input harfi bir sessiz harftir.")
        }
    } else {
        println("Lutfen gecerli bir harf giriniz.")
    }
}

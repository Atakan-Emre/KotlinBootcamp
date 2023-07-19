import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    
    try {
        print("Yaşınızı girin: ")
        val age = scanner.nextInt()
        
        if (age >= 18) {
            println("Oy kullanabilirsiniz!")
        } else {
            println("Oy kullanamazsınız.")
        }
    } catch (e: InputMismatchException) {
        println("Geçerli bir yaş girmediniz. Lütfen sayı giriniz.")
    }
    
    scanner.close()
}

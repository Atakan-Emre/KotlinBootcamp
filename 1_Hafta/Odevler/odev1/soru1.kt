import java.util.Scanner

fun main() {
    val username = "kullanici"
    val password = "Sifre123"

    val scanner = Scanner(System.`in`)

    print("Kullanıcı adınızı girin: ")
    val inputUsername = scanner.nextLine()
    print("Şifrenizi girin: ")
    val inputPassword = scanner.nextLine()

    if (inputUsername == username && inputPassword == password) {
        println("Hoş geldiniz, $username!")
    } else {
        println("Kullanıcı adı veya şifre hatalı.")
    }

    scanner.close()
}

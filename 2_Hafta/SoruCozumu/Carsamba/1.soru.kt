class Rectangle(val length: Double, val width: Double) {
    fun calculateArea(): Double {
        return length * width
    }

    fun calculatePerimeter(): Double {
        return 2 * (length + width)
    }
}

fun main() {
    val rectangle = Rectangle(5.0, 3.0)
    val area = rectangle.calculateArea()
    val perimeter = rectangle.calculatePerimeter()

    println("Dikdörtgenin Alanı: $area")
    println("Dikdörtgenin Çevresi: $perimeter")
}

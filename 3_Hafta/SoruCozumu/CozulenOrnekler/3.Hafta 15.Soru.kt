fun main() {

    val square = Square(5)
    val rectangle = Rectangle(5, 10)

    println(square.area())
    println(rectangle.area())

}

interface Shape {
    fun area(): Int
}

class Square(val side: Int) : Shape {
    override fun area(): Int {
        return side * side
    }
}

class Rectangle(val width: Int, val height: Int) : Shape {
    override fun area(): Int {
        return width * height
    }
}
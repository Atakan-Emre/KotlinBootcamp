fun main() {

    val pencil = Pencil()
    val brush = Brush()

    val drawableList = listOf(pencil, brush)

    drawableList.forEach { it.draw() }

}

interface Drawable {
    fun draw()
}

class Pencil : Drawable {
    override fun draw() {
        println("Drawing by Pencil")
    }
}

class Brush : Drawable {
    override fun draw() {
        println("Drawing by Brush")
    }
}


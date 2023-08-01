// Arac class
open class Arac(val speed: Int, val fuelConsumption: Double) {
    fun printInfo() {
        println("Hiz: $speed km/h")
        println("Yakit Tüketimi: $fuelConsumption L/100km")
    }
}

// Otomobil class 
class Otomobil(speed: Int, fuelConsumption: Double, val trunkVolume: Double) : Arac(speed, fuelConsumption) {
    fun openTrunk() {
        println("Bagaj Acildi.")
    }
}

fun main() {
    val Otomobil = Otomobil(180, 7.5, 500.0)

    // Arac sınıfından gelen bilgiler
    Otomobil.printInfo()

    // Otomobil sınıfına özgü özellik
    println("Bagaj Hacmi: ${Otomobil.trunkVolume} litre")

    // Otomobil sınıfına özgü metod
    Otomobil.openTrunk()
}

// Yüksek düzeyli fonksiyonumuz
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

// Artırma işlemi yapan fonksiyonumuz
fun increaseDirty(start: Int) = start + 1

// Kullanım
fun main() {
    println(updateDirty(15, ::increaseDirty))  // Çıktı: 16
}

//Yanıt: updateDirty(15, ::increaseDirty)





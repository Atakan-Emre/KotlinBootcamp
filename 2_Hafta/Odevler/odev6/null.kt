var nullableVar: String? = null  // Bu değişken null olabilir

println(nullableVar?.length) // null kontrolü yapılıyor, eğer nullableVar null ise null döner, değilse length'i döner

var nonNullableVar: String = "Hello"  // Bu değişken null olamaz

nonNullableVar = null  // Hata: Null can not be a value of a non-null type String

println(nullableVar!!.length) // Eğer nullableVar null ise, burada NullPointerException hatası alırız

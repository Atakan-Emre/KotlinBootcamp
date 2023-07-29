// 'nullableVar' adında bir değişken tanımlıyoruz. Bu değişkenin türü 'String?' yani null olabilen bir String.
// 'nullableVar' değişkenine başlangıç değeri olarak 'null' atıyoruz.
var nullableVar: String? = null

// 'println' ile 'nullableVar'ın uzunluğunu ekrana yazdırmak istiyoruz.
// Ancak 'nullableVar' null olabilir ve eğer null ise uzunluğunu almak hata oluşturur.
// Bu yüzden '?.length' kullanıyoruz ki eğer 'nullableVar' null ise programımız hata vermesin, direkt null dönsün.
println(nullableVar?.length) 

// 'nonNullableVar' adında bir değişken tanımlıyoruz. Bu değişkenin türü 'String', yani null olamayan bir String.
// 'nonNullableVar' değişkenine başlangıç değeri olarak 'Hello' String'ini atıyoruz.
var nonNullableVar: String = "Hello"

// 'nonNullableVar' değişkenine null atamak istiyoruz, ancak bu değişken null alamaz.
// Bu yüzden bu satır hata verir: "Null can not be a value of a non-null type String"
nonNullableVar = null 

// 'println' ile 'nullableVar'ın uzunluğunu ekrana yazdırmak istiyoruz.
// Ancak bu sefer '!!.length' kullanıyoruz. Bu, 'nullableVar' null ise hata almak istediğimizi belirtir.
// Eğer 'nullableVar' null ise bu satır 'NullPointerException' hatası verir.
println(nullableVar!!.length)

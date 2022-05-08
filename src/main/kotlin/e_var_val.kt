fun main(args: Array<String>) {
    /*
    Kata kunci var di Kotlin digunakan untuk mendeklarasikan variabel yang nilainya dapat berubah
    sepanjang program dieksekusi.
     */
    var varVariabel: Int
    varVariabel = 56 //menetapkan nilai pertama ke varVariabel
    println("Pemberian nilai pertama pada varVariabel = "+varVariabel)
    varVariabel = 78 //menetapkan nilai kedua ke varVariabel
    println("Pemberian nilai kedua pada varVariabel = "+varVariabel)
    /*
   kata kunci val digunakan untuk mendeklarasikan
   variabel konstan yang nilainya tidak akan berubah selama program dieksekusi.
   */
    val phi = 3.14 // menetapkan nilai variabel dengan tipe data double
    println(phi)
}
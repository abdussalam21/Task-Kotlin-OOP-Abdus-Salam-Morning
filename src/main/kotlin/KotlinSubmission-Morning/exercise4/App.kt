package `KotlinSubmission-Morning`.exercise4

fun main() {
    val inputString = "123456789"

    try {
        val number = inputString.toInt()
        println("Angka yang dihasilkan adalah: $number")
    } catch (e: NumberFormatException) {
        println("Terjadi kesalahan dibagian: ${e.message}")
    } finally {
        println("Akhirnya code dijalankan")
    }
}
/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini

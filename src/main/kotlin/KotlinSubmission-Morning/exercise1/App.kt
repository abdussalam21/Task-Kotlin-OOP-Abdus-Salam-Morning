package `KotlinSubmission-Morning`.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val NamaDepan = "Abdus"
    val NamaBelakang = "Salam"
    val Umur = 20
    val Status: Boolean = false

    println("Nama depan saya adalah: $NamaDepan")
    println("Nama belakang saya sama dengan nama panggilan saya: $NamaBelakang")
    println("Saya kelahiran tahun 2003 dengan umur saat ini: $Umur tahun")
    println("Saya sudah memiliki pacar dari program Web dengan nama Mutia Nandika, maka dengan ini status saya: $Status")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

    val groupId = "Lumos Massive"
    val groupMember = listOf(" PM Lintang Luthfiantoni", " Scrum Web Mutia Nandika", "Scrum Mob Asfia Apriani",
        "Lustiara Mega", "Vika Dwi Nur romadhoni", "Ali Askari", "Aditya Mufid Musyaffa", "Adelia Sofia Anjani",
        "Sapitri", "Mutia Nandika", "Khaeril Maswal Zaid", "Abdus Salam", "Asfia Apriani")
    val session = "Morning"

    println("Nama kelompok: $groupId")
    println("List nama anggota kelompok Lumos: $groupMember")
    println("Sesi: $session")

    return "$groupId, $groupMember, $session"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    val groupMember = listOf("PM Lintang Lutfhfiantoni", "Scrum Web Mutia Nandika", "Scrum Mob Asfia Apriani",
        "Lustiara Mega", "Vika Dwi Nur romadhoni", "Ali Askari", "Aditya Mufid Musyaffa", "Adelia Sofia Anjani",
        "Sapitri", "Khaeril Maswal Zaid", "Abdus Salam")
    val myName = groupMember[10]

    println("List nama anggota kelompok Lumos: $groupMember")
    println("Nama saya: $myName")

    return groupMember
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Jovian", "Kak Raihan", "Kak Reynaldi", "Kak Reza", "Kak Maulana", "Kak Megi")
    val countOfGroup = arrayOf<String>("PM Lintang Lutfhfiantoni", "Scrum Web Mutia Nandika", "Scrum Mob Asfia Apriani",
        "Lustiara Mega", "Vika Dwi Nur romadhoni", "Ali Askari", "Aditya Mufid Musyaffa", "Adelia Sofia Anjani",
        "Sapitri", "Khaeril Maswal Zaid", "Abdus Salam")
    val total = mentor.size + countOfGroup.size

    return total

}

fun main() {

    myProfile()

    val myTeamMembers = myTeam()
    println("List nama anggota kelompok Lumos: $myTeamMembers")

    val totalGroupMember = totalMember()
    println("Total Member: $totalGroupMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Lumos", listOf("PM Lintang Lutfhfiantoni", "Scrum Web Mutia Nandika", "Scrum Mob Asfia Apriani",
        "Lustiara Mega", "Vika Dwi Nur romadhoni", "Ali Askari", "Aditya Mufid Musyaffa", "Adelia Sofia Anjani",
        "Sapitri", "Mutia Nandika", "Khaeril Maswal Zaid", "Abdus Salam", "Asfia Apriani"), "Morning")

}
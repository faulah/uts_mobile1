package com.example.uts_mobile1

// Extension function untuk menampilkan rekap perolehan trofi klub
fun Club.printTrophySummary() {
    println("$name berhasil meraih $premierLeagueTrophies trofi Liga Primer Inggris, " +
            "$faCupTrophies trofi FA, " +
            "$eflCupTrophies trofi EFL, " +
            "$championsLeagueTrophies trofi Liga Champions, dan " +
            "$europaLeagueTrophies trofi Liga Eropa UEFA.")
}

fun main() {
    val liverpool = Club("Liverpool", 19, 8, 9, 6, 3)
    val manchesterUnited = Club("Manchester United", 20, 12, 6, 3, 1)
    val chelsea = Club("Chelsea", 6, 6, 5, 2, 2)
    val manchesterCity = Club("Manchester City", 8, 8, 8, 0, 0)
    val arsenal = Club("Arsenal", 13, 14, 2, 0, 0)

    // Menampilkan rekap perolehan trofi klub menggunakan extension function
    liverpool.printTrophySummary()
    manchesterUnited.printTrophySummary()
    chelsea.printTrophySummary()
    manchesterCity.printTrophySummary()
    arsenal.printTrophySummary()
}


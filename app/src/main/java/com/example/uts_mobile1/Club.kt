package com.example.uts_mobile1

data class Club(
    val name: String,
    val premierLeagueTrophies: Int,
    val faCupTrophies: Int,
    val eflCupTrophies: Int,
    val championsLeagueTrophies: Int,
    val europaLeagueTrophies: Int
) {
    val totalTrophies: Int
        get() {
            return premierLeagueTrophies + faCupTrophies + eflCupTrophies + championsLeagueTrophies + europaLeagueTrophies
        }
}


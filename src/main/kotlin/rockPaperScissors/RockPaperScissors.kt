package org.example.rockPaperScissors

object RockPaperScissors{
    fun play(player1: Player, player2: Player): String {
        if (player1.choice == "rock") {
            return "Player 1 wins"
        }
        return "Player 2 wins"
    }
}

data class Player(val choice: String)

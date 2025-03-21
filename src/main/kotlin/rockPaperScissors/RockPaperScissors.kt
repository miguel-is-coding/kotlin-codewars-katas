package org.example.rockPaperScissors

object RockPaperScissors{
    fun play(player1: Player, player2: Player): String {
        if ((player1.choice == Choices.ROCK && player2.choice == Choices.SCISSORS)
            || (player1.choice == Choices.PAPER && player2.choice == Choices.ROCK)
            || (player1.choice == Choices.SCISSORS && player2.choice == Choices.PAPER)){
            return "Player 1 wins"
        }
        return "Player 2 wins"
    }


    /**
     * rock beats scissors
     * paper beats rock
     * scissors beat paper
     */
}

data class Player(val choice: Choices)

enum class Choices {
    ROCK,
    SCISSORS,
    PAPER
}

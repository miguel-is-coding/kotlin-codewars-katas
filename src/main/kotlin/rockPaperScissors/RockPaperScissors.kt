package org.example.rockPaperScissors

object RockPaperScissors {
    fun play(player1: Player, player2: Player): String {
        return player1.choice.takeIf { it == player2.choice }?.let { "Draw game" }
            ?: wins(player1, player2).takeIf { it }?.let { "Player 1 wins" }
            ?: "Player 2 wins"
    }

    private fun wins(
        player1: Player,
        player2: Player
    ): Boolean {
        val rockBeatsScissors = player1.choice == Choices.ROCK && player2.choice == Choices.SCISSORS
        val paperBeatsRock = player1.choice == Choices.PAPER && player2.choice == Choices.ROCK
        val scissorsBeatsPaper = player1.choice == Choices.SCISSORS && player2.choice == Choices.PAPER
        return (rockBeatsScissors || paperBeatsRock || scissorsBeatsPaper)
    }
}

data class Player(val choice: Choices)

enum class Choices {
    ROCK,
    SCISSORS,
    PAPER
}

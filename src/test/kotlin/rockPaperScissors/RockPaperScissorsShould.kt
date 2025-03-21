package rockPaperScissors

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class RockPaperScissorsShould: FunSpec({
    test("make rock beat scissors") {
        RockPaperScissors.play("rock", "scissors") shouldBe "Player 1 wins"
    }

    test("make scissors lose against rock") {
        RockPaperScissors.play("scissors", "rock") shouldBe "Player 2 wins"
    }
})

object RockPaperScissors{
    fun play(player1Choice: String, player2Choice: String): String {
        if (player1Choice == "rock") {
            return "Player 1 wins"
        }
        return "Player 2 wins"
    }
}

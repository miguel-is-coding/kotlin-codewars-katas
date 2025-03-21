package rockPaperScissors

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class RockPaperScissorsShould: FunSpec({
    test("make rock beat scissors") {
        RockPaperScissors.play("rock", "scissors") shouldBe "Player 1 wins"
    }
})

object RockPaperScissors{
    fun play(player1Choice: String, player2Choice: String): String {
        return "Player 1 wins"
    }
}

package rockPaperScissors

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.example.rockPaperScissors.Player
import org.example.rockPaperScissors.RockPaperScissors

class RockPaperScissorsShould: FunSpec({
    test("make rock beat scissors") {
        RockPaperScissors.play(Player("rock"), Player("scissors")) shouldBe "Player 1 wins"
    }

    test("make scissors lose against rock") {
        RockPaperScissors.play(Player("scissors"), Player("rock")) shouldBe "Player 2 wins"
    }
})


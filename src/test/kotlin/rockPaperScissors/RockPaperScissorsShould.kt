package rockPaperScissors

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.example.rockPaperScissors.Choices
import org.example.rockPaperScissors.Player
import org.example.rockPaperScissors.RockPaperScissors

class RockPaperScissorsShould: FunSpec({
    test("make rock beat scissors") {
        RockPaperScissors.play(Player(Choices.ROCK), Player(Choices.SCISSORS)) shouldBe "Player 1 wins"
    }

    test("make scissors lose against rock") {
        RockPaperScissors.play(Player(Choices.SCISSORS), Player(Choices.ROCK)) shouldBe "Player 2 wins"
    }

    test("make paper beat rock") {
        RockPaperScissors.play(Player(Choices.PAPER), Player(Choices.ROCK)) shouldBe "Player 1 wins"
    }

    test("make rock lose against paper") {
        RockPaperScissors.play(Player(Choices.ROCK), Player(Choices.PAPER)) shouldBe "Player 2 wins"
    }
})


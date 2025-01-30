package parityOutlier

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.example.parityOutlier.ParityMatcher

class ParityMatcherShould: FunSpec({
    test("find the odd number from a list of even numbers") {
        ParityMatcher.findOutlierIn(arrayOf(2, 4, 6, 7, 10)) shouldBe 7
    }

    test("find the even number from a list of odd numbers") {
        ParityMatcher.findOutlierIn(arrayOf(1, 5, 6, 7, 11)) shouldBe 6
    }
})

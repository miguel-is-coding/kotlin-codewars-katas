package findMissingLetter

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.example.findMissingLetter.LetterFinder

class FindMissingLetterShould: FunSpec ({
    test("get the missing letter from a list of lower case letters") {
        LetterFinder.findMissingFrom(arrayOf('a', 'b', 'c', 'd', 'f')) shouldBe 'e'
    }

    test("get the missing letter from a list of lower case letters at any position") {
        LetterFinder.findMissingFrom(arrayOf('o', 'q', 'r', 's')) shouldBe 'p'
    }

    test("get the missing letter from a list of upper case letters") {
        LetterFinder.findMissingFrom(arrayOf('A', 'B', 'C', 'D', 'F')) shouldBe 'E'
    }
})

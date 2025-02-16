package meeting

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.example.meeting.Meeting

/**
 * Possible cases:
 * - Retrieve an empty list when the names given are empty
 * - Retrieve a list with one name when the list has only one name
 * - Retrieve a list with the last name and first name in uppercase separated by comma between parenthesis
 * - Retrieve a list with two guest names with different last names
 * - Retrieve an ordered list with two guest names with same lastname but different firstname
 * - Retrieve a list with three guest names with different last names
 */

class MeetingShould: FunSpec({
    test("retrieve an empty list") {
        val meeting = Meeting("")
        meeting.orderMembers() shouldBe "()"
    }

    test("retrieve the lastname and firstname in uppercase separated by comma between parenthesis") {
        val meeting = Meeting("Fred:Corwill")
        meeting.orderMembers() shouldBe "(CORWILL, FRED)"
    }

    test("retrieve two meeting members already ordered by lastname") {
        val meeting = Meeting("Fred:Corwill;Barney:Tornbull")
        meeting.orderMembers() shouldBe "(CORWILL, FRED)(TORNBULL, BARNEY)"
    }
})

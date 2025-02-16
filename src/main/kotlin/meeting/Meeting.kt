package org.example.meeting

class Meeting(private val members: String) {
    fun orderMembers(): String {
        if (members.isEmpty()) return "()"
        return members.split(";")
            .map { Member.fromList(it) }
            .let { sortByNameAndLastname(it) }
            .joinToString("") { formatFullNameFrom(it) }
    }

    private fun sortByNameAndLastname(members: List<Member>): List<Member> {
        return members.sortedWith(compareBy({ it.lastname.lowercase() }, { it.firstname.lowercase() }))
    }

    private fun formatFullNameFrom(member: Member): String {
        val (firstname, lastname) = member
        return "(${lastname}, ${firstname})".uppercase()
    }
}

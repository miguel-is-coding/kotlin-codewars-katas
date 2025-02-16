package org.example.meeting

class Meeting(private val members: String) {
    fun orderMembers(): String {
        if (members.isEmpty()) return "()"
        return members.split(";")
            .map { parseFrom(it) }
            .let { sortByNameAndLastname(it) }
            .joinToString("") { formatFullNameFrom(it) }
    }

    private fun parseFrom(member: String): Pair<String, String> {
        val (firstname, lastname) = member.split(":")
        return firstname to lastname
    }

    private fun sortByNameAndLastname(members: List<Pair<String, String>>): List<Pair<String, String>> {
        return members.sortedWith(compareBy({ it.second }, { it.first }))
    }

    private fun formatFullNameFrom(member: Pair<String, String>): String {
        val (firstname, lastname) = member
        return "(${lastname}, ${firstname})".uppercase()
    }
}

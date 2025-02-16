package org.example.meeting

class Meeting(private val members: String) {
    fun orderMembers(): String {
        if (members.isEmpty()) return "()"
        val membersList = members
            .split(";")
            .sortedBy { it.getOrNull(it.indexOf(":")+1) }
        var membersOrdered = ""
        membersList.forEach {
            val memberFullName = it.split(":")
            val lastname = memberFullName[1].uppercase()
            val firstname = memberFullName[0].uppercase()
            membersOrdered += "($lastname, $firstname)"
        }
        return membersOrdered
    }
}

package org.example.meeting

class Meeting(private val members: String) {
    fun orderMembers(): String {
        if (members.isEmpty()) return "()"
        val fullNamesOrdered = members
            .split(";")
            .sortedBy { it.getOrNull(it.indexOf(":")+1) }
        var membersOrdered = ""
        fullNamesOrdered.forEach {
            val fullName = it.split(":")
            val lastname = fullName[1].uppercase()
            val firstname = fullName[0].uppercase()
            membersOrdered += "($lastname, $firstname)"
        }
        return membersOrdered
    }
}

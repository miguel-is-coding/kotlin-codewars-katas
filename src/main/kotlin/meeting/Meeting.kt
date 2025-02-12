package org.example.meeting

class Meeting(private val members: String) {
    fun orderMembers(): String {
        if (members.isEmpty()) return "()"
        val memberFullName = members.split(":")
        val lastname = memberFullName[1].uppercase()
        val firstname = memberFullName[0].uppercase()
        return "($lastname, $firstname)"
    }
}

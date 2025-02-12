package org.example.meeting

class Meeting(private val members: String) {
    fun orderMembers(): String {
        if (members.isEmpty()) {
            return "()"
        }
        val memberFullName = members.split(":")
        return "(${memberFullName[1].uppercase()}, ${memberFullName[0].uppercase()})"
    }
}

package org.example.meeting

class Meeting(private val members: String) {
    fun orderMembers(): String {
        if (members.isEmpty()) return "()"
        val fullNamesOrdered = members.split(";")
            .sortedWith(compareBy<String> {
                val lastNameInitial = it.getOrNull(it.indexOf(":") + 1)
                lastNameInitial
            } .thenBy {
                val firstNameInitial = it.first()
                firstNameInitial
            })
        return fullNamesOrdered.joinToString("") {
            it.split(":").let { (firstname, lastname) ->
                "(${lastname.uppercase()}, ${firstname.uppercase()})"
            }
        }
    }
}

package org.example.meeting

data class Member(val firstname: String, val lastname: String){
    companion object {
        fun fromList(input: String): Member {
            val firstname = input.takeWhile { it != ':' }
            val lastname = input.takeLastWhile { it != ':' }
            return Member(firstname, lastname)
        }
    }
}

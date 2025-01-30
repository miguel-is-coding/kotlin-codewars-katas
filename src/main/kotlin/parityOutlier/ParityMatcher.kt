package org.example.parityOutlier

private const val minLength = 3

open class ParityMatcher() {
    companion object {
        fun findOutlierIn(listOfNumbers: Array<Int>): Int =
            if (isAnEvenList(listOfNumbers))
                listOfNumbers.first { it % 2 != 0 }
            else
                listOfNumbers.first { it % 2 == 0 }

        private fun isAnEvenList(listOfNumbers: Array<Int>): Boolean =
            listOfNumbers.take(minLength).count { it % 2 == 0 } > 1
    }
}

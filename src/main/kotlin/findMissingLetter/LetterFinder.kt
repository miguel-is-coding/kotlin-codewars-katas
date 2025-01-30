package org.example.findMissingLetter

class LetterFinder {
    companion object {
        fun findMissingFrom(letters: Array<Char>): Char {
            val alphabetChunk = (letters.first()..(letters.last()))
            return alphabetChunk.first { it !in letters }
        }
    }
}

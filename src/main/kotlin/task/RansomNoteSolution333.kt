package task

class RansomNoteSolution333 {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val ransomNoteChars = ransomNote.toCharArray()
        val magazineChars = magazine.toCharArray().toMutableList()

        var matches = 0

        ransomNoteChars.forEach { noteChar ->
            val matchedChar = magazineChars.find{ it == noteChar }
            if (matchedChar != null) {
                magazineChars.remove(matchedChar)
                matches++
            }
        }

        return ransomNoteChars.size == matches
    }
}
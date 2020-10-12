package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?):Pair<String?, String?> {

        val parts: List<String>? = fullName?.split(" ")

        var firstName = parts?.getOrNull(0)
        if (firstName != null ) firstName = firstName.trim(' ')
        if (firstName == "") firstName = null

        var lastName = parts?.getOrNull(1)
        if (lastName != null ) lastName = lastName.trim(' ')
        if (lastName == "") lastName = null

        return firstName to lastName
    }

    fun transliteration(payload: String): String {
        TODO()

    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        TODO()
    }
}
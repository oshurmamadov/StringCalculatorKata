package kata

import java.util.regex.Pattern

class InputValidator {
    private var input = ""

    fun validateString(input: String): Boolean {
        this.input = input
        return !isNotEmptyAndContainsDelimiters() || isNonNumberDelimiterExists()
    }

    fun validateDelimiter(delimiter: String): Boolean {
        return isDelimiterMoreThanMaxInt(delimiter.toLong())
    }

    private fun isNotEmptyAndContainsDelimiters(): Boolean {
        return input.isNotEmpty() && (input.contains(",") || input.contains(" ") || input.contains("\n") )
    }

    private fun isNonNumberDelimiterExists(): Boolean {
        return !Pattern.compile("[0-9 ,'\n]+").matcher(input).matches()
    }

    private fun isDelimiterMoreThanMaxInt(delimiter: Long): Boolean {
        return delimiter >= Int.MAX_VALUE
    }
}
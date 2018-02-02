package kata

import java.util.regex.Pattern

class InputValidator {
    private var input = ""

    fun validateString(input: String): Boolean {
        this.input = input
        return !isNotEmptyAndContainsDelimiters() ||
                isNonNumberDelimiterExists()
    }

    fun validateDelimiter(delimiter: String): Boolean {
        return !delimiter.isNotEmpty() ||
                isDelimiterMoreThanMaxInt(delimiter.toLong())
    }

    private fun isNotEmptyAndContainsDelimiters(): Boolean {
        if(input.contains(MINUS_DEL))
            throw Exception("Jush wam thamand magen cift")

        return input.isNotEmpty() &&
                (input.contains(COMMA_DEL) || input.contains(SPACE_DEL) || input.contains(NEW_LINE_DEL))
    }

    private fun isNonNumberDelimiterExists(): Boolean {
        return !Pattern.compile(CALC_CORRECT_REGEX).matcher(input).matches()
    }

    private fun isDelimiterMoreThanMaxInt(delimiter: Long): Boolean {
        return delimiter >= Int.MAX_VALUE
    }
}
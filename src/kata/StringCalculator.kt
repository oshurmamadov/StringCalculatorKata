package kata

import java.util.regex.Pattern

class StringCalculator(private var input: String) {

    fun sum(): Int {
        if (isEmptyOrHasNoSpace()) return 0

        if (isNonNumberDelimiterExists()) return 0

        return input
                .split(" ")
                .sumBy { it.toInt() }
    }

    private fun isEmptyOrHasNoSpace(): Boolean {
        return !input.isNotEmpty() || !input.contains(" ")
    }

    private fun isNonNumberDelimiterExists(): Boolean {
        return !Pattern.compile("[0-9 ]+").matcher(input).matches()
    }
}
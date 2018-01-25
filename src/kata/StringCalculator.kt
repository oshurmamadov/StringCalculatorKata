package kata

import java.util.regex.Pattern

class StringCalculator(private var input: String) {

    fun sum(): Int {
        if (!isNotEmptyAndContainsDelimiters()) return 0

        if (isNonNumberDelimiterExists()) return 0

        val array = input.split(" ", ",")

        array.forEach {
            if (isDelimiterMoreThanMaxInt(it.toLong()))
                return 0
        }

        return array.sumBy { it.toInt() }
    }

    private fun isNotEmptyAndContainsDelimiters(): Boolean {
        return input.isNotEmpty() && (input.contains(",") || input.contains(" "))
    }

    private fun isNonNumberDelimiterExists(): Boolean {
        return !Pattern.compile("[0-9 ,]+").matcher(input).matches()
    }

    private fun isDelimiterMoreThanMaxInt(delimiter: Long): Boolean {
        return delimiter >= Int.MAX_VALUE
    }
}
package kata

class StringCalculator {

    fun add(s: String): Int {
        if (isEmptyOrHasNoSpace(s)) return 0

        return s.split(" ")
                .sumBy { it.toInt() }
    }

    private fun isEmptyOrHasNoSpace(s: String): Boolean {
        return !s.isNotEmpty() || !s.contains(" ")
    }
}
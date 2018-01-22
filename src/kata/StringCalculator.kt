package kata

class StringCalculator {

    fun add(s: String): Int {
        if (isEmptyOrHasNoSpace(s)) return 0

        val array = s.split(" ")

        val a = array[0].toInt()
        val b = array[1].toInt()

        return a + b
    }

    private fun isEmptyOrHasNoSpace(s: String): Boolean {
        return !s.isNotEmpty() || !s.contains(" ")
    }
}
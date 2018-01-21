package kata

class StringCalculator {

    fun add(s: String): Int {
        if (!s.isNotEmpty())
            return 0
        else if(!s.contains(" "))
            return 0

        return s.split(" ").sumBy { it.toInt() }
    }

}
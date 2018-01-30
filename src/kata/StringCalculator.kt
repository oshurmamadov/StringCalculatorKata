package kata

class StringCalculator(private var input: String) {

    private val validator = InputValidator()

    fun sum(): Int {
        if (validator.validateString(input)) return 0

        val array = input.split(SPACE_DEL, COMMA_DEL, NEW_LINE_DEL)

        array.forEach {
            if (validator.validateDelimiter(it))
                return 0
        }

        return array.sumBy { it.toInt() }
    }
}
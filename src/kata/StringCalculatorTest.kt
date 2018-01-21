package kata

import org.junit.Test
import org.junit.Assert.*

class StringCalculatorTest {

	@Test
	fun emptyString() {
		val result = StringCalculator().add("")

        assertEquals(0, result)
	}

    @Test
    fun noSpace() {
        val result = StringCalculator().add("1,2")

        assertEquals(0, result)
    }

    @Test
    fun oneVariable() {
        val result = StringCalculator().add("1")

        assertEquals(0, result)
    }

    @Test
    fun simpleSum() {
        val result = StringCalculator().add("1 2")

        assertEquals(3, result)
    }
}
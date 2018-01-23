package kata

import org.junit.Assert.assertEquals
import org.junit.Ignore
import org.junit.Test

class StringCalculatorTest {

	@Test
	fun emptyString() {
		val result = StringCalculator("").sum()

        assertEquals(0, result)
	}

    @Test
    fun noSpace() {
        val result = StringCalculator("1,2").sum()

        assertEquals(0, result)
    }

    @Test
    fun oneVariable() {
        val result = StringCalculator("1").sum()

        assertEquals(0, result)
    }

    @Test
    fun simpleSum() {
        val result = StringCalculator("1 2").sum()

        assertEquals(3, result)
    }

    @Test
    @Ignore
    fun nonNumberLiteral() {
        val result = StringCalculator("1 b").sum()

        assertEquals(0, result)
    }
}
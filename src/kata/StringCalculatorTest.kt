package kata

import org.junit.Assert.assertEquals
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
    fun nonNumberLiteral() {
        val result = StringCalculator("1 b").sum()

        assertEquals(0, result)
    }

    @Test
    fun tooLargeNumber() {
        val largeNum: Long = (Int.MAX_VALUE - 1).toLong()
        val result = StringCalculator(largeNum.toString() +" 1")

        assertEquals(0, result)
    }

    @Test
    fun simpleSum() {
        val result = StringCalculator("1 2").sum()

        assertEquals(3, result)
    }

    @Test
    fun tripleSum() {
        val result = StringCalculator("1 1 1").sum()

        assertEquals(3, result)
    }

    @Test
    fun multipleDelimitersSum() {
        var str = "0"
        for (i in 1..1000) str += " 1"

        val result = StringCalculator(str).sum()

        assertEquals(1000, result)
    }
}
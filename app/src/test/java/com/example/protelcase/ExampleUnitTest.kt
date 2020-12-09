package com.example.protelcase

import com.example.protelcase.util.TestUtil
import com.google.common.truth.Truth.assertThat
import junit.framework.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `number is between tow numbers | returns true`(){
        val result = TestUtil.isNumberBetweenOtherTowNumbers(12,1,25)
        assertThat(result).isTrue()
    }

    @Test
    fun `number is not between tow numbers | returns false`(){
        val result = TestUtil.isNumberBetweenOtherTowNumbers(12,20,25)
        assertThat(result).isFalse()
    }
}
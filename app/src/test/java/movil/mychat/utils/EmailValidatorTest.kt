package movil.mychat.utils

import org.junit.Test

import org.junit.Assert.*

/**
 * Created by haurbano on 19/10/2017.
 */
class EmailValidatorTest {
    @Test
    fun validateCorrectEmail() {
        assertTrue(EmailValidator.validEmail("h@g.com"))
    }

    @Test
    fun validateWrongEmail() {
        assertFalse(EmailValidator.validEmail("hg.com"))
    }




}
package movil.mychat


import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.BeforeClass

/**
 * Created by haurbano on 19/10/2017.
 */
class MainActivityTest {

    val num1 = 10
    val num2 = 5

    @Test
    fun sumar() {
        val resultado_esperado = 15

        val mainActivity = MainActivity()
        val resultado = mainActivity.sumar(num1,num2)

        assertEquals(resultado,resultado_esperado)
    }

    @Test
    fun restar() {
        val resultado_esperado = 5

        val mainActivity = MainActivity()
        val resultado = mainActivity.restar(num1,num2)

        assertEquals(resultado,resultado_esperado)
    }

}
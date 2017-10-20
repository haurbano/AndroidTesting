package movil.mychat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_sumar.setOnClickListener { resultado.text = sumar( num1.text.toString().toInt(), num2.text.toString().toInt()).toString() }
        btn_restar.setOnClickListener { resultado.text = restar( num1.text.toString().toInt(), num2.text.toString().toInt()).toString() }
        btn_mul.setOnClickListener { resultado.text = multiplicar( num1.text.toString().toInt(), num2.text.toString().toInt()).toString() }
        btn_div.setOnClickListener { resultado.text = dividir( num1.text.toString().toInt(), num2.text.toString().toInt()).toString() }
    }

    fun sumar(a: Int  ,  b: Int) : Int = a + b
    fun restar(a: Int  ,  b: Int) : Int = a - b
    fun multiplicar(a: Int  ,  b: Int) : Int = a * b
    fun dividir(a: Int  ,  b: Int) : Int = a / b
}

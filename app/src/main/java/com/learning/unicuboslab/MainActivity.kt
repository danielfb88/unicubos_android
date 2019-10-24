package com.learning.unicuboslab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_imc.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)
        initListeners()
        /*Picasso
            .get()
            .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRepETJZr0ZHtIQvwwvxztMDnYWOoSl4ZMDPhQIDy8tsTt2r4Yq8w")
            .into(imageView)

         */
    }

    private fun initListeners() {
        calculateBTN?.setOnClickListener {
            getValues()
        }
    }

    private fun getValues() {
        val altura:Float = heightEDTX?.text?.toString()?.toFloat() ?: 1f
        val peso:Float = wightEDTX?.text?.toString()?.toFloat() ?: 0f
        val resultado = calcIMC(altura, peso)

        val title = when(resultado) {
            in 0f..19f -> "Abaixo do peso"
            in 19f..25f -> "Peso ideal"
            else -> "Sobrepeso"
        }

        titleTX?.text = (resultado.toString() + " - " + title)
    }

    private fun calcIMC(altura: Float, peso: Float) = peso / (altura * altura)

    fun toastTest(text:String)=
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

    override fun onRestart() {
        super.onRestart()
        toastTest(("RESTART TESTE"))
    }

    override fun onStart() {
        super.onStart()
        toastTest(("START TESTE"))
    }

    override fun onStop() {
        super.onStop()
        toastTest(("STOP TESTE"))
    }

    override fun onResume() {
        super.onResume()
        toastTest(("RESUME TESTE"))
    }

    override fun onDestroy() {
        super.onDestroy()
        toastTest(("DESTROY TESTE"))
    }
}

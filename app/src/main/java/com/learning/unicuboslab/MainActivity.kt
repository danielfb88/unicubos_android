package com.learning.unicuboslab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

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

package com.learning.unicuboslab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Picasso
            .get()
            .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRepETJZr0ZHtIQvwwvxztMDnYWOoSl4ZMDPhQIDy8tsTt2r4Yq8w")
            .into(imageView)
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

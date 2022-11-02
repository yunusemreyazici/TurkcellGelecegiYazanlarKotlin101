package com.example.eventmag2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        window.decorView.rootView.setOnTouchListener(View.OnTouchListener { view, motionEvent ->

            Toast.makeText(this, "ekrana dokunuldu", Toast.LENGTH_LONG).show()
            return@OnTouchListener true
        })
    }


    fun btnuyar3(view: View) {
        Toast.makeText(this, "Yöntem3", Toast.LENGTH_LONG).show()
    }
}
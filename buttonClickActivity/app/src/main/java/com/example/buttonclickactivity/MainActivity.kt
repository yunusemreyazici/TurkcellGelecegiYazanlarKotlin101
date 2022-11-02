package com.example.buttonclickactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val clickme = findViewById<Button>(R.id.click_me);
        clickme.setOnClickListener {
            Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show()
        }
    }
}
package com.example.toggle_button_switch


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.CompoundButton.OnCheckedChangeListener
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tbutton.setOnCheckedChangeListener(anan)
        switch1.setOnCheckedChangeListener(baban)
    }

    private val anan = OnCheckedChangeListener { btn: CompoundButton, status: Boolean ->
        Toast.makeText(this, "Toggle Status: " + status, Toast.LENGTH_LONG).show()


    }
    private val baban = OnCheckedChangeListener { btn: CompoundButton, status: Boolean ->
        Toast.makeText(this, "Toggle Status: " + status, Toast.LENGTH_LONG).show()
    }
}
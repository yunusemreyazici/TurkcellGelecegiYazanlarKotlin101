package com.example.checkboxratiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    checkBox.setOnCheckedChangeListener{
        btn:CompoundButton,status: Boolean ->
        Toast.makeText(this,"Seçim " +status,Toast.LENGTH_LONG).show()
    }

    }
}
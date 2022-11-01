package com.example.androidruntimestructure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    Toast.makeText(this@MainActivity,"Uyarı Metni",Toast.LENGTH_SHORT).show()
        Snackbar.make(window.decorView.rootView, "Metin",Snackbar.LENGTH_LONG).show()
    }
}
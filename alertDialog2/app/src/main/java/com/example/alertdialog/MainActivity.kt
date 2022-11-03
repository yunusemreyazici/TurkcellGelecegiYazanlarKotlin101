package com.example.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun alertDisplay() {
        var alertBuilder = AlertDialog.Builder(this)
        alertBuilder.setTitle("Uyarı")
        alertBuilder.setMessage("Çıkmak İstiyor Musunuz?")
        alertBuilder.setPositiveButton(
            "Evet",
            DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
        alertBuilder.setNegativeButton("Hayır", null)
        alertBuilder.create().show()
    }

    override fun onBackPressed() {
    alertDisplay()
    }
}
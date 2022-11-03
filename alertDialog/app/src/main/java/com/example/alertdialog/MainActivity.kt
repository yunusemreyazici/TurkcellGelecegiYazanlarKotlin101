package com.example.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun alerCikar(view: View){
        var uyariYapici = AlertDialog.Builder(this)
        uyariYapici.setTitle("Uyarı Başlığı")
        uyariYapici.setMessage("Mesaj")

        uyariYapici.setPositiveButton("Tamam", DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this,"Tamam butonuna basıldı",Toast.LENGTH_SHORT).show()
        })

        uyariYapici.setNegativeButton("Vazgeç",null)
        var uyari= uyariYapici.create()
        uyari.show()
    }
}
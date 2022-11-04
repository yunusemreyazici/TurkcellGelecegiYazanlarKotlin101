package com.example.workalotscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun openNewPage(view: View) {
        var intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("valuem", "Gönderilecek Değer")
        //startActivity(intent)
        startActivityForResult(intent, 0)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 0 && resultCode == RESULT_OK) {
            var str = data?.getStringExtra("comeBackValue")
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
        }
    }
}
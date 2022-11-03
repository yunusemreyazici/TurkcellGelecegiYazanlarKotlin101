package com.example.intentdemo

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

    fun openNewScreen(view: View){
        var intent = Intent(this,MainActivity2::class.java)
       // startActivity(intent)
    startActivityForResult(intent,0)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Toast.makeText(this,"Geri geldin",Toast.LENGTH_SHORT).show()
    }
}

// activityler arası geçiş yaptığımız durumlarda intentleri kullanırız.
// intent tüm contexlerin başlatılmasını sağlar.
//
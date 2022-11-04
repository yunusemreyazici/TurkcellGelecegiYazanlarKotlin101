package com.example.workalotscreen

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var incomingValue = intent.getStringExtra("valuem")
        textView.text= incomingValue

    }

    fun goBackPage(view: View){
        var i= Intent()
        i.putExtra("comeBackValue","Geriye değer döndürdün ")
        setResult(Activity.RESULT_OK,i)
        finish()

    }

}
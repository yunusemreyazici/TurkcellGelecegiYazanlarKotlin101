package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun fragment1_Click(view: View){
        //ft : fragment transmittor
        val ft =supportFragmentManager.beginTransaction()
        val f1 = Fragment1()
        f1.deger="yok"
        ft.replace(R.id.container,Fragment1())
        ft.commit()
    }
    fun fragment2_Click(view: View){
        //ft : fragment transmittor
        val ft2 =supportFragmentManager.beginTransaction()
        val f2 = Fragment2()
        ft2.replace(R.id.container,Fragment2())
        ft2.commit()

    }

}

// fragmentler bir activity içerisinde kendi yaşam döngüsü olan parçalardır.

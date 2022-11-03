package com.example.nestedscrollviewlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

// ürün ekleme sayfası tasarımı yapılacak
// bu sayfada ürüne dair başlık kısa açıklama fiyat ,etiket listesi, açıklama bilgileri yer alacak
// ürün için birden fazla etiket seçilebilecektir.
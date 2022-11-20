package com.example.privet2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

public class karta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_karta)
        supportActionBar?.hide()
        var back: ImageView = findViewById(R.id.image_back)
        var i1: ImageView = findViewById(R.id.i1_yroven)


        back.setOnClickListener {
            finish()
        }
        i1.setOnClickListener {
            val MyIntent2 = Intent(this, yroven1::class.java)
            startActivity(MyIntent2)
        }
    }
}
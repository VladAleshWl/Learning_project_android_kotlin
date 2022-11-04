package com.example.privet2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

public class karta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_karta)
        supportActionBar?.hide()
        var back: Button = findViewById(R.id.button_back)
        var i1: Button = findViewById(R.id.i1_yroven)
        var exper: Button = findViewById(R.id.button_exper)

        back.setOnClickListener {
            finish()
        }
        i1.setOnClickListener {
            val MyIntent2 = Intent(this, yroven1::class.java)
            startActivity(MyIntent2)
        }
        exper.setOnClickListener {

        }
    }
}
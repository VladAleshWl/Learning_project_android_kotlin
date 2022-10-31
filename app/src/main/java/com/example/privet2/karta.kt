package com.example.privet2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

public class karta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_karta)
        supportActionBar?.hide()
        var back: Button = findViewById(R.id.button_back)

        back.setOnClickListener {
            finish()
        }
    }
}
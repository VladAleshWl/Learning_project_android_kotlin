package com.example.privet2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.privet2.Data.Data_and_flagi

public class karta : AppCompatActivity() {
    val basa_fkagov = Data_and_flagi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_karta)
        supportActionBar?.hide()
        val back: ImageView = findViewById(R.id.image_back)
        val i1: ImageView = findViewById(R.id.i1_yroven)


        back.setOnClickListener {
            finish()
        }
        i1.setOnClickListener {
            basa_fkagov.yroven_now = 1
            val MyIntent2 = Intent(this, yroven1::class.java)    //переход на 1-й уровень
            startActivity(MyIntent2)
        }
    }
    override fun onResume() {
        super.onResume()
        val i2: ImageView = findViewById(R.id.i2_yroven)
        if(basa_fkagov.flag_1_go_yr) { i2.visibility = View.VISIBLE }   //появление 2-го уровня

        i2.setOnClickListener {
            basa_fkagov.yroven_now = 2
            val MyIntent2 = Intent(this, yroven1::class.java)
            startActivity(MyIntent2)
        }
    }
}
package com.example.privet2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tex1: TextView = findViewById(R.id.nachalo)
        var vihod: Button = findViewById(R.id.button_vihod)
        var koloda: Button = findViewById(R.id.button_koloda)
        var igra: Button = findViewById(R.id.button_igra)
        var ans: Button = findViewById(R.id.button_ans)
        var nastr: Button = findViewById(R.id.button_nastr)
        var kliker: Button = findViewById(R.id.button_kliker)
        vihod.setOnClickListener {
            tex1.setText("НЕ УХОДИ, НЕ НАДООООООООООООООО")
        }
        koloda.setOnClickListener {
            tex1.setText("Тут ,пока, надо включить воображение")
        }
        igra.setOnClickListener {
            tex1.setText("В бой")
        }
        var a:Int = 0
        kliker.setOnClickListener {
            a++
            tex1.setText("${a}")
        }

    }
}
package com.example.privet2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var HON: ConstraintLayout = findViewById(R.id.hon)
        var tex1: TextView = findViewById(R.id.nachalo)
        var vihod: Button = findViewById(R.id.button_vihod)
        var koloda: Button = findViewById(R.id.button_koloda)
        var igra: Button = findViewById(R.id.button_igra)
        var ans: Button = findViewById(R.id.button_ans)
        var nastr: Button = findViewById(R.id.button_nastr)
        var kliker: Button = findViewById(R.id.button_kliker)
        var vihod_kones: ConstraintLayout = findViewById(R.id.constraintLayout_konez)
        var DA: Button = findViewById(R.id.button_Da)
        var NET: Button = findViewById(R.id.button_NET)
        var text_vaxoda: TextView = findViewById(R.id.text_konez)

        vihod.setOnClickListener {
            vihod_kones.visibility = View.VISIBLE
            kliker.visibility = View.INVISIBLE
            tex1.visibility = View.INVISIBLE
            vihod.setClickable(false)
            koloda.setClickable(false)
            igra.setClickable(false)
            ans.setClickable(false)
            nastr.setClickable(false)

        }
        DA.setOnClickListener {
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }

        NET.setOnClickListener {
            vihod_kones.visibility = View.INVISIBLE
            kliker.visibility = View.VISIBLE
            tex1.visibility = View.VISIBLE
            vihod.setClickable(true)
            koloda.setClickable(true)
            igra.setClickable(true)
            ans.setClickable(true)
            nastr.setClickable(true)
        }

        koloda.setOnClickListener {
            tex1.setText("Тут ,пока, надо включить воображение")
        }

        igra.setOnClickListener {
            val MyIntent = Intent(this, karta::class.java)
            startActivity(MyIntent)
        }

        var a:Int = 0
        kliker.setOnClickListener {
            a++
            tex1.setText("${a}")
            if (a == 50){
                tex1.setText("Я сломался. Доигрались")
                kliker.visibility = View.INVISIBLE}
        }

    }


}
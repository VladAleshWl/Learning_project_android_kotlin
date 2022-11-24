package com.example.privet2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var HON: ConstraintLayout = findViewById(R.id.hon)
        var vihod: ImageView = findViewById(R.id.image_vixod)
        var koloda: ImageView = findViewById(R.id.image_koloda)
        var igra: ImageView = findViewById(R.id.image_igra)
        var nastr: ImageView = findViewById(R.id.image_nastr)
        var kliker: ImageView = findViewById(R.id.image_kliker)
        var vihod_kones: ConstraintLayout = findViewById(R.id.constraintLayout_konez)
        var DA: ImageView = findViewById(R.id.image_Da)
        var NET: ImageView = findViewById(R.id.image_No)

        kliker.setBackgroundResource(R.drawable.clickbutton)

        vihod.setOnClickListener {
            vihod_kones.visibility = View.VISIBLE
            vihod.setClickable(false)
            koloda.setClickable(false)
            igra.setClickable(false)
            nastr.setClickable(false)

        }
        DA.setOnClickListener {
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }

        NET.setOnClickListener {
            vihod_kones.visibility = View.INVISIBLE
            kliker.visibility = View.VISIBLE
            vihod.setClickable(true)
            koloda.setClickable(true)
            igra.setClickable(true)
            nastr.setClickable(true)
        }

        koloda.setOnClickListener {
            val MyIntent = Intent(this, com.example.privet2.koloda::class.java)
            startActivity(MyIntent)
        }

        igra.setOnClickListener {
            val MyIntent = Intent(this, karta::class.java)
            startActivity(MyIntent)
        }

        var a = 1
        kliker.setOnClickListener {
            when (a){
                1 -> {kliker.setBackgroundResource(R.drawable.nomer1)}
                2 -> {kliker.setBackgroundResource(R.drawable.nomer2)}
                3 -> {kliker.setBackgroundResource(R.drawable.nomer3)}
                4 -> {kliker.setBackgroundResource(R.drawable.nomer4)}
                5 -> {kliker.setBackgroundResource(R.drawable.nomer5)}
                6 -> {kliker.setBackgroundResource(R.drawable.nomer6)}
                7 -> {kliker.setBackgroundResource(R.drawable.nomer7)}
                8 -> {kliker.setBackgroundResource(R.drawable.nomer8)}
                9 -> {kliker.setBackgroundResource(R.drawable.nomer9)}
                10 -> {
                    kliker.setBackgroundResource(R.drawable.clickbutton)
                    a = 0
                }
            }
            a++
        }


    }

    override fun onBackPressed() {
        var HON: ConstraintLayout = findViewById(R.id.hon)
        var vihod: ImageView = findViewById(R.id.image_vixod)
        var koloda: ImageView = findViewById(R.id.image_koloda)
        var igra: ImageView = findViewById(R.id.image_igra)
        var nastr: ImageView = findViewById(R.id.image_nastr)
        var kliker: ImageView = findViewById(R.id.image_kliker)
        var vihod_kones: ConstraintLayout = findViewById(R.id.constraintLayout_konez)
        var DA: ImageView = findViewById(R.id.image_Da)
        var NET: ImageView = findViewById(R.id.image_No)

        kliker.setBackgroundResource(R.drawable.clickbutton)

        vihod.setOnClickListener {
            vihod_kones.visibility = View.VISIBLE
            vihod.setClickable(false)
            koloda.setClickable(false)
            igra.setClickable(false)
            nastr.setClickable(false)

        }
        DA.setOnClickListener {
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }

        NET.setOnClickListener {
            vihod_kones.visibility = View.INVISIBLE
            kliker.visibility = View.VISIBLE
            vihod.setClickable(true)
            koloda.setClickable(true)
            igra.setClickable(true)
            nastr.setClickable(true)
        }
        vihod.performClick()
    }
}
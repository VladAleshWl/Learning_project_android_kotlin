package com.example.privet2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.privet2.karti.create_koloda


class yroveni_koloda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yroveni_koloda)

        var karta_1: ConstraintLayout = findViewById(R.id.korta_v_kolode_1)
        var karta_2: ConstraintLayout = findViewById(R.id.korta_v_kolode_2)
        var karta_3: ConstraintLayout = findViewById(R.id.korta_v_kolode_3)
        var karta_v_colode_ataka_1: ImageView = findViewById(R.id.image_karta_v_colode_xp_1)
        var karta_v_colode_xp_1: ImageView = findViewById(R.id.image_karta_v_colode_ataka_1)
        var karta_v_colode_ataka_2: ImageView = findViewById(R.id.image_karta_v_colode_xp_2)
        var karta_v_colode_xp_2: ImageView = findViewById(R.id.image_karta_v_colode_ataka_2)
        var karta_v_colode_ataka_3: ImageView = findViewById(R.id.image_karta_v_colode_xp_3)
        var karta_v_colode_xp_3: ImageView = findViewById(R.id.image_karta_v_colode_ataka_3)
        var back: Button = findViewById(R.id.button_back_yroven_koloda)
        var karti_na_vibor = create_koloda()
        var karta_nomer_1 = karti_na_vibor.get_krt1()
        var karta_nomer_3 = karti_na_vibor.get_krt3()
        var karta_nomer_2 = karti_na_vibor.get_krt2()

        karta_v_colode_xp_1.isClickable = false
        karta_v_colode_xp_2.isClickable = false
        karta_v_colode_xp_3.isClickable = false
        karta_v_colode_ataka_1.isClickable = false
        karta_v_colode_ataka_2.isClickable = false
        karta_v_colode_ataka_3.isClickable = false




        back.setOnClickListener {
            finish()
        }
        karta_1.setOnClickListener{
            karti_na_vibor.set_karta_na_pole(karta_nomer_1)
            karti_na_vibor.set_flag_deistvii_2(1)
            finish()
        }
        karta_2.setOnClickListener {
            karti_na_vibor.set_karta_na_pole(karta_nomer_2)
            karti_na_vibor.set_flag_deistvii_2(1)
            finish()
        }
        karta_3.setOnClickListener {
            karti_na_vibor.set_karta_na_pole(karta_nomer_3)
            karti_na_vibor.set_flag_deistvii_2(1)
            finish()
        }
        karta_1.setBackgroundResource(karta_nomer_1.paint)
        var xp_karti_1_icon = karta_nomer_1.xp_paint(karta_nomer_1.xp)
        var ataka_karti_1_icon = karta_nomer_1.ataka_paint()
        karta_v_colode_xp_1.setBackgroundResource(xp_karti_1_icon!!)
        karta_v_colode_ataka_1.setBackgroundResource(ataka_karti_1_icon!!)


        karta_2.setBackgroundResource(karta_nomer_2.paint)
        var xp_karti_2_icon = karta_nomer_2.xp_paint(karta_nomer_2.xp)
        var ataka_karti_2_icon = karta_nomer_2.ataka_paint()
        karta_v_colode_xp_2.setBackgroundResource(xp_karti_2_icon!!)
        karta_v_colode_ataka_2.setBackgroundResource(ataka_karti_2_icon!!)


        karta_3.setBackgroundResource(karta_nomer_3.paint)
        var xp_karti_3_icon = karta_nomer_3.xp_paint(karta_nomer_3.xp)
        var ataka_karti_3_icon = karta_nomer_3.ataka_paint()
        karta_v_colode_xp_3.setBackgroundResource(xp_karti_3_icon!!)
        karta_v_colode_ataka_3.setBackgroundResource(ataka_karti_3_icon!!)
    }
}
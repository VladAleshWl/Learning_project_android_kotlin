package com.example.privet2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.privet2.Data.Data_and_flagi
import com.example.privet2.Data.pole
import com.example.privet2.karti.create_koloda
import com.example.privet2.karti.data_karta


class yroveni_koloda : AppCompatActivity() {
    val data_flagi = Data_and_flagi()
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yroveni_koloda)

        val karta_1 = pole(findViewById(R.id.korta_v_kolode_1), findViewById(R.id.image_karta_v_colode_ataka_1), findViewById(R.id.image_karta_v_colode_xp_1), 0, 0)
        val karta_2 = pole(findViewById(R.id.korta_v_kolode_2), findViewById(R.id.image_karta_v_colode_ataka_2), findViewById(R.id.image_karta_v_colode_xp_2), 0, 0)
        val karta_3 = pole(findViewById(R.id.korta_v_kolode_3), findViewById(R.id.image_karta_v_colode_ataka_3), findViewById(R.id.image_karta_v_colode_xp_3), 0, 0)
        val back: Button = findViewById(R.id.button_back_yroven_koloda)
        val karti_na_vibor = create_koloda()
        var karta_nomer_1 = karti_na_vibor.get_krt1()
        var karta_nomer_3 = karti_na_vibor.get_krt3()         //определение карт
        var karta_nomer_2 = karti_na_vibor.get_krt2()

        karta_1.xp_image.isClickable = false
        karta_2.xp_image.isClickable = false
        karta_3.xp_image.isClickable = false
        karta_1.ataka_image.isClickable = false
        karta_2.ataka_image.isClickable = false
        karta_3.ataka_image.isClickable = false
        karti_na_vibor.set_karta_na_pole(karti_na_vibor.nety_data)


        fun sapolnenie_kart(pole_: pole, karta_numer: data_karta){
            pole_.pole.setBackgroundResource(karta_numer.paint)
            var xp_karti_icon = karta_numer.xp_paint(karta_numer.xp)
            var ataka_karti_icon = karta_numer.ataka_paint()                      //заполнение карт
            pole_.xp_image.setBackgroundResource(xp_karti_icon!!)
            pole_.ataka_image.setBackgroundResource(ataka_karti_icon!!)
        }

        fun poslanie_karti(karta: data_karta){
            karti_na_vibor.set_karta_na_pole(karta)
            karti_na_vibor.set_flag_deistvii_2(1)                    //передача карт на уровень
            finish()
        }

        fun podacha_informagii(karta: data_karta): Boolean {
            data_flagi.set_karta(karta)
            val MyIntent = Intent(this, procmotr_karti::class.java)       //переход в колоду
            startActivity(MyIntent)
            return true
        }

        back.setOnClickListener { finish() }
        karta_1.pole.setOnClickListener{ poslanie_karti(karta_nomer_1) }
        karta_2.pole.setOnClickListener { poslanie_karti(karta_nomer_2) }
        karta_3.pole.setOnClickListener { poslanie_karti(karta_nomer_3) }
        karta_1.pole.setOnLongClickListener { podacha_informagii(karta_nomer_1) }
        karta_2.pole.setOnLongClickListener { podacha_informagii(karta_nomer_2) }
        karta_3.pole.setOnLongClickListener { podacha_informagii(karta_nomer_3) }

        sapolnenie_kart(karta_1, karta_nomer_1)
        sapolnenie_kart(karta_2, karta_nomer_2)
        sapolnenie_kart(karta_3, karta_nomer_3)



    }
}
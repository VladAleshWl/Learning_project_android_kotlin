package com.example.privet2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.privet2.Data.pole
import com.example.privet2.karti.create_koloda

class koloda : AppCompatActivity() {
    val basa_kart = create_koloda()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koloda)
        supportActionBar?.hide()
        val pole_1_1 = pole(findViewById(R.id.pole_1_1_kol), findViewById(R.id.image_ataka_1_1_kol), findViewById(R.id.image_xp_1_1_kol), 0)
        val pole_1_3 = pole(findViewById(R.id.pole_1_3_kol), findViewById(R.id.image_ataka_1_3_kol), findViewById(R.id.image_xp_1_3_kol), 1)
        val pole_1_5 = pole(findViewById(R.id.pole_1_5_kol), findViewById(R.id.image_ataka_1_5_kol), findViewById(R.id.image_xp_1_5_kol), 2)
        val pole_2_1 = pole(findViewById(R.id.pole_2_1_kol), findViewById(R.id.image_ataka_2_1_kol), findViewById(R.id.image_xp_2_1_kol), 3)
        val pole_2_3 = pole(findViewById(R.id.pole_2_3_kol), findViewById(R.id.image_ataka_2_3_kol), findViewById(R.id.image_xp_2_3_kol), 4)
        val pole_2_5 = pole(findViewById(R.id.pole_2_5_kol), findViewById(R.id.image_ataka_2_5_kol), findViewById(R.id.image_xp_2_5_kol), 5)
        val pole_3_1 = pole(findViewById(R.id.pole_3_1_kol), findViewById(R.id.image_ataka_3_1_kol), findViewById(R.id.image_xp_3_1_kol), 6)
        val pole_3_3 = pole(findViewById(R.id.pole_3_3_kol), findViewById(R.id.image_ataka_3_3_kol), findViewById(R.id.image_xp_3_3_kol), 7)
        val pole_3_5 = pole(findViewById(R.id.pole_3_5_kol), findViewById(R.id.image_ataka_3_5_kol), findViewById(R.id.image_xp_3_5_kol), 8)

        fun sapolnenie(pole: pole){
            val karta = basa_kart.dai_karty_is_cpicka_get(pole.nomer)
            pole.ataka_image.setBackgroundResource(karta.ataka_paint()!!)
            pole.xp_image.setBackgroundResource(karta.xp_paint(karta.xp)!!)
            pole.pole.setBackgroundResource(karta.paint)
        }

        sapolnenie(pole_1_1)
        sapolnenie(pole_1_3)
        sapolnenie(pole_1_5)
        sapolnenie(pole_2_1)
        sapolnenie(pole_2_3)
        sapolnenie(pole_2_5)
        sapolnenie(pole_3_1)
        sapolnenie(pole_3_3)
        sapolnenie(pole_3_5)
    }
}
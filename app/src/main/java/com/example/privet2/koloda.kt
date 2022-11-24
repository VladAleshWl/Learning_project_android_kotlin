package com.example.privet2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.privet2.Data.button_flag
import com.example.privet2.Data.pole
import com.example.privet2.karti.create_koloda
import com.example.privet2.karti.data_karta

class koloda : AppCompatActivity() {
    val basa_kart = create_koloda()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koloda)
        supportActionBar?.hide()
        val kn_bli = button_flag(findViewById(R.id.image_kn_bl), R.drawable.button_blizhniki, R.drawable.koloda02, true)
        val kn_dal =  button_flag(findViewById(R.id.image_kn_dal), R.drawable.button_dalniki, R.drawable.koloda02, true)
        val kn_ipi = button_flag(findViewById(R.id.image_kn_ipi), R.drawable.button_vozvishini, R.drawable.koloda02, true)

        val pole_1_1 = pole(findViewById(R.id.pole_1_1_kol), findViewById(R.id.image_ataka_1_1_kol), findViewById(R.id.image_xp_1_1_kol), 0)
        val pole_1_3 = pole(findViewById(R.id.pole_1_3_kol), findViewById(R.id.image_ataka_1_3_kol), findViewById(R.id.image_xp_1_3_kol), 1)
        val pole_1_5 = pole(findViewById(R.id.pole_1_5_kol), findViewById(R.id.image_ataka_1_5_kol), findViewById(R.id.image_xp_1_5_kol), 2)
        val pole_2_1 = pole(findViewById(R.id.pole_2_1_kol), findViewById(R.id.image_ataka_2_1_kol), findViewById(R.id.image_xp_2_1_kol), 3)
        val pole_2_3 = pole(findViewById(R.id.pole_2_3_kol), findViewById(R.id.image_ataka_2_3_kol), findViewById(R.id.image_xp_2_3_kol), 4)
        val pole_2_5 = pole(findViewById(R.id.pole_2_5_kol), findViewById(R.id.image_ataka_2_5_kol), findViewById(R.id.image_xp_2_5_kol), 5)
        val pole_3_1 = pole(findViewById(R.id.pole_3_1_kol), findViewById(R.id.image_ataka_3_1_kol), findViewById(R.id.image_xp_3_1_kol), 6)
        val pole_3_3 = pole(findViewById(R.id.pole_3_3_kol), findViewById(R.id.image_ataka_3_3_kol), findViewById(R.id.image_xp_3_3_kol), 7)
        val pole_3_5 = pole(findViewById(R.id.pole_3_5_kol), findViewById(R.id.image_ataka_3_5_kol), findViewById(R.id.image_xp_3_5_kol), 8)

        fun sapolnenie(pole: pole, flag: Boolean){
            lateinit var karta_l: data_karta
            if (flag) { karta_l = basa_kart.dai_karty_is_cpicka_get(pole.nomer) }
            else { karta_l = basa_kart.nety_data }
            pole.ataka_image.setBackgroundResource(karta_l.ataka_paint()!!)
            pole.xp_image.setBackgroundResource(karta_l.xp_paint(karta_l.xp)!!)
            pole.pole.setBackgroundResource(karta_l.paint)
        }

        fun knopki_and_vivod(polle: pole){
            if (kn_dal.flag_1 && kn_bli.flag_1 && kn_ipi.flag_1) { sapolnenie(polle, true) }
            else if ( (!kn_dal.flag_1 && !kn_bli.flag_1) || (!kn_ipi.flag_1 && !kn_bli.flag_1) || (!kn_dal.flag_1 && !kn_ipi.flag_1)) { sapolnenie(polle, false) }
            else{
                val karta_ll = basa_kart.dai_karty_is_cpicka_get(polle.nomer)
                if (!kn_dal.flag_1) { if (karta_ll.raspolozenie == "dalnic") { sapolnenie(polle, true) } else { sapolnenie(polle, false) } }
                else if (!kn_bli.flag_1) { if (karta_ll.raspolozenie == "blihnic") { sapolnenie(polle, true) } else { sapolnenie(polle, false) } }
                else if (!kn_ipi.flag_1) { if ( 1 == 2) { sapolnenie(polle, true) } else { sapolnenie(polle, false) } }
            }
        }

        fun vipoln_sapolnenia() {
            knopki_and_vivod(pole_1_1)
            knopki_and_vivod(pole_1_3)
            knopki_and_vivod(pole_1_5)
            knopki_and_vivod(pole_2_1)
            knopki_and_vivod(pole_2_3)
            knopki_and_vivod(pole_2_5)
            knopki_and_vivod(pole_3_1)
            knopki_and_vivod(pole_3_3)
            knopki_and_vivod(pole_3_5)
        }

        kn_bli.image.setOnClickListener{
            kn_bli.flag_1 = !kn_bli.flag_1
            kn_bli.image.setBackgroundResource(kn_bli.ism_kartinki())
            vipoln_sapolnenia()
        }
        kn_dal.image.setOnClickListener{
            kn_dal.flag_1 = !kn_dal.flag_1
            kn_dal.image.setBackgroundResource(kn_dal.ism_kartinki())
            vipoln_sapolnenia()
        }
        kn_ipi.image.setOnClickListener{
            kn_ipi.flag_1 = !kn_ipi.flag_1
            kn_ipi.image.setBackgroundResource(kn_ipi.ism_kartinki())
            vipoln_sapolnenia()
        }

        //выполнять
        kn_ipi.image.setBackgroundResource(kn_ipi.kartinka1)
        kn_bli.image.setBackgroundResource(kn_bli.kartinka1)
        kn_dal.image.setBackgroundResource(kn_dal.kartinka1)
        vipoln_sapolnenia()
    }
}
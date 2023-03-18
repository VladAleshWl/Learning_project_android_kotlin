package com.example.privet2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.privet2.Data.Data_and_flagi
import com.example.privet2.Data.button_flag
import com.example.privet2.Data.pole
import com.example.privet2.karti.create_koloda
import com.example.privet2.karti.data_karta

class koloda : AppCompatActivity() {
    val basa_kart = create_koloda()
    val data_flag = Data_and_flagi()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koloda)
        supportActionBar?.hide()
        val kn_bli = button_flag(findViewById(R.id.image_kn_bl), R.drawable.button_blizhniki, R.drawable.no_blizhniki, true)   //задание кнопок отбора
        val kn_dal =  button_flag(findViewById(R.id.image_kn_dal), R.drawable.button_dalniki, R.drawable.no_dalniki, true)
        val kn_ipi = button_flag(findViewById(R.id.image_kn_ipi), R.drawable.button_vozvishini, R.drawable.no_vozvishini, true)

        val pole_1_1 = pole(findViewById(R.id.pole_1_1_kol), findViewById(R.id.image_ataka_1_1_kol), findViewById(R.id.image_xp_1_1_kol),0,0)
        val pole_1_3 = pole(findViewById(R.id.pole_1_3_kol), findViewById(R.id.image_ataka_1_3_kol), findViewById(R.id.image_xp_1_3_kol),0,0)
        val pole_1_5 = pole(findViewById(R.id.pole_1_5_kol), findViewById(R.id.image_ataka_1_5_kol), findViewById(R.id.image_xp_1_5_kol),0,0)
        val pole_2_1 = pole(findViewById(R.id.pole_2_1_kol), findViewById(R.id.image_ataka_2_1_kol), findViewById(R.id.image_xp_2_1_kol),0,0)
        val pole_2_3 = pole(findViewById(R.id.pole_2_3_kol), findViewById(R.id.image_ataka_2_3_kol), findViewById(R.id.image_xp_2_3_kol),0,0)
        val pole_2_5 = pole(findViewById(R.id.pole_2_5_kol), findViewById(R.id.image_ataka_2_5_kol), findViewById(R.id.image_xp_2_5_kol),0,0)
        val pole_3_1 = pole(findViewById(R.id.pole_3_1_kol), findViewById(R.id.image_ataka_3_1_kol), findViewById(R.id.image_xp_3_1_kol),0,0)
        val pole_3_3 = pole(findViewById(R.id.pole_3_3_kol), findViewById(R.id.image_ataka_3_3_kol), findViewById(R.id.image_xp_3_3_kol),0,0)
        val pole_3_5 = pole(findViewById(R.id.pole_3_5_kol), findViewById(R.id.image_ataka_3_5_kol), findViewById(R.id.image_xp_3_5_kol),0,0)

        var i_for_pole: Int = 0
        val net: data_karta = basa_kart.nety_data
        val spisok_polei = listOf<pole>(pole_1_1, pole_1_3, pole_1_5, pole_2_1, pole_2_3, pole_2_5,
            pole_3_1, pole_3_3, pole_3_5)
        var spisok_fo_click = mutableListOf<data_karta>(net, net, net, net, net, net, net, net, net)

        fun sapolnenie(karta_: data_karta, flag: Boolean){    //заполнение полей
            lateinit var karta_l: data_karta
            if (flag) { karta_l = karta_ }
            else {}
            var pole = spisok_polei.get(i_for_pole)
            pole.ataka_image.setBackgroundResource(karta_l.ataka_paint(karta_l.ataka)!!)
            pole.xp_image.setBackgroundResource(karta_l.xp_paint(karta_l.xp)!!)
            pole.pole.setBackgroundResource(karta_l.paint)
            if (karta_l == basa_kart.nety_data) { pole.pole.isClickable = false }
            else { pole.pole.isClickable = true }
            spisok_fo_click[i_for_pole] = karta_l
            i_for_pole += 1
        }

        fun knopki_and_vivod(karta_ll: data_karta){
            if (karta_ll == basa_kart.nety_data) { sapolnenie(karta_ll, true) }
            else if (kn_dal.flag_1 && kn_bli.flag_1 && kn_ipi.flag_1) { sapolnenie(karta_ll, true) }   //проверка уславой в выборке
            else if (!kn_dal.flag_1) { if (karta_ll.raspolozenie == "dalnic") { sapolnenie(karta_ll, true) }  }
            else if (!kn_bli.flag_1) { if (karta_ll.raspolozenie == "blihnic") { sapolnenie(karta_ll, true) }  }
            else if (!kn_ipi.flag_1) { if ( 1 == 2) { sapolnenie(karta_ll, true) } }

        }

        fun vipoln_sapolnenia() {
            i_for_pole = 0
            for (karta__a in basa_kart.nabor_kart) { knopki_and_vivod(karta__a) }
            for (karta__a in basa_kart.nabor_kart_vragi) { knopki_and_vivod(karta__a) }   //перебор всех карт в игре
            while (i_for_pole < spisok_polei.size) {
                knopki_and_vivod(basa_kart.nety_data)
            }
        }

        fun knopki_click(kn_: button_flag){
            kn_.flag_1 = !kn_.flag_1
            kn_.image.setBackgroundResource(kn_.ism_kartinki())
            vipoln_sapolnenia()
        }
        fun pole_click(nomer: Int){
            data_flag.set_karta(spisok_fo_click[nomer])
            val MyIntent = Intent(this, procmotr_karti::class.java)       //переход в колоду
            startActivity(MyIntent)
        }

        kn_bli.image.setOnClickListener{
            knopki_click(kn_bli)
            kn_dal.image.isClickable = kn_bli.flag_1

        }
        kn_dal.image.setOnClickListener{
            knopki_click(kn_dal)
            kn_bli.image.isClickable = kn_dal.flag_1
        }
        kn_ipi.image.setOnClickListener{
            knopki_click(kn_ipi)
        }

        pole_1_1.pole.setOnClickListener { pole_click(0) }
        pole_1_3.pole.setOnClickListener { pole_click(1) }
        pole_1_5.pole.setOnClickListener { pole_click(2) }
        pole_2_1.pole.setOnClickListener { pole_click(3) }
        pole_2_3.pole.setOnClickListener { pole_click(4) }
        pole_2_5.pole.setOnClickListener { pole_click(5) }
        pole_3_1.pole.setOnClickListener { pole_click(6) }
        pole_3_3.pole.setOnClickListener { pole_click(7) }
        pole_3_5.pole.setOnClickListener { pole_click(8) }

        //выполнять
        kn_ipi.image.setBackgroundResource(kn_ipi.kartinka1)
        kn_bli.image.setBackgroundResource(kn_bli.kartinka1)      //задания цвета кнопок
        kn_dal.image.setBackgroundResource(kn_dal.kartinka1)
        vipoln_sapolnenia()
        kn_ipi.image.isClickable = false



    }
}
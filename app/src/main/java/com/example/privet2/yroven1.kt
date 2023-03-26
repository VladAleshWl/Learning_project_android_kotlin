package com.example.privet2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.privet2.Data.Data_and_flagi
import com.example.privet2.Data.pole
import com.example.privet2.karti.Rares.Rare
import com.example.privet2.karti.create_koloda
import com.example.privet2.karti.data_karta
import com.example.privet2.karti.kolodi
import com.example.privet2.karti.unic_vragi
import kotlin.random.Random


class yroven1 : AppCompatActivity() {
    lateinit var carta_ctavit: data_karta
    val basa_cart = create_koloda()
    val koloda = kolodi()
    val ynic = unic_vragi()
    val basa_fkagov = Data_and_flagi
    var flag_deictvia: Int = 0
    var flag_bloca_vcex: Boolean = true
    var prov_11 = 0
    var prov_12 = 0
    var prov_21 = 0
    var prov_22 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yroven1)
        supportActionBar?.hide()

        val igra_vuhod: ImageView = findViewById(R.id.image_igra_vuhod)
        val igra_igrat: ImageView = findViewById(R.id.image_igra_igrat)
        val pole_1_1 = pole(findViewById(R.id.laiaut_1_1), findViewById(R.id.image_1_1_ataka), findViewById(R.id.image_1_1_xp), nationality = "dalnic")
        val pole_1_2 = pole(findViewById(R.id.laiaut_1_2), findViewById(R.id.image_1_2_ataka), findViewById(R.id.image_1_2_xp), nationality = "blihnic")
        val pole_2_1 = pole(findViewById(R.id.laiaut_2_1), findViewById(R.id.image_2_1_ataka), findViewById(R.id.image_2_1_xp), nationality = "dalnic")
        val pole_2_2 = pole(findViewById(R.id.laiaut_2_2), findViewById(R.id.image_2_2_ataka), findViewById(R.id.image_2_2_xp), nationality = "blihnic")
        val pole_1_3 = pole(findViewById(R.id.laiaut_1_3), findViewById(R.id.image_1_3_ataka), findViewById(R.id.image_1_3_xp))
        val pole_1_4 = pole(findViewById(R.id.laiaut_1_4), findViewById(R.id.image_1_4_ataka), findViewById(R.id.image_1_4_xp))
        val pole_2_3 = pole(findViewById(R.id.laiaut_2_3), findViewById(R.id.image_2_3_ataka), findViewById(R.id.image_2_3_xp))
        val pole_2_4 = pole(findViewById(R.id.laiaut_2_4), findViewById(R.id.image_2_4_ataka), findViewById(R.id.image_2_4_xp))
        val yverenu: ConstraintLayout = findViewById(R.id.konsol_yverenu)
        val ppole: ConstraintLayout = findViewById(R.id.IPPPPPPPP)
        val otkrit_kolody: ImageView = findViewById(R.id.image_koloda_v_igre)
        val ctart: ImageView = findViewById(R.id.image_ctart)
        val xp_my: TextView = findViewById(R.id.text_xp_nahi)
        val xp_vrag: TextView = findViewById(R.id.text_xp_vraga)
        var my_xp_chislo:Int = basa_fkagov.xp_persov()[0]
        var vrag_xp_chislo:Int = basa_fkagov.xp_persov()[1]
        var otdix: Int
        var hod = 1
        var poli = listOf<pole>(pole_1_1, pole_1_2, pole_2_1, pole_2_2, pole_1_3, pole_1_4, pole_2_3, pole_2_4)

        val nabor_kart_dalnici = koloda.koloda_fo_lvl_dalnic(basa_fkagov.yroven_now)
        val nabor_zentr = koloda.koloda_fo_lvl_zentr(basa_fkagov.yroven_now)
        val nabor_kart_blihnic = koloda.koloda_fo_lvl_blihnic(basa_fkagov.yroven_now)
        val nabor_kart_vragi_blihnic = koloda.koloda_fo_lvl__vragi_blihnic(basa_fkagov.yroven_now)
        val nabor_kart_vragi_dalnici = koloda.koloda_fo_lvl_vragi_dalnici(basa_fkagov.yroven_now)


        basa_cart.set_krt1(basa_cart.nyhen_dalnici(nabor_kart_dalnici))
        basa_cart.set_krt2(basa_cart.nyhen_zenter(nabor_zentr))
        basa_cart.set_krt3(basa_cart.nyhen_blihnic(nabor_kart_blihnic))
        basa_cart.set_flag_deistvii_2(0)

        xp_vrag.setText(vrag_xp_chislo.toString())
        xp_my.setText(my_xp_chislo.toString())
        ppole.setBackgroundResource(basa_fkagov.hon_yrovni())

        otkrit_kolody.setBackgroundResource(R.drawable.koloda)
        yverenu.setBackgroundResource(R.drawable.button_game)



        fun opnova(pole: pole){    //обновление карт, их хп и фона в зависимости от хп
            if (pole.xp_now < 1){ flag_deictvia = 1 }
            else{ flag_deictvia = 2 }
            pole.pole.performClick()
        }

        fun blok_poli_nahe(blok: Boolean){
            pole_1_1.pole.isClickable = blok
            pole_1_2.pole.isClickable = blok
            pole_2_1.pole.isClickable = blok          //блок клика союзного поля
            pole_2_2.pole.isClickable = blok
            otkrit_kolody.isClickable = blok
        }
        fun blok_poli_vrag(blok: Boolean){
            pole_1_3.pole.isClickable = blok
            pole_1_4.pole.isClickable = blok         //блок клика вражеского поля
            pole_2_3.pole.isClickable = blok
            pole_2_4.pole.isClickable = blok
        }




        fun paysa(){                                              //пауза
        }

        fun obnova_all_vrag(){                       //обновления враж. поля
            xp_vrag.setText(vrag_xp_chislo.toString())
            blok_poli_vrag(true)
            carta_ctavit = basa_cart.nety_data
            opnova(pole_2_4)
            opnova(pole_2_3)
            opnova(pole_1_4)
            opnova(pole_1_3)
            blok_poli_vrag(false)
        }

        fun obnova_all_nahi(){                       //обновления нашего поля
            xp_vrag.setText(vrag_xp_chislo.toString())
            blok_poli_vrag(true)
            carta_ctavit = basa_cart.nety_data
            opnova(pole_2_2)
            opnova(pole_2_1)       //обновления союзн. поля
            opnova(pole_1_1)
            opnova(pole_1_2)
            blok_poli_vrag(false)
        }

        fun pays_obn(){                                   //анимация
            obnova_all_vrag()
            obnova_all_nahi()
            paysa()
        }

        fun sposobnosti_ctavit(posihn: pole){          // ЭФЕКТЫ КАРТЫ!!!!
            var cpos = Rare(poli, posihn)
            if (posihn.rare != "common" && posihn.rare in cpos.cpisok_pri_poivlenie) {
                cpos.rare = cpos.give_efect_spawn(posihn.rare)
                cpos.vsaim()
                pays_obn()
            }
        }

        fun sposobnosti_ataka(posihn: pole){          // ЭФЕКТЫ КАРТЫ!!!!
            var cpos = Rare(poli, posihn)
            if (posihn.rare != "common" && posihn.rare in cpos.cpisok_pri_atake) {
                cpos.rare = cpos.give_efect_ataki(posihn.rare)
                cpos.vsaim()
                pays_obn()
            }
        }

        fun sposobnosti_vait(posihn: pole){          // ЭФЕКТЫ КАРТЫ!!!!
            if (posihn.rare != "common") {
                var cpos = Rare(poli, posihn)
                cpos.rare = cpos.give_efect_vait(posihn.rare)
                cpos.vsaim()
                pays_obn()
            }
        }



        fun sapolnenie_poli(pole_: pole){              //заполнение карт на поле
            if (flag_deictvia == 1){
                if (flag_bloca_vcex) { blok_poli_nahe(false) }

                pole_.xp_now = carta_ctavit.xp
                pole_.ataka_now = carta_ctavit.ataka
                var xp_karti_icon = carta_ctavit.xp_paint(pole_.xp_now)
                var ataka_karti_icon = carta_ctavit.ataka_paint(pole_.ataka_now)
                if ((ataka_karti_icon != null) && (xp_karti_icon != null)) {
                    pole_.ataka_image.setBackgroundResource(ataka_karti_icon)
                    pole_.xp_image.setBackgroundResource(xp_karti_icon)
                    }
                pole_.pole.setBackgroundResource(carta_ctavit.paint)
                otkrit_kolody.setBackgroundResource(R.drawable.koloda)
                pole_.rare = carta_ctavit.rare
                sposobnosti_ctavit(pole_)
            }
            if (flag_deictvia == 2) {
                var xp_karti_icon = carta_ctavit.xp_paint(pole_.xp_now)
                var ataca_karti_icon = carta_ctavit.ataka_paint(pole_.ataka_now)
                pole_.xp_image.setBackgroundResource(xp_karti_icon!!)
                pole_.ataka_image.setBackgroundResource(ataca_karti_icon!!)
                pole_.pole.isClickable = false

            }}

        igra_vuhod.setOnClickListener {       //  выход
            finish()
        }
        igra_igrat.setOnClickListener {                 //решение - играть
            yverenu.visibility = View.INVISIBLE
            pole_1_1.pole.visibility = View.VISIBLE
            pole_1_2.pole.visibility = View.VISIBLE
            pole_1_3.pole.visibility = View.VISIBLE
            pole_1_4.pole.visibility = View.VISIBLE
            pole_2_1.pole.visibility = View.VISIBLE
            pole_2_2.pole.visibility = View.VISIBLE
            pole_2_3.pole.visibility = View.VISIBLE
            pole_2_4.pole.visibility = View.VISIBLE
            ctart.isClickable = true
            otkrit_kolody.isClickable = true
            pole_2_4.pole.isClickable = false
            pole_2_3.pole.isClickable = false
            pole_1_4.pole.isClickable = false
            pole_1_3.pole.isClickable = false
        }

        otkrit_kolody.setOnClickListener {
            basa_cart.set_flag_deistvii_2(0)
            flag_deictvia = basa_cart.get_flag_deistvii_2()
            otkrit_kolody.setBackgroundResource(R.drawable.ne_koloda)
            val intent = Intent(this, yroveni_koloda::class.java) //переход в колоду
            startActivity(intent)
        }

        pole_1_1.pole.setOnClickListener { if (carta_ctavit.raspolozenie == pole_1_1.nationality || carta_ctavit.raspolozenie == "all") {sapolnenie_poli(pole_1_1)} }
        pole_1_2.pole.setOnClickListener { if (carta_ctavit.raspolozenie == pole_1_2.nationality || carta_ctavit.raspolozenie == "all") {sapolnenie_poli(pole_1_2)} }
        pole_2_1.pole.setOnClickListener { if (carta_ctavit.raspolozenie == pole_2_1.nationality || carta_ctavit.raspolozenie == "all") {sapolnenie_poli(pole_2_1)} }
        pole_2_2.pole.setOnClickListener { if (carta_ctavit.raspolozenie == pole_2_2.nationality || carta_ctavit.raspolozenie == "all") {sapolnenie_poli(pole_2_2)} }
        pole_1_3.pole.setOnClickListener { sapolnenie_poli(pole_1_3) }
        pole_1_4.pole.setOnClickListener { sapolnenie_poli(pole_1_4) }
        pole_2_3.pole.setOnClickListener { sapolnenie_poli(pole_2_3) }
        pole_2_4.pole.setOnClickListener { sapolnenie_poli(pole_2_4) }

        fun yron__linia(){                          //урон по врагу
            sposobnosti_ataka(pole_1_1)
            sposobnosti_ataka(pole_1_2)
            sposobnosti_ataka(pole_2_1)
            sposobnosti_ataka(pole_2_2)
            vrag_xp_chislo -= pole_1_4.polychenie_yrona(pole_1_3.polychenie_yrona(pole_1_2.ataka_now))
            vrag_xp_chislo -= pole_1_4.polychenie_yrona(pole_1_3.polychenie_yrona(pole_1_1.ataka_now))
            vrag_xp_chislo -= pole_2_4.polychenie_yrona(pole_2_3.polychenie_yrona(pole_2_2.ataka_now))
            vrag_xp_chislo -= pole_2_4.polychenie_yrona(pole_2_3.polychenie_yrona(pole_2_1.ataka_now))
        }

        fun yron__linia_nam(){                          //урон по нам
            sposobnosti_ataka(pole_1_4)
            sposobnosti_ataka(pole_1_3)
            sposobnosti_ataka(pole_2_4)
            sposobnosti_ataka(pole_2_3)
            my_xp_chislo -= pole_1_1.polychenie_yrona(pole_1_2.polychenie_yrona(pole_1_3.ataka_now))
            my_xp_chislo -= pole_1_1.polychenie_yrona(pole_1_2.polychenie_yrona(pole_1_4.ataka_now))
            my_xp_chislo -= pole_2_1.polychenie_yrona(pole_2_2.polychenie_yrona(pole_2_3.ataka_now))
            my_xp_chislo -= pole_2_1.polychenie_yrona(pole_2_2.polychenie_yrona(pole_2_4.ataka_now))
        }



        ctart.setOnClickListener {                         //конец хода
            yron__linia()       //урон соузного поля

            blok_poli_vrag(true)
            if (vrag_xp_chislo < 1) {       //проверка жизний
                basa_fkagov.flag_1_go_yr = true
                finish()
            }
            flag_deictvia = 1
            if ((pole_2_4.xp_now != 0) && (pole_2_3.xp_now != 0) && (pole_1_3.xp_now != 0) && (pole_1_4.xp_now != 0)) { otdix = 1}
            else if(!ynic.ocob_xod(hod)){
                carta_ctavit = basa_cart.ocobo()
                if (pole_2_3.xp_now == 0){
                    pole_2_3.pole.performClick() }
                else if (pole_1_3.xp_now == 0){ pole_1_3.pole.performClick() }
            } else {
            var xod_vraga: Int = Random.nextInt(3)
            when (xod_vraga) {    //выстовление карт врага
                0 -> { carta_ctavit = basa_cart.nyhen_blihnic_vrag(nabor_kart_vragi_blihnic)
                    if (pole_2_3.xp_now < 1) { pole_2_3.pole.performClick() }
                    else { pole_1_3.pole.performClick() }}
                1 -> { carta_ctavit = basa_cart.nyhen_blihnic_vrag(nabor_kart_vragi_blihnic)
                    if (pole_1_3.xp_now < 1) { pole_1_3.pole.performClick() }
                    else { pole_2_3.pole.performClick() }}
                2 -> { carta_ctavit = basa_cart.nyhen_dalnici_vrag(nabor_kart_vragi_dalnici)
                    if (pole_2_4.xp_now < 1) { pole_2_4.pole.performClick() }
                    else { pole_1_4.pole.performClick() }}
                3 -> { carta_ctavit = basa_cart.nyhen_dalnici_vrag(nabor_kart_vragi_dalnici)
                    if (pole_1_4.xp_now < 1) { pole_1_4.pole.performClick() }
                    else { pole_2_4.pole.performClick() }}
            }}


            blok_poli_vrag(false)
            yron__linia_nam()                               //урон по нам
                xp_my.setText(my_xp_chislo.toString())
            blok_poli_nahe(true)
            carta_ctavit = basa_cart.nety_data
            flag_bloca_vcex = false
            //activaich_ehectov()
            pays_obn()

            flag_deictvia = 0
                if (my_xp_chislo < 1) { finish() }            //проверка жизний
            basa_cart.set_krt1(basa_cart.nyhen_dalnici(nabor_kart_dalnici))
            basa_cart.set_krt2(basa_cart.nyhen_zenter(nabor_zentr))
            basa_cart.set_krt3(basa_cart.nyhen_blihnic(nabor_kart_blihnic))
            otkrit_kolody.setBackgroundResource(R.drawable.koloda)
            basa_cart.set_flag_deistvii_2(0)
            flag_bloca_vcex = true
            prov_11 = pole_1_1.xp_now
            prov_12 = pole_1_2.xp_now        //резервное хранение хп карт
            prov_21 = pole_2_1.xp_now
            prov_22 = pole_2_2.xp_now
            hod += 1
        }
        otkrit_kolody.setClickable(false)
        ctart.setClickable(false)
    }
    override fun onResume() {        //запись данных после колоды
        super.onResume()
        val pole_1_2 = pole(findViewById(R.id.laiaut_1_2), findViewById(R.id.image_1_2_ataka), findViewById(R.id.image_1_2_xp))
        val pole_2_1 = pole(findViewById(R.id.laiaut_2_1), findViewById(R.id.image_2_1_ataka), findViewById(R.id.image_2_1_xp))
        val pole_2_2 = pole(findViewById(R.id.laiaut_2_2), findViewById(R.id.image_2_2_ataka), findViewById(R.id.image_2_2_xp))
        val pole_1_1 = pole(findViewById(R.id.laiaut_1_1), findViewById(R.id.image_1_1_ataka), findViewById(R.id.image_1_1_xp))
        var otkrit_kolody: ImageView = findViewById(R.id.image_koloda_v_igre)
        flag_deictvia = basa_cart.get_flag_deistvii_2()
        carta_ctavit = basa_cart.get_karta_na_pole()
        if (basa_cart.get_flag_deistvii_2() == 0)  {
            otkrit_kolody.setBackgroundResource(R.drawable.koloda)
            pole_1_1.pole.isClickable = false
            pole_1_2.pole.isClickable = false
            pole_2_1.pole.isClickable = false
            pole_2_2.pole.isClickable = false
        }
        if (basa_cart.get_flag_deistvii_2() == 1)  {
            pole_1_1.pole.isClickable = true
            pole_1_2.pole.isClickable = true
            pole_2_1.pole.isClickable = true
            pole_2_2.pole.isClickable = true
        }
        if (prov_11 > 0 ) { pole_1_1.pole.isClickable = false }
        if (prov_12 > 0 ) { pole_1_2.pole.isClickable = false }
        if (prov_21 > 0 ) { pole_2_1.pole.isClickable = false }
        if (prov_22 > 0 ) { pole_2_2.pole.isClickable = false }
    }

    override fun onBackPressed() {              //предотвращение случ. выхода
        var yverenu: ConstraintLayout = findViewById(R.id.konsol_yverenu)
        var igra_vuhod: ImageView = findViewById(R.id.image_igra_vuhod)
        var igra_igrat: ImageView = findViewById(R.id.image_igra_igrat)
        yverenu.setBackgroundResource(R.drawable.button_exit_game)
        yverenu.visibility = View.VISIBLE

        igra_vuhod.setOnClickListener {
            yverenu.visibility = View.INVISIBLE
        }
        igra_igrat.setOnClickListener {
            finish()
        }
    }
}
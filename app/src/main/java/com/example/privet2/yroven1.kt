package com.example.privet2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.privet2.Data.Data_and_flagi
import com.example.privet2.karti.create_koloda
import com.example.privet2.karti.data_karta
import kotlin.random.Random



class yroven1 : AppCompatActivity() {
    lateinit var carta: String
    var flag_deictvia: Int = 0
    var flag_bloca_vcex: Boolean = true
    lateinit var carta_ctavit: data_karta
    var basa_cart = create_koloda()
    var basa_fkagov = Data_and_flagi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yroven1)
        supportActionBar?.hide()
        var pole_1_1_ataca: ImageView = findViewById(R.id.image_1_1_xp)
        var pole_1_1_xp: ImageView = findViewById(R.id.image_1_1_ataka)
        var pole_1_2_ataca: ImageView = findViewById(R.id.image_1_2_xp)
        var pole_1_2_xp: ImageView = findViewById(R.id.image_1_2_ataka)
        var pole_2_1_ataca: ImageView = findViewById(R.id.image_2_1_xp)
        var pole_2_1_xp: ImageView = findViewById(R.id.image_2_1_ataka)
        var pole_2_2_ataca: ImageView = findViewById(R.id.image_2_2_xp)
        var pole_2_2_xp: ImageView = findViewById(R.id.image_2_2_ataka)
        var pole_1_3_ataca: ImageView = findViewById(R.id.image_1_3_xp)
        var pole_1_3_xp: ImageView = findViewById(R.id.image_1_3_ataka)
        var pole_1_4_ataca: ImageView = findViewById(R.id.image_1_4_xp)
        var pole_1_4_xp: ImageView = findViewById(R.id.image_1_4_ataka)
        var pole_2_3_ataca: ImageView = findViewById(R.id.image_2_3_xp)
        var pole_2_3_xp: ImageView = findViewById(R.id.image_2_3_ataka)
        var pole_2_4_ataca: ImageView = findViewById(R.id.image_2_4_xp)
        var pole_2_4_xp: ImageView = findViewById(R.id.image_2_4_ataka)
        var igra_vuhod: ImageView = findViewById(R.id.image_igra_vuhod)
        var igra_igrat: ImageView = findViewById(R.id.image_igra_igrat)
        var pole_1_1: ConstraintLayout = findViewById(R.id.laiaut_1_1)
        var pole_1_2: ConstraintLayout = findViewById(R.id.laiaut_1_2)
        var pole_1_3: ConstraintLayout = findViewById(R.id.laiaut_1_3)
        var pole_1_4: ConstraintLayout = findViewById(R.id.laiaut_1_4)
        var pole_2_1: ConstraintLayout = findViewById(R.id.laiaut_2_1)
        var pole_2_2: ConstraintLayout = findViewById(R.id.laiaut_2_2)
        var pole_2_3: ConstraintLayout = findViewById(R.id.laiaut_2_3)
        var pole_2_4: ConstraintLayout = findViewById(R.id.laiaut_2_4)
        var yverenu: ConstraintLayout = findViewById(R.id.konsol_yverenu)
        var otkrit_kolody: ImageView = findViewById(R.id.image_koloda_v_igre)
        var ctart: ImageView = findViewById(R.id.image_ctart)
        var xp_my: TextView = findViewById(R.id.text_xp_nahi)
        var xp_vrag: TextView = findViewById(R.id.text_xp_vraga)
        var my_xp_chislo:Int = 50
        var vrag_xp_chislo:Int = 50
        var xp_poli_1_1_now = 0
        var ataca_poli_1_1_now = 0
        var xp_poli_1_2_now = 0
        var ataca_poli_1_2_now = 0
        var xp_poli_2_1_now = 0
        var ataca_poli_2_1_now = 0
        var xp_poli_2_2_now = 0
        var ataca_poli_2_2_now = 0
        var xp_poli_1_3_now = 0
        var ataca_poli_1_3_now = 0
        var xp_poli_1_4_now = 0
        var ataca_poli_1_4_now = 0
        var xp_poli_2_3_now = 0
        var ataca_poli_2_3_now = 0
        var xp_poli_2_4_now = 0
        var ataca_poli_2_4_now = 0
        var otdix: Int

        basa_cart.set_krt1(basa_cart.nyhen_dalnici())
        basa_cart.set_krt2(basa_cart.nyhen_zenter())
        basa_cart.set_krt3(basa_cart.nyhen_blihnic())

        otkrit_kolody.setClickable(false)
        ctart.setClickable(false)
        otkrit_kolody.setBackgroundResource(R.drawable.koloda)
        yverenu.setBackgroundResource(R.drawable.button_game)



        fun opnova(pole: ConstraintLayout, xp: Int){
            if (xp < 1){ flag_deictvia = 1 }
            else{ flag_deictvia = 2 }
            pole.performClick()
        }

        fun blok_poli_nahe(blok: Boolean){
            pole_1_1.isClickable = blok
            pole_1_2.isClickable = blok
            pole_2_1.isClickable = blok
            pole_2_2.isClickable = blok
            otkrit_kolody.isClickable = blok
        }
        fun blok_poli_vrag(blok: Boolean){
            pole_1_3.isClickable = blok
            pole_1_4.isClickable = blok
            pole_2_3.isClickable = blok
            pole_2_4.isClickable = blok
        }

        fun yron__linia(yron: Int, blignic: Int, dalnic: Int, vrag: Int): List<Int>{
            var xp_blignika: Int =  blignic
            var xp_dalnika: Int = dalnic
            var vrag_xp: Int = vrag

            if (blignic > 0) {
                xp_blignika -= yron
                if (xp_blignika <= 0)        {xp_blignika = 0}
            }else{
                if (dalnic > 0){
                    xp_dalnika -= yron
                    if (xp_dalnika <= 0)        {xp_dalnika = 0}
                }else{
                    vrag_xp = vrag_xp - yron
                }
            }
            var dannie: List<Int> = listOf(xp_blignika, xp_dalnika, vrag_xp)
            return dannie
        }

        igra_vuhod.setOnClickListener {
            finish()
        }
        igra_igrat.setOnClickListener {
            yverenu.visibility = View.INVISIBLE
            pole_1_1.visibility = View.VISIBLE
            pole_1_2.visibility = View.VISIBLE
            pole_1_3.visibility = View.VISIBLE
            pole_1_4.visibility = View.VISIBLE
            pole_2_1.visibility = View.VISIBLE
            pole_2_2.visibility = View.VISIBLE
            pole_2_3.visibility = View.VISIBLE
            pole_2_4.visibility = View.VISIBLE
            ctart.isClickable = true
            otkrit_kolody.isClickable = true
            pole_2_4.isClickable = false
            pole_2_3.isClickable = false
            pole_1_4.isClickable = false
            pole_1_3.isClickable = false
            /*Сделать раздачу карт, чтобы они появлялись в активити колода. Дальше - нажатие на карту
            переносит обратно на активити, замения кнопку колоды крестиком ( которая возвращает назад
            и обнуляет значение флажка - поставления карты). Ктик на поле задает параметор
            кнопки (флаг поставки), но проверяет стоит ли он там. Если все заняты возвращает активити
            колоды и завершает его. А боевка будет по свойством класса кнопки ( надо добавить) про
            хп и урон. Старт поочередо наносит урон кнопок, даже если равен = 0, и делает проверку
            хп карт. Если оно не было равно 0, но стало 0, убираем карту Если было равно 0, то
            переносим урон след. карте или главе в зависимости от пазиции*/
        }

        otkrit_kolody.setOnClickListener {
            otkrit_kolody.setBackgroundResource(R.drawable.ne_koloda)
            val intent = Intent(this, yroveni_koloda::class.java)
            startActivity(intent)
        }

        pole_1_1.setOnClickListener {
            if (flag_deictvia == 1){
                if (flag_bloca_vcex) {blok_poli_nahe(false)}

                xp_poli_1_1_now = carta_ctavit.xp
                ataca_poli_1_1_now = carta_ctavit.ataka
                var xp_karti_1_1_icon = carta_ctavit.xp_paint(xp_poli_1_1_now)
                var ataka_karti_1_1_icon = carta_ctavit.ataka_paint()
                if ((ataka_karti_1_1_icon != null) && (xp_karti_1_1_icon != null)) {
                    pole_1_1_ataca.setBackgroundResource(ataka_karti_1_1_icon)
                    pole_1_1_xp.setBackgroundResource(xp_karti_1_1_icon)
                }
                pole_1_1.setBackgroundResource(carta_ctavit.paint)
                otkrit_kolody.setBackgroundResource(R.drawable.koloda)
            }
            if (flag_deictvia == 2) {
                var xp_karti_1_1_icon = carta_ctavit.xp_paint(xp_poli_1_1_now)
                pole_1_1_xp.setBackgroundResource(xp_karti_1_1_icon!!)
                pole_1_1.isClickable = false
            }
        }
        pole_1_2.setOnClickListener {
            if (flag_deictvia == 1){
                if (flag_bloca_vcex) {blok_poli_nahe(false)}

                xp_poli_1_2_now = carta_ctavit.xp
                ataca_poli_1_2_now = carta_ctavit.ataka
                var xp_karti_1_2_icon = carta_ctavit.xp_paint(xp_poli_1_2_now)
                var ataka_karti_1_2_icon = carta_ctavit.ataka_paint()
                if ((ataka_karti_1_2_icon != null) && (xp_karti_1_2_icon != null)) {
                    pole_1_2_ataca.setBackgroundResource(ataka_karti_1_2_icon)
                    pole_1_2_xp.setBackgroundResource(xp_karti_1_2_icon)
                }
                pole_1_2.setBackgroundResource(carta_ctavit.paint)
                otkrit_kolody.setBackgroundResource(R.drawable.koloda)
            }
            if (flag_deictvia == 2) {
                var xp_karti_1_2_icon = carta_ctavit.xp_paint(xp_poli_1_2_now)
                pole_1_2_xp.setBackgroundResource(xp_karti_1_2_icon!!)
                pole_1_2.isClickable = false
            }
        }
        pole_2_1.setOnClickListener {
            if (flag_deictvia == 1){
                if (flag_bloca_vcex) {blok_poli_nahe(false)}

                xp_poli_2_1_now = carta_ctavit.xp
                ataca_poli_2_1_now = carta_ctavit.ataka
                var xp_karti_2_1_icon = carta_ctavit.xp_paint(xp_poli_2_1_now)
                var ataka_karti_2_1_icon = carta_ctavit.ataka_paint()
                if ((ataka_karti_2_1_icon != null) && (xp_karti_2_1_icon != null)) {
                    pole_2_1_ataca.setBackgroundResource(ataka_karti_2_1_icon)
                    pole_2_1_xp.setBackgroundResource(xp_karti_2_1_icon)
                }
                pole_2_1.setBackgroundResource(carta_ctavit.paint)
                otkrit_kolody.setBackgroundResource(R.drawable.koloda)
            }
            if (flag_deictvia == 2) {
                var xp_karti_2_1_icon = carta_ctavit.xp_paint(xp_poli_2_1_now)
                pole_2_1_xp.setBackgroundResource(xp_karti_2_1_icon!!)
                pole_2_1.isClickable = false
            }
        }
        pole_2_2.setOnClickListener {
            if (flag_deictvia == 1){
                if (flag_bloca_vcex) {blok_poli_nahe(false)}

                xp_poli_2_2_now = carta_ctavit.xp
                ataca_poli_2_2_now = carta_ctavit.ataka
                var xp_karti_2_2_icon = carta_ctavit.xp_paint(xp_poli_2_2_now)
                var ataka_karti_2_2_icon = carta_ctavit.ataka_paint()
                if ((ataka_karti_2_2_icon != null) && (xp_karti_2_2_icon != null)) {
                    pole_2_2_ataca.setBackgroundResource(ataka_karti_2_2_icon)
                    pole_2_2_xp.setBackgroundResource(xp_karti_2_2_icon)
                }
                pole_2_2.setBackgroundResource(carta_ctavit.paint)
                otkrit_kolody.setBackgroundResource(R.drawable.koloda)
            }
            if (flag_deictvia == 2) {
                var xp_karti_2_2_icon = carta_ctavit.xp_paint(xp_poli_2_2_now)
                pole_2_2_xp.setBackgroundResource(xp_karti_2_2_icon!!)
                pole_2_2.isClickable = false
            }
        }
        //поля врага      + заменить капипасту, функцией с 4 вводными, где переменный свойства класса
        pole_1_3.setOnClickListener {
            if (flag_deictvia == 1){

                xp_poli_1_3_now = carta_ctavit.xp
                ataca_poli_1_3_now = carta_ctavit.ataka
                var xp_karti_1_3_icon = carta_ctavit.xp_paint(xp_poli_1_3_now)
                var ataka_karti_1_3_icon = carta_ctavit.ataka_paint()
                if ((ataka_karti_1_3_icon != null) && (xp_karti_1_3_icon != null)) {
                    pole_1_3_ataca.setBackgroundResource(ataka_karti_1_3_icon)
                    pole_1_3_xp.setBackgroundResource(xp_karti_1_3_icon)
                }
                pole_1_3.setBackgroundResource(carta_ctavit.paint)
            }
            if (flag_deictvia == 2) {
                var xp_karti_1_3_icon = carta_ctavit.xp_paint(xp_poli_1_3_now)
                pole_1_3_xp.setBackgroundResource(xp_karti_1_3_icon!!)
            }
        }
        pole_1_4.setOnClickListener {
            if (flag_deictvia == 1){

                xp_poli_1_4_now = carta_ctavit.xp
                ataca_poli_1_4_now = carta_ctavit.ataka
                var xp_karti_1_4_icon = carta_ctavit.xp_paint(xp_poli_1_4_now)
                var ataka_karti_1_4_icon = carta_ctavit.ataka_paint()
                if ((ataka_karti_1_4_icon != null) && (xp_karti_1_4_icon != null)) {
                    pole_1_4_ataca.setBackgroundResource(ataka_karti_1_4_icon)
                    pole_1_4_xp.setBackgroundResource(xp_karti_1_4_icon)
                }
                pole_1_4.setBackgroundResource(carta_ctavit.paint)
            }
            if (flag_deictvia == 2) {
                var xp_karti_1_4_icon = carta_ctavit.xp_paint(xp_poli_1_4_now)
                pole_1_4_xp.setBackgroundResource(xp_karti_1_4_icon!!)
            }
        }
        pole_2_3.setOnClickListener {
            if (flag_deictvia == 1){

                xp_poli_2_3_now = carta_ctavit.xp
                ataca_poli_2_3_now = carta_ctavit.ataka
                var xp_karti_2_3_icon = carta_ctavit.xp_paint(xp_poli_2_3_now)
                var ataka_karti_2_3_icon = carta_ctavit.ataka_paint()
                if ((ataka_karti_2_3_icon != null) && (xp_karti_2_3_icon != null)) {
                    pole_2_3_ataca.setBackgroundResource(ataka_karti_2_3_icon)
                    pole_2_3_xp.setBackgroundResource(xp_karti_2_3_icon)
                }
                pole_2_3.setBackgroundResource(carta_ctavit.paint)
            }
            if (flag_deictvia == 2) {
                var xp_karti_2_3_icon = carta_ctavit.xp_paint(xp_poli_2_3_now)
                pole_2_3_xp.setBackgroundResource(xp_karti_2_3_icon!!)
            }
        }
        pole_2_4.setOnClickListener {
            if (flag_deictvia == 1){

                xp_poli_2_4_now = carta_ctavit.xp
                ataca_poli_2_4_now = carta_ctavit.ataka
                var xp_karti_2_4_icon = carta_ctavit.xp_paint(xp_poli_2_4_now)
                var ataka_karti_2_4_icon = carta_ctavit.ataka_paint()
                if ((ataka_karti_2_4_icon != null) && (xp_karti_2_4_icon != null)) {
                    pole_2_4_ataca.setBackgroundResource(ataka_karti_2_4_icon)
                    pole_2_4_xp.setBackgroundResource(xp_karti_2_4_icon)
                }
                pole_2_4.setBackgroundResource(carta_ctavit.paint)
            }
            if (flag_deictvia == 2) {
                var xp_karti_2_4_icon = carta_ctavit.xp_paint(xp_poli_2_4_now)
                pole_2_4_xp.setBackgroundResource(xp_karti_2_4_icon!!)
            }
        }
        ctart.setOnClickListener {
            var (a, b, d) = yron__linia(ataca_poli_1_2_now, xp_poli_1_3_now, xp_poli_1_4_now, vrag_xp_chislo)
            xp_poli_1_3_now = a
            xp_poli_1_4_now = b
            vrag_xp_chislo = d

            var (a1, b1, d1) = yron__linia(ataca_poli_1_1_now, xp_poli_1_3_now, xp_poli_1_4_now, vrag_xp_chislo)
            xp_poli_1_3_now = a1
            xp_poli_1_4_now = b1
            vrag_xp_chislo = d1
            var (a2, b2, d2) = yron__linia(ataca_poli_2_2_now, xp_poli_2_3_now, xp_poli_2_4_now, vrag_xp_chislo)
            xp_poli_2_3_now = a2
            xp_poli_2_4_now = b2
            vrag_xp_chislo = d2
            var (a3, b3, d3) = yron__linia(ataca_poli_2_1_now, xp_poli_2_3_now, xp_poli_2_4_now, vrag_xp_chislo)
            xp_poli_2_3_now = a3
            xp_poli_2_4_now = b3
            vrag_xp_chislo = d3
            xp_vrag.setText(vrag_xp_chislo.toString())
            if (vrag_xp_chislo < 1) {
                finish()
                basa_fkagov.flag_1_go_yr = true
            }
            carta_ctavit = basa_cart.nety_data
            blok_poli_vrag(true)
            opnova(pole_2_4, xp_poli_2_4_now)
            opnova(pole_2_3, xp_poli_2_3_now)
            opnova(pole_1_4, xp_poli_1_4_now)
            opnova(pole_1_3, xp_poli_1_3_now)

            if ((xp_poli_2_4_now != 0) && (xp_poli_2_3_now != 0) && (xp_poli_1_3_now != 0) && (xp_poli_1_4_now != 0)) { otdix = 1}
            else{
            var xod_vraga: Int = Random.nextInt(3)
                flag_deictvia = 1
            when (xod_vraga) {
                0 -> { carta_ctavit = basa_cart.nyhen_blihnic_vrag()
                    if (xp_poli_2_3_now < 1) { pole_2_3.performClick() }
                    else { pole_1_3.performClick() }}
                1 -> { carta_ctavit = basa_cart.nyhen_blihnic_vrag()
                    if (xp_poli_1_3_now < 1) { pole_1_3.performClick() }
                    else { pole_2_3.performClick() }}
                2 -> { carta_ctavit = basa_cart.nyhen_dalnici_vrag()
                    if (xp_poli_2_4_now < 1) { pole_2_4.performClick() }
                    else { pole_1_4.performClick() }}
                3 -> { carta_ctavit = basa_cart.nyhen_dalnici_vrag()
                    if (xp_poli_1_4_now < 1) { pole_1_4.performClick() }
                    else { pole_2_4.performClick() }}
            }}


            blok_poli_vrag(false)
                var (a4, b4, d4) = yron__linia(ataca_poli_1_3_now, xp_poli_1_2_now, xp_poli_1_1_now, my_xp_chislo)
                xp_poli_1_2_now = a4
                xp_poli_1_1_now = b4
                my_xp_chislo = d4
                var (a5, b5, d5) = yron__linia(ataca_poli_1_4_now, xp_poli_1_2_now, xp_poli_1_1_now, my_xp_chislo)
                xp_poli_1_2_now = a5
                xp_poli_1_1_now = b5
                my_xp_chislo = d5
                var (a6, b6, d6) = yron__linia(ataca_poli_2_3_now, xp_poli_2_2_now, xp_poli_2_1_now, my_xp_chislo)
                xp_poli_2_2_now = a6
                xp_poli_2_1_now = b6
                my_xp_chislo = d6
                var (a7, b7, d7) = yron__linia(ataca_poli_2_4_now, xp_poli_2_2_now, xp_poli_2_1_now, my_xp_chislo)
                xp_poli_2_2_now = a7
                xp_poli_2_1_now = b7
                my_xp_chislo = d7
                xp_my.setText(my_xp_chislo.toString())

            blok_poli_nahe(true)
                carta_ctavit = basa_cart.nety_data
            flag_bloca_vcex = false
            opnova(pole_2_2, xp_poli_2_2_now)
            opnova(pole_2_1, xp_poli_2_1_now)
            opnova(pole_1_1, xp_poli_1_1_now)
            opnova(pole_1_2, xp_poli_1_2_now)
            flag_deictvia = 0
                if (my_xp_chislo < 1) { finish() }
            basa_cart.set_krt1(basa_cart.nyhen_dalnici())
            basa_cart.set_krt2(basa_cart.nyhen_zenter())
            basa_cart.set_krt3(basa_cart.nyhen_blihnic())
            otkrit_kolody.setBackgroundResource(R.drawable.koloda)
            flag_bloca_vcex = true
        }
    }
    override fun onResume() {
        super.onResume()
        var otkrit_kolody: ImageView = findViewById(R.id.image_koloda_v_igre)
        flag_deictvia = basa_cart.get_flag_deistvii_2()
        carta_ctavit = basa_cart.get_karta_na_pole()
        if (basa_cart.get_flag_deistvii_2() == 0)  { otkrit_kolody.setBackgroundResource(R.drawable.koloda) }
    }

    override fun onBackPressed() {
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
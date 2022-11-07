package com.example.privet2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.privet2.karti.create_koloda
import com.example.privet2.karti.data_karta


class yroven1 : AppCompatActivity() {
    lateinit var carta: String
    var flag_deictvia: Int = 0
    lateinit var carta_ctavit: data_karta
    var basa_cart = create_koloda()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yroven1)
        supportActionBar?.hide()
        var pole_1_1_xp: ImageView = findViewById(R.id.image_1_1_xp)
        var pole_1_1_ataca: ImageView = findViewById(R.id.image_1_1_ataka)
        var pole_1_2_xp: ImageView = findViewById(R.id.image_1_2_xp)
        var pole_1_2_ataca: ImageView = findViewById(R.id.image_1_2_ataka)
        var pole_2_1_xp: ImageView = findViewById(R.id.image_2_1_xp)
        var pole_2_1_ataca: ImageView = findViewById(R.id.image_2_1_ataka)
        var pole_2_2_xp: ImageView = findViewById(R.id.image_2_2_xp)
        var pole_2_2_ataca: ImageView = findViewById(R.id.image_2_2_ataka)
        var pole_1_3_xp: ImageView = findViewById(R.id.image_1_3_xp)
        var pole_1_3_ataca: ImageView = findViewById(R.id.image_1_3_ataka)
        var pole_1_4_xp: ImageView = findViewById(R.id.image_1_4_xp)
        var pole_1_4_ataca: ImageView = findViewById(R.id.image_1_4_ataka)
        var pole_2_3_xp: ImageView = findViewById(R.id.image_2_3_xp)
        var pole_2_3_ataca: ImageView = findViewById(R.id.image_2_3_ataka)
        var pole_2_4_xp: ImageView = findViewById(R.id.image_2_4_xp)
        var pole_2_4_ataca: ImageView = findViewById(R.id.image_2_4_ataka)
        var igra_vuhod: Button = findViewById(R.id.button_igra_vuhod)
        var igra_igrat: Button = findViewById(R.id.button_igra_igrat)
        var pole_1_1: ConstraintLayout = findViewById(R.id.laiaut_1_1)
        var pole_1_2: ConstraintLayout = findViewById(R.id.laiaut_1_2)
        var pole_1_3: ConstraintLayout = findViewById(R.id.laiaut_1_3)
        var pole_1_4: ConstraintLayout = findViewById(R.id.laiaut_1_4)
        var pole_2_1: ConstraintLayout = findViewById(R.id.laiaut_2_1)
        var pole_2_2: ConstraintLayout = findViewById(R.id.laiaut_2_2)
        var pole_2_3: ConstraintLayout = findViewById(R.id.laiaut_2_3)
        var pole_2_4: ConstraintLayout = findViewById(R.id.laiaut_2_4)
        var yverenu: ConstraintLayout = findViewById(R.id.konsol_yverenu)
        var ctart: Button = findViewById(R.id.button_ctart)
        var otkrit_kolody: Button = findViewById(R.id.button_otkrit_kolody)
        var xp_my: EditText = findViewById(R.id.xp_nahi)
        var xp_vrag: EditText = findViewById(R.id.xp_vraga)
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

        super.onResume()
        val arguments = intent.extras
        carta = arguments?.get("carta") as? String ?: "" //as? Class<data_karta> ?: b
        flag_deictvia = arguments?.get("flag_deictvia") as? Int ?: 0


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

        fun yron_nahi_1_linia(yron: Int){              // удаляю копипасту + делаю смену иконки хп
            if (xp_poli_1_3_now != 0) {
                xp_poli_1_3_now -= yron
                if (xp_poli_1_3_now < 0)        {xp_poli_1_3_now = 0}
            }else{
                if (xp_poli_1_4_now != 0){
                    xp_poli_1_4_now -= yron
                    if (xp_poli_1_4_now < 0)        {xp_poli_1_4_now = 0}
                }else{
                    var xp_vrag_rash = xp_vrag.maxEms
                    xp_vrag_rash -= yron
                    xp_vrag.setEms(xp_vrag_rash)
                }
            }
        }
        fun yron_nahi_2_linia(yron: Int){
            if (xp_poli_2_3_now != 0) {
                xp_poli_2_3_now -= yron
                if (xp_poli_2_3_now < 0)        {xp_poli_2_3_now = 0}
            }else{
                if (xp_poli_2_4_now != 0){
                    xp_poli_2_4_now -= yron
                    if (xp_poli_2_4_now < 0)        {xp_poli_2_4_now = 0}
                }else{
                    var xp_vrag_rash = xp_vrag.maxEms
                     xp_vrag_rash -= yron
                    xp_vrag.setEms(xp_vrag_rash)
                }
            }
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
            if (flag_deictvia == 1)  {flag_deictvia = 0}
            else    {otkrit_kolody.setBackgroundResource(R.drawable.koloda02) }
            val intent = Intent(this, yroveni_koloda::class.java)
            startActivity(intent)
        }

        pole_1_1.setOnClickListener {
            if (flag_deictvia == 1){
                blok_poli_nahe(false)

                xp_poli_1_1_now = carta_ctavit.xp
                ataca_poli_1_1_now = carta_ctavit.ataka
                var xp_karti_1_1_icon = carta_ctavit.xp_paint(xp_poli_1_1_now)
                var ataka_karti_1_1_icon = carta_ctavit.ataka_paint()
                if ((ataka_karti_1_1_icon != null) && (xp_karti_1_1_icon != null)) {
                    pole_1_1_ataca.setBackgroundResource(ataka_karti_1_1_icon)
                    pole_1_1_xp.setBackgroundResource(xp_karti_1_1_icon)
                }
                pole_1_1.setBackgroundResource(carta_ctavit.paint)
            }
        }
        pole_1_2.setOnClickListener {
            if (flag_deictvia == 1){
                blok_poli_nahe(false)

                xp_poli_1_2_now = carta_ctavit.xp
                ataca_poli_1_2_now = carta_ctavit.ataka
                var xp_karti_1_2_icon = carta_ctavit.xp_paint(xp_poli_1_2_now)
                var ataka_karti_1_2_icon = carta_ctavit.ataka_paint()
                if ((ataka_karti_1_2_icon != null) && (xp_karti_1_2_icon != null)) {
                    pole_1_2_ataca.setBackgroundResource(ataka_karti_1_2_icon)
                    pole_1_2_xp.setBackgroundResource(xp_karti_1_2_icon)
                }
                pole_1_2.setBackgroundResource(carta_ctavit.paint)
            }
        }
        pole_2_1.setOnClickListener {
            if (flag_deictvia == 1){
                blok_poli_nahe(false)

                xp_poli_2_1_now = carta_ctavit.xp
                ataca_poli_2_1_now = carta_ctavit.ataka
                var xp_karti_2_1_icon = carta_ctavit.xp_paint(xp_poli_2_1_now)
                var ataka_karti_2_1_icon = carta_ctavit.ataka_paint()
                if ((ataka_karti_2_1_icon != null) && (xp_karti_2_1_icon != null)) {
                    pole_2_1_ataca.setBackgroundResource(ataka_karti_2_1_icon)
                    pole_2_1_xp.setBackgroundResource(xp_karti_2_1_icon)
                }
                pole_2_1.setBackgroundResource(carta_ctavit.paint)
            }
        }
        pole_2_2.setOnClickListener {
            if (flag_deictvia == 1){
                blok_poli_nahe(false)

                xp_poli_2_2_now = carta_ctavit.xp
                ataca_poli_2_2_now = carta_ctavit.ataka
                var xp_karti_2_2_icon = carta_ctavit.xp_paint(xp_poli_2_2_now)
                var ataka_karti_2_2_icon = carta_ctavit.ataka_paint()
                if ((ataka_karti_2_2_icon != null) && (xp_karti_2_2_icon != null)) {
                    pole_2_2_ataca.setBackgroundResource(ataka_karti_2_2_icon)
                    pole_2_2_xp.setBackgroundResource(xp_karti_2_2_icon)
                }
                pole_2_2.setBackgroundResource(carta_ctavit.paint)
            }
        }
        //поля врага      + заменить капипасту, функцией с 4 вводными
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
        }
        ctart.setOnClickListener {
            yron_nahi_1_linia(ataca_poli_1_2_now)
            yron_nahi_1_linia(ataca_poli_1_1_now)
            yron_nahi_2_linia(ataca_poli_2_2_now)
            yron_nahi_2_linia(ataca_poli_2_1_now)
            if (xp_vrag.maxEms < 1) {finish()}           //тут стоп
            carta_ctavit = basa_cart.cpiso["000"]!!
            blok_poli_vrag(true)
            if (xp_poli_2_4_now < 1){pole_2_4.performClick()}         //сделать выполнение слик с учетом того, что они false is Click
            if (xp_poli_2_3_now < 1){pole_2_3.performClick()}
            if (xp_poli_1_3_now < 1){pole_1_3.performClick()}
            if (xp_poli_1_4_now < 1){pole_1_4.performClick()}

            //xod vraga
            blok_poli_vrag(false)
            if (xp_poli_1_1_now == 0)  {pole_1_1.isClickable = true}
            if (xp_poli_1_2_now == 0)  {pole_1_2.isClickable = true}
            if (xp_poli_2_1_now == 0)  {pole_2_1.isClickable = true}
            if (xp_poli_2_2_now == 0)  {pole_2_2.isClickable = true}
            flag_deictvia = 0
        }

    }

    override fun onResume() {
        super.onResume()
        val arguments = intent.extras
        carta = arguments?.get("carta") as? String ?: "000"
        flag_deictvia = arguments?.get("flag_deictvia") as? Int ?: 0
        carta_ctavit = basa_cart.cpiso[carta]!!
    }
}
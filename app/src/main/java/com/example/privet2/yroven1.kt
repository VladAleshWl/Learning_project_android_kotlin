package com.example.privet2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class yroven1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yroven1)
        supportActionBar?.hide()
        var igra_vuhod: Button = findViewById(R.id.button_igra_vuhod)
        var igra_igrat: Button = findViewById(R.id.button_igra_igrat)
        var pole_1_1: Button = findViewById(R.id.button_pole_1_1)
        var pole_1_2: Button = findViewById(R.id.button_pole_1_2)
        var pole_1_3: Button = findViewById(R.id.button_pole_1_3)
        var pole_1_4: Button = findViewById(R.id.button_pole_1_4)
        var pole_2_1: Button = findViewById(R.id.button_pole_2_1)
        var pole_2_2: Button = findViewById(R.id.button_pole_2_2)
        var pole_2_3: Button = findViewById(R.id.button_pole_2_3)
        var pole_2_4: Button = findViewById(R.id.button_pole_2_4)
        var yverenu: ConstraintLayout = findViewById(R.id.konsol_yverenu)
        var ctart: Button = findViewById(R.id.button_ctart)
        var otkrit_kolody: Button = findViewById(R.id.button_otkrit_kolody)
        var xp_my: TextView = findViewById(R.id.text_xp_my)
        var xp_vrag: TextView = findViewById(R.id.text_xp_vrag)
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
            ctart.setClickable(true)
            otkrit_kolody.setClickable(true)
            /*Сделать раздачу карт, чтобы они появлялись в активити колода. Дальше - нажатие на карту переносит обратно на активити,
            замения кнопку колоды крестиком ( которая возвращает назад и обнуляет значение флажка - поставления карты). Ктик на поле задает параметор
            кнопки (флаг поставки), но проверяет стоит ли он там. Если все заняты возвращает активити колоды и завершает его. А боевка
            будет по свойством класса кнопки ( надо добавить) про хп и урон. Старт поочередо наносит урон кнопок, даже если равен = 0, и делает проверку хп карт.
            Если оно не было равно 0, но стало 0, убираем карту
            Если было равно 0, то переносим урон след. карте или главе в зависимости от пазиции*/


        }


    }
}
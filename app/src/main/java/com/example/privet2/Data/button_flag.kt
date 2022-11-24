package com.example.privet2.Data

import android.widget.ImageView

class button_flag(pole_ob: ImageView, paint: Int, paint2: Int, flag1: Boolean) {

    var kartinka1 = paint
    var kartinka2 = paint2
    var image = pole_ob
    var flag_1: Boolean = flag1

    fun ism_kartinki(): Int{
        if (this.flag_1) { return kartinka1}
        else { return kartinka2 }
    }
}
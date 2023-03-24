package com.example.privet2.Data
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class pole(pole_ob: ConstraintLayout, xp_imag: ImageView, ataka_imag: ImageView, xp: Int = 0, ataka: Int = 0,
           nationality: String = "all") {
    var ehect: String = "None"
    var nationality = nationality
    var xp_now = xp
    var ataka_now = ataka
    var pole = pole_ob
    var xp_image = xp_imag
    var ataka_image = ataka_imag

    fun polychenie_yrona(yron: Int): Int{
        if (xp_now == 0){ return yron}
        else{
            xp_now -= yron
            if (xp_now < 0){ xp_now = 0 }
            return 0
        }
    }
}
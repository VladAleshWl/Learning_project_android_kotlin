package com.example.privet2.karti

import com.example.privet2.Data.Data_and_flagi

class unic_vragi {
    val cr_kl = create_koloda()
    val flag = Data_and_flagi

    fun ocob_xod(hod: Int): Boolean{
        var ffag: Boolean = true
        when (flag.yroven_now){
            2 -> if (hod % 4 == 0) {ffag = false}
        }
        return ffag
    }
}
package com.example.privet2.Data
import com.example.privet2.R
import com.example.privet2.karti.create_koloda
import com.example.privet2.karti.data_karta

class Data_and_flagi {
    companion object {
        var flag_1_go_yr: Boolean = false
        var flag_2_go_yr: Boolean = false
        var flag_3_go_yr: Boolean = false
        var flag_4_go_yr: Boolean = false
        var flag_5_go_yr: Boolean = false
        var yroven_now: Int = 0

        var karta_1_peredacha: data_karta = create_koloda.nety_data002

        public fun hon_yrovni():Int{
            when (yroven_now){
                1 -> return R.drawable.interfeis
                2 -> return R.drawable.interfeis_lvltwo
            }
            return R.drawable.interfeis
        }
        fun xp_persov():Int{
            when (yroven_now){
                1 -> return 40
                2 -> return 90
            }
            return 40
        }
    }
    fun get_karta(): data_karta { return karta_1_peredacha}

    fun set_karta(karta: data_karta) { karta_1_peredacha = karta}


}
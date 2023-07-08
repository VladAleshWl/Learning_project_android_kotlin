package com.example.privet2.Data
import com.example.privet2.R
import com.example.privet2.karti.create_koloda
import com.example.privet2.karti.data_karta

class Data_and_flagi {
    companion object {

        var countactivity = 0

        var flag_1_go_yr: Boolean = false
        var flag_2_go_yr: Boolean = false
        var flag_3_go_yr: Boolean = false
        var flag_4_go_yr: Boolean = false
        var flag_5_go_yr: Boolean = false
        var yroven_now: Int = 0
        var limit_bos: Int = 1

        var karta_1_peredacha: data_karta = create_koloda.nety_data002

        var flad_for_bosv: Boolean = false


        public fun hon_yrovni():Int{
            when (yroven_now){
                1 -> return R.drawable.interfeis
                2 -> return R.drawable.interfeis_lvltwo
            }
            return R.drawable.interfeis
        }

        fun xp_persov(): List<Int>{
            when (yroven_now){
                1 -> return listOf(20, 5)
                2 -> return listOf(11000, 80)
            }
            return listOf(40, 100)
        }

        fun complit_lvl(){
            when (yroven_now){
                1 -> this.flag_1_go_yr = true
                2 -> this.flag_2_go_yr = true
                3 -> this.flag_3_go_yr = true
            }
        }
    }
    fun get_karta(): data_karta { return karta_1_peredacha}

    fun set_karta(karta: data_karta) { karta_1_peredacha = karta}

    fun povisit_limit(Val: Int = 1){ limit_bos += Val }
    fun ponisit_limit(Val: Int = 1){ limit_bos -= Val }
}
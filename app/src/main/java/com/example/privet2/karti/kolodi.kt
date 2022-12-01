package com.example.privet2.karti

class kolodi {
    val karti = create_koloda()

    fun koloda_fo_lvl_dalnic(number: Int): List<karte_dalnic>{
        when (number){
            1 -> return karti.nabor_kart_dalnici_1
            2 -> return karti.nabor_kart_dalnici_2
        }
        return karti.nabor_kart_dalnici_1
    }
    fun koloda_fo_lvl_blihnic(number: Int): List<karte_blihnic>{
        when (number){
            1 -> return karti.nabor_kart_blihnic_1
            2 -> return karti.nabor_kart_blihnic_2
        }
        return karti.nabor_kart_blihnic_1
    }
    fun koloda_fo_lvl_zentr(number: Int): List<data_karta>{
        when (number){
            1 -> return karti.nabor_zentr_1
            2 -> return karti.nabor_zentr_2
        }
        return karti.nabor_zentr_1
    }
    fun koloda_fo_lvl_vragi_dalnici(number: Int): List<karte_dalnic>{
        when (number){
            1 -> return karti.nabor_kart_vragi_dalnici_1
            2 -> return karti.nabor_kart_vragi_dalnici_2
        }
        return karti.nabor_kart_vragi_dalnici_1
    }
    fun koloda_fo_lvl__vragi_blihnic(number: Int): List<karte_blihnic>{
        when (number){
            1 -> return karti.nabor_kart_vragi_blihnic_1
            2 -> return karti.nabor_kart_vragi_blihnic_2
        }
        return karti.nabor_kart_vragi_blihnic_1
    }

}
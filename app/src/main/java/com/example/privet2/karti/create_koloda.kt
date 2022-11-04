package com.example.privet2.karti
import com.example.privet2.R
import com.example.privet2.karti.data_karta
import com.example.privet2.karti.karte_dalnic
import com.example.privet2.karti.karte_blihnic
import kotlin.random.nextInt
import kotlin.random.Random


class create_koloda {
    val a = karte_dalnic(R.drawable.koloda02, 1, 1)
    val b = karte_blihnic(R.drawable.koloda02, 1, 1)    //ПОМЕНЯТЬ!!!!!!!!!!!!!!!!!!!
    val nabor_kart = listOf<data_karta>(a, b)
    val nabor_kart_dalnici = listOf<karte_dalnic>(a)
    val nabor_kart_blihnic = listOf<karte_blihnic>(b)
    fun nyhen_blihnic (): karte_blihnic {
        var number: Int = Random.nextInt(nabor_kart_blihnic.size)
        return nabor_kart_blihnic.get(number)
    }
    fun nyhen_dalnici (): karte_dalnic {
        var number: Int = Random.nextInt(nabor_kart_dalnici.size)
        return nabor_kart_dalnici.get(number)
    }
    fun nyhen_zenter (): data_karta{
        //var nabor_kart_for_zentra = nabor_kart
        var number: Int = Random.nextInt(nabor_kart.size)
        return nabor_kart.get(number)

    }
}
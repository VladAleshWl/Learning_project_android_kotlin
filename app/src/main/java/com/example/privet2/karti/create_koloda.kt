package com.example.privet2.karti
import com.example.privet2.R
import kotlin.random.Random



class create_koloda {
    val nety_data = data_karta(0, 0, 0, "000")
    val a = karte_dalnic(R.drawable.koloda02, 1, 4, "001")
    val b = karte_blihnic(R.drawable.koloda02, 2, 2, "002")
    val sss = karte_dalnic(R.drawable.koloda02, 1, 1, "101")
    val zzz = karte_blihnic(R.drawable.koloda02, 2, 1, "102")    //ПОМЕНЯТЬ!!!!!!!!!!!!!!!!!!!
    val nabor_kart = listOf<data_karta>(a, b)
    val nabor_kart_dalnici = listOf<karte_dalnic>(a)
    val nabor_kart_blihnic = listOf<karte_blihnic>(b)
    val nabor_kart_vragi_dalnici = listOf<karte_dalnic>(sss)
    val nabor_kart_vragi_blihnic = listOf<karte_blihnic>(zzz)
    var cpiso: Map<String, data_karta> = mapOf(nety_data.ip_karti to nety_data, a.ip_karti to a,
    b.ip_karti to b)
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
    fun nyhen_blihnic_vrag (): karte_blihnic {
        var number: Int = Random.nextInt(nabor_kart_vragi_blihnic.size)
        return nabor_kart_vragi_blihnic.get(number)
    }
    fun nyhen_dalnici_vrag (): karte_dalnic {
        var number: Int = Random.nextInt(nabor_kart_vragi_dalnici.size)
        return nabor_kart_vragi_dalnici.get(number)
    }
}
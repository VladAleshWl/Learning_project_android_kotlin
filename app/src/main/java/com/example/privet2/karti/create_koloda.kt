package com.example.privet2.karti
import com.example.privet2.R
import kotlin.random.Random



class create_koloda {
    companion object {
        public var krt1: data_karta = data_karta(R.color.black, 0, 0, "000")
        public var krt2: data_karta = data_karta(R.color.black, 0, 0, "000")
        public var krt3: data_karta = data_karta(R.color.black, 0, 0, "000")
        public var flag_deistvii_2: Int = 0
        public var karta_na_pole: data_karta = data_karta(R.color.black, 0, 0, "000")
    }
    public fun set_krt1(karta: data_karta){ krt1 = karta}
    public fun set_krt2(karta: data_karta){ krt2 = karta}
    public fun set_krt3(karta: data_karta){ krt3 = karta}
    public fun set_flag_deistvii_2(flag: Int){ flag_deistvii_2 = flag}
    public fun set_karta_na_pole(karta: data_karta){ karta_na_pole = karta}
    public  fun get_krt1(): data_karta{return krt1}
    public  fun get_krt2(): data_karta{return krt2}
    public  fun get_krt3(): data_karta{return krt3}
    public  fun get_flag_deistvii_2(): Int{return flag_deistvii_2}
    public  fun get_karta_na_pole(): data_karta{return karta_na_pole}

    val nety_data = data_karta(R.drawable.oblozka, 0, 0, "000")
    val fox = karte_blihnic(R.drawable.fox, 2, 4, "001-1")
    val bird = karte_dalnic(R.drawable.bird, 1, 6, "001-2")
    val dog = karte_blihnic(R.drawable.dog, 3, 2, "002-1")
    val voron = karte_dalnic(R.drawable.voron, 1, 2, "101")
    val sneake = karte_blihnic(R.drawable.sneake, 3, 1, "102")
    val nabor_kart = listOf<data_karta>(fox, dog, bird)
    val nabor_kart_dalnici = listOf<karte_dalnic>(bird)
    val nabor_kart_blihnic = listOf<karte_blihnic>(dog, fox)
    val nabor_kart_vragi = listOf<data_karta>(voron, sneake)
    val nabor_kart_vragi_dalnici = listOf<karte_dalnic>(voron)
    val nabor_kart_vragi_blihnic = listOf<karte_blihnic>(sneake)
    var cpiso: Map<String, data_karta> = mapOf(nety_data.ip_karti to nety_data, fox.ip_karti to fox,
        dog.ip_karti to dog, bird.ip_karti to bird)
    fun nyhen_blihnic (): karte_blihnic {
        var number: Int = Random.nextInt(nabor_kart_blihnic.size)
        return nabor_kart_blihnic.get(number)
    }
    fun nyhen_dalnici (): karte_dalnic {
        var number: Int = Random.nextInt(nabor_kart_dalnici.size)
        return nabor_kart_dalnici.get(number)
    }
    fun nyhen_zenter (): data_karta{
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
    fun dai_karty_is_cpicka_get(number: Int): data_karta{
        var num = number
        val dlina_1 = nabor_kart.size
        if (number >= dlina_1 + nabor_kart_vragi.size) { return nety_data}
        else {
            if (number < dlina_1){
                return nabor_kart.get(num)
            }
            else {
                num = num - dlina_1
                return nabor_kart_vragi.get(num)
            }
        }
    }
}
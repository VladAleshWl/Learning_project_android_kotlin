package com.example.privet2.karti
import com.example.privet2.Data.Data_and_flagi
import com.example.privet2.R
import kotlin.random.Random



class create_koloda {
    companion object {
        public var krt1: data_karta = data_karta(R.color.black, 0, 0, "000", "common")
        public var krt2: data_karta = data_karta(R.color.black, 0, 0, "000", "common")
        public var krt3: data_karta = data_karta(R.color.black, 0, 0, "000", "common")
        public var flag_deistvii_2: Int = 0
        public var karta_na_pole: data_karta = data_karta(R.color.black, 0, 0, "000", "common")
        val nety_data002 = data_karta(R.drawable.oblozka, 0, 0, "000", "common")

                                            //  ОБЫЧНЫЕ КАРТЫ

        val nety_data = data_karta(R.drawable.oblozka, 0, 0, "000", "common")
        val dog = karte_blihnic(R.drawable.dog, 4, 1, "002-1", "common")
        val fox = karte_blihnic(R.drawable.fox, 3, 3, "002-2", "common")
        val cat = karte_blihnic(R.drawable.cat, 2, 4, "002-3", "hiler")
        val mouse = karte_dalnic(R.drawable.mouse, 2, 5, "001-1", "common")
        val bird = karte_dalnic(R.drawable.bird, 1, 6, "001-2", "splehi")
        val voron = karte_dalnic(R.drawable.voron, 2, 3, "101", "common")
        val sneake = karte_blihnic(R.drawable.sneake, 4, 1, "102", "poison")
        val wolf = karte_blihnic(R.drawable.wolf, 7, 3, "103", "vampir_cili")

                                            //  ВОЗВЫШЕННЫЕ КАРТЫ

        val mouse_bos = karte_dalnic(R.drawable.mouse_bos, 3, 6, "001", "probitie", bos = "Yes")
        val fox_bos = data_karta(R.drawable.fox_bos, 4, 3, "002", "vampir_cili", bos = "Yes")
        val cat_bos = karte_blihnic(R.drawable.cat_bos, 5, 1, "003", "paladin", bos = "Yes")

                                            //  ДИНОМИЧЕСКИЕ КОЛОДЫ КАРТЫ

        val dinamic_nabor_kart_bos = mutableListOf<data_karta>()
        val dinamic_nabor_kart = mutableListOf<data_karta>(fox, dog, cat, bird, mouse)
        val dinamic_nabor_kart_vragi = mutableListOf<data_karta>(voron, wolf, sneake)
    }

    val nety_data = data_karta(R.drawable.oblozka, 0, 0, "000", "common")
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

    val data_flagi = Data_and_flagi
    val data_Flagi = Data_and_flagi()


                            //  КОЛОДЫ КАРТЫ
    val nabor_kart_bos = listOf<data_karta>(fox_bos, fox_bos)
    val nabor_kart = listOf<data_karta>(fox, dog, cat, bird, mouse)
    val nabor_kart_vragi = listOf<data_karta>(voron, wolf, sneake)
    val spisok_bor: Map<data_karta, data_karta> = mapOf(fox to fox_bos, mouse to mouse_bos, cat to cat_bos)
    val spisok_pat: Map<data_karta, data_karta> = mapOf(fox_bos to fox, mouse_bos to mouse, cat_bos to cat)
    val spisok_tekcta: Map<String, Int> = mapOf( fox.ip_karti to R.drawable.fox_opisanie,
    dog.ip_karti to R.drawable.dog_opisanie, bird.ip_karti to R.drawable.bird_opisanie,
    mouse.ip_karti to R.drawable.mouse_opisanie, voron.ip_karti to R.drawable.voron_opisanie,
    sneake.ip_karti to R.drawable.sneake_opisanie, cat.ip_karti to R.drawable.cat_opisanie,
    wolf.ip_karti to R.drawable.wolf_opisanie, fox_bos.ip_karti to R.drawable.fox_opisanie,
        mouse_bos.ip_karti to R.drawable.mouse_opisanie, cat_bos.ip_karti to R.drawable.cat_opisanie)



    // для 1-го уровня колоды

    val nabor_kart_dalnici_1 = mutableListOf<karte_dalnic>(mouse)
    val nabor_kart_blihnic_1 = mutableListOf<karte_blihnic>(dog, fox)
    val nabor_zentr_1 = mutableListOf<data_karta>(dog, fox, mouse)
    val nabor_kart_vragi_dalnici_1 = mutableListOf<karte_dalnic>(voron)
    val nabor_kart_vragi_blihnic_1 = mutableListOf<karte_blihnic>(sneake)

    // для 2-го уровня колоды

    val nabor_kart_dalnici_2 = mutableListOf<karte_dalnic>(bird, mouse)
    val nabor_kart_blihnic_2 = mutableListOf<karte_blihnic>(dog, fox, cat)
    val nabor_zentr_2 = mutableListOf<data_karta>(bird, mouse, dog, fox, cat)
    val nabor_kart_vragi_dalnici_2 = mutableListOf<karte_dalnic>(voron)
    val nabor_kart_vragi_blihnic_2 = mutableListOf<karte_blihnic>(sneake)


    fun bosvisit(karta: data_karta): data_karta{
        var kartal = karta
        if (karta in spisok_bor && data_flagi.limit_bos > 0){
            data_Flagi.ponisit_limit()
            dinamic_nabor_kart.remove(karta)
            kartal = spisok_bor[karta]!!
            dinamic_nabor_kart_bos.add(kartal)
        }
        else if (karta in spisok_pat) {
            data_Flagi.povisit_limit()
            dinamic_nabor_kart_bos.remove(karta)
            kartal = spisok_pat[karta]!!
            dinamic_nabor_kart.add(kartal)
        }
        return kartal
    }


    fun nyhen_blihnic (list: List<karte_blihnic>): karte_blihnic {
        var number: Int = Random.nextInt(list.size)
        return list.get(number)
    }
    fun nyhen_dalnici (list: List<karte_dalnic>): karte_dalnic {
        var number: Int = Random.nextInt(list.size)
        return list.get(number)
    }
    fun nyhen_zenter (list: List<data_karta>): data_karta{
        val hanc : Int = Random.nextInt(2)
        if (hanc == 1 && dinamic_nabor_kart_bos.size != 0){
            var number: Int = Random.nextInt(dinamic_nabor_kart_bos.size)
            return dinamic_nabor_kart_bos.get(number)
        }
        else{
            var number: Int = Random.nextInt(list.size)
            return list.get(number)
        }
    }
    fun nyhen_blihnic_vrag (list: List<karte_blihnic>): karte_blihnic {
        var number: Int = Random.nextInt(list.size)
        return list.get(number)
    }
    fun nyhen_dalnici_vrag (list: List<karte_dalnic>): karte_dalnic {
        var number: Int = Random.nextInt(list.size)
        return list.get(number)
    }
    fun text_about_kart(ip: String): Int { return spisok_tekcta.get(ip)!! }

    fun ocobo():data_karta {
        when (data_flagi.yroven_now) {
            2 -> return wolf
        }
        return fox
    }
}
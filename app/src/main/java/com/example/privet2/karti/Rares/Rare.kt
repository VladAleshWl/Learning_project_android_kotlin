package com.example.privet2.karti.Rares

import com.example.privet2.Data.pole

class Rare (memary: List<pole>, posihn: pole){
    val memory = memary
    val posihn = posihn
    val cpisok_pri_poivlenie: Map<String, Cposobnosti> = mapOf("splehi" to splehi(), "hiler" to hiler(), "paladin" to paladin())
    val cpisok_pri_atake: Map<String, Cposobnosti> = mapOf("poison" to poison(), "vampir_cili" to vampir_cili(), "probitie" to probitie())
    val cpisok_pri_vait: Map<String, Cposobnosti> = mapOf()
    var rare = Cposobnosti()

    fun vsaim(){
        rare.vsaim(memory, posihn)
    }

    fun give_efect_spawn(name: String): Cposobnosti{
        return cpisok_pri_poivlenie[name]!!
    }

    fun give_efect_ataki(name: String): Cposobnosti{
        return cpisok_pri_atake[name]!!
    }

    fun give_efect_vait(name: String): Cposobnosti{
        return cpisok_pri_vait[name]!!
    }
}
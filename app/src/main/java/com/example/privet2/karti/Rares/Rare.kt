package com.example.privet2.karti.Rares

import com.example.privet2.Data.pole

class Rare (memary: List<pole>, posihn: pole){
    val memory = memary
    val posihn = posihn
    val cpisok_pri_poivlenie: Map<String, Cposobnosti> = mapOf("splehi" to splehi(), "hiler" to hiler())
    var rare = Cposobnosti()

    fun vsaim(){
        rare.vsaim(memory, posihn)
    }

    fun give_efect_spawn(name: String): Cposobnosti{
        return cpisok_pri_poivlenie[name]!!
    }
}
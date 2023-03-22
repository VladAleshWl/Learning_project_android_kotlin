package com.example.privet2.karti.Rares

import com.example.privet2.Data.pole

class Rare (memary: List<pole>, posihn: pole){
    val memory = memary
    val posihn = posihn
    var rare = Cposobnosti()
    fun vsaim(){
        rare.vsaim(memory, posihn)
    }

}
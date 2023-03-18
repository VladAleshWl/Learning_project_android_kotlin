package com.example.privet2.karti.Rares

import com.example.privet2.Data.pole

class Rare (memary: List<pole>, posihn: pole){
    val memory = memary
    var rare = Cposobnosti(memory, posihn)
    fun vsaim(){
        rare.vsaim()
    }

}
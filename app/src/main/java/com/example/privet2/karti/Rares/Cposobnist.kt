package com.example.privet2.karti.Rares
import  com.example.privet2.Data.pole

open class Cposobnosti(memory: List<pole>, posifn: pole) {
    var memory: List<pole> = memory
    var posifn: pole = posifn
    open fun vsaim(): List<pole> {
        return memory
    }
}

class splehi(memory: List<pole>, posifn: pole): Cposobnosti(memory, posifn){
    override fun vsaim(): List<pole>{
        for (i: Int in 0..memory.size){
            if (memory[i] == posifn){}
            else{ memory[i].xp_now -= 1 }
        }
        return memory
    }
}

class efectu(memory: List<pole>, posifn: pole): Cposobnosti(memory, posifn){
    override fun vsaim(): List<pole>{
        for (i: Int in 0..memory.size){ memory[i].xp_now -= 1}
        return memory
    }
}
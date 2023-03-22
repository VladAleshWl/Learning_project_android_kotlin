package com.example.privet2.karti.Rares
import  com.example.privet2.Data.pole

open class Cposobnosti() {
    open fun vsaim(memory: List<pole>, posifn: pole): List<pole> {
        return memory
    }
}

class splehi(): Cposobnosti(){
    override fun vsaim(memory: List<pole>, posifn: pole): List<pole>{
        for (i: Int in 0..memory.size - 1){
            if (memory[i] == posifn){}
            else{ memory[i].xp_now -= 1 }
        }
        return memory
    }
}

class efectu(): Cposobnosti(){
    override fun vsaim(memory: List<pole>, posifn: pole): List<pole>{
        for (i: Int in 0..memory.size){ if (memory[i] != posifn) { memory[i].polychenie_yrona(1) } }
        return memory
    }
}
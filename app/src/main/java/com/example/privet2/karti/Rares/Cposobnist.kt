package com.example.privet2.karti.Rares

open class Cposobnosti(memory: Array<Int>) {
    var memory: Array<Int> = memory
    open fun vsaim(): Array<Int> {
        return memory
    }
}

class splehi(memory: Array<Int>): Cposobnosti(memory){
    override fun vsaim(): Array<Int>{
        for (i: Int in 0..memory.size){ memory[i] -= 1 }
        return memory
    }
}
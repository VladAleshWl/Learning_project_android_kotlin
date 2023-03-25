package com.example.privet2.karti.Rares

import com.example.privet2.Data.pole
import kotlin.random.Random


                                    // ЭФЕКТЫ ПРИ ПОЯВЛЕНИЕ КАРТЫ!!!!
                                    // ЭФЕКТЫ ПРИ ПОЯВЛЕНИЕ КАРТЫ!!!!
                                    // ЭФЕКТЫ ПРИ ПОЯВЛЕНИЕ КАРТЫ!!!!

class splehi(): Cposobnosti(){
    override fun vsaim(memory: List<pole>, posifn: pole): List<pole>{
        for (i: Int in 0..memory.size - 1){ if (memory[i] != posifn) { memory[i].polychenie_yrona(1) } }
        return memory
    }
}

class hiler(): Cposobnosti(){
    override fun vsaim(memory: List<pole>, posifn: pole): List<pole>{
        if (memory[1] == posifn){ memory[3].polychenie_yrona(-2)}
        else if (memory[3] == posifn){ memory[1].polychenie_yrona(-2)}
        else if (memory[4] == posifn){ memory[6].polychenie_yrona(-2)}
        else { memory[4].polychenie_yrona(-2)}
        return memory
    }
}

class efectu(): Cposobnosti(){
    override fun vsaim(memory: List<pole>, posifn: pole): List<pole> {
        for (i: Int in 0..memory.size - 1){ if (memory[i] != posifn) { memory[i].polychenie_yrona(1) } }
        return memory
    }
}

                                    // ЭФЕКТЫ ПРИ АТАКИ КАРТЫ!!!!
                                    // ЭФЕКТЫ ПРИ АТАКИ КАРТЫ!!!!
                                    // ЭФЕКТЫ ПРИ АТАКИ КАРТЫ!!!!


class poison(): Cposobnosti(){
    override fun vsaim(memory: List<pole>, posifn: pole): List<pole> {
        val hanc = Random.nextInt(9)
        if (hanc <= 1){
            if (memory[1] == posifn){ memory[4].ehect = "яд"}
            else if (memory[4] == posifn){ memory[1].ehect = "яд"}
            else if (memory[3] == posifn){ memory[6].ehect = "яд"}
            else { memory[3].ehect = "яд"}
        }
        return memory
    }
}


                                    // ЭФЕКТЫ ПРИ ОФИДАНИИ КАРТЫ!!!!
                                    // ЭФЕКТЫ ПРИ ОФИДАНИИ КАРТЫ!!!!
                                    // ЭФЕКТЫ ПРИ ОФИДАНИИ КАРТЫ!!!!



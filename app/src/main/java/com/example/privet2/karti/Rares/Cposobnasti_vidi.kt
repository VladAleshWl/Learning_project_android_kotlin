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

class paladin(): Cposobnosti(){
    override fun vsaim(memory: List<pole>, posifn: pole): List<pole>{
        if (memory.indexOf(posifn) < 4){
            memory[0].polychenie_yrona(-2)
            memory[1].polychenie_yrona(-2)
            memory[2].polychenie_yrona(-2)
            memory[3].polychenie_yrona(-2)
            memory[memory.indexOf(posifn)].polychenie_yrona(2)
            memory[(memory.indexOf(posifn)+1)%4].polychenie_yrona(1)
        }
        else {
            memory[4].polychenie_yrona(-2)
            memory[5].polychenie_yrona(-2)
            memory[6].polychenie_yrona(-2)
            memory[7].polychenie_yrona(-2)
            memory[memory.indexOf(posifn)].polychenie_yrona(2)
            memory[30/memory.indexOf(posifn)].polychenie_yrona(1)
        }
        return memory
    }
}

class hiler(): Cposobnosti(){
    override fun vsaim(memory: List<pole>, posifn: pole): List<pole>{
        if (memory.indexOf(posifn) < 4){
            memory[3].polychenie_yrona(-2)
            memory[1].polychenie_yrona(-2)
            memory[memory.indexOf(posifn)].polychenie_yrona(2)
        }
        else {
            memory[4].polychenie_yrona(-2)
            memory[6].polychenie_yrona(-2)
            memory[memory.indexOf(posifn)].polychenie_yrona(2)
        }
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

class vampir_cili(): Cposobnosti(){
    override fun vsaim(memory: List<pole>, posifn: pole): List<pole> {

        if (memory.indexOf(posifn) < 4){
            if (memory[(memory.indexOf(posifn)/2*2)+4].xp_now != 0) {
                memory[memory.indexOf(posifn)].poteri_sil(-memory[(memory.indexOf(posifn)/2*2)+4].poteri_sil(2))}
            else if (memory[(memory.indexOf(posifn)/2*2)+5].xp_now != 0) {
                memory[memory.indexOf(posifn)].poteri_sil(-memory[(memory.indexOf(posifn)/2*2)+5].poteri_sil(2))}
        }
        else {
            if (memory[(memory.indexOf(posifn)/2*2)-3].xp_now != 0) {
                memory[memory.indexOf(posifn)].poteri_sil(-memory[(memory.indexOf(posifn)/2*2)-3].poteri_sil(2))}
            else if (memory[(memory.indexOf(posifn)/2*2)-4].xp_now != 0) {
                memory[memory.indexOf(posifn)].poteri_sil(-memory[(memory.indexOf(posifn)/2*2)-4].poteri_sil(2))}
        }

        return memory
    }
}

class probitie(): Cposobnosti(){
    override fun vsaim(memory: List<pole>, posifn: pole): List<pole> {
        if (memory[1] == posifn || memory[0] == posifn){
            if (memory[4].xp_now != 0 && memory[5].xp_now != 0){ memory[5].polychenie_yrona(2) }
        }
        else if (memory[4] == posifn || memory[5] == posifn){
            if (memory[0].xp_now != 0 && memory[1].xp_now != 0){ memory[0].polychenie_yrona(2) }
        }
        else if(memory[2] == posifn || memory[3] == posifn){
            if (memory[6].xp_now != 0 && memory[7].xp_now != 0){ memory[7].polychenie_yrona(2) }
        }
        else if(memory[6] == posifn || memory[7] == posifn){
            if (memory[2].xp_now != 0 && memory[3].xp_now != 0){ memory[2].polychenie_yrona(2) }
        }
        return memory
    }
}
                                    // ЭФЕКТЫ ПРИ ОФИДАНИИ КАРТЫ!!!!
                                    // ЭФЕКТЫ ПРИ ОФИДАНИИ КАРТЫ!!!!
                                    // ЭФЕКТЫ ПРИ ОФИДАНИИ КАРТЫ!!!!



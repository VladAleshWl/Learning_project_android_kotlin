package com.example.privet2.karti
import com.example.privet2.R


open class data_karta(paint: Int, xp: Int, ataka: Int, ip: String, status: String, bos: String = "No") {
    open val bos = bos
    val ip_karti = ip
    var ataka_now = ataka
    var rare = status
    open val iconca_classa: Int = 0
    open val raspolozenie: String = "all"
    val paint = paint
    val xp = xp
    val ataka = ataka

    val xp_paint_art: Map<Int, Int> = mapOf(0 to R.drawable.pngshka, 1 to R.drawable.nomer1,
        2 to R.drawable.nomer2, 3 to R.drawable.nomer3, 4 to R.drawable.nomer4,
        5 to R.drawable.nomer5, 6 to R.drawable.nomer6, 7 to R.drawable.nomer7,
        8 to R.drawable.nomer8, 9 to R.drawable.nomer9, 10 to R.drawable.nomer10)

    val xp_paint_art_K: Map<Int, Int> = mapOf(0 to R.drawable.k0, 1 to R.drawable.k1,
        2 to R.drawable.k2, 3 to R.drawable.k3, 4 to R.drawable.k4,
        5 to R.drawable.k5, 6 to R.drawable.k6, 7 to R.drawable.k7,
        8 to R.drawable.k8, 9 to R.drawable.k9, 10 to R.drawable.k10)

    val xp_paint_art_S: Map<Int, Int> = mapOf(0 to R.drawable.s0, 1 to R.drawable.s1,
        2 to R.drawable.s2, 3 to R.drawable.s3, 4 to R.drawable.s4,
        5 to R.drawable.s5, 6 to R.drawable.s6, 7 to R.drawable.s7,
        8 to R.drawable.s8, 9 to R.drawable.s9, 10 to R.drawable.s10)

    fun xp_paint(xp_now: Int, color: String = "White"): Int? {

        lateinit var art_book: Map<Int, Int>
        if(color == "White"){art_book = xp_paint_art}
        if(color == "Red"){art_book = xp_paint_art_K}
        if(color == "Green"){art_book = xp_paint_art_S}
        if (xp_now >= 0){
            return art_book[xp_now]
        }else{
            return art_book[0]
        }}
    fun ataka_paint(ataka_now: Int, color: String = "White"): Int? {

        lateinit var art_book: Map<Int, Int>
        if(color == "White"){art_book = xp_paint_art}
        if(color == "Red"){art_book = xp_paint_art_K}
        if(color == "Green"){art_book = xp_paint_art_S}
        return art_book[ataka_now]}


}





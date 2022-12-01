package com.example.privet2.karti
import com.example.privet2.R


open class data_karta(paint: Int, xp: Int, ataka: Int, ip: String) {
    val ip_karti = ip
    var ataka_now = ataka
    open val iconca_classa: Int = 0
    open val raspolozenie: String = ""
    val paint = paint
    val xp = xp
    val ataka = ataka
    fun xp_paint(xp_now: Int): Int? {
        val xp_paint_art: Map<Int, Int> = mapOf(0 to R.drawable.pngshka, 1 to R.drawable.nomer1,
            2 to R.drawable.nomer2, 3 to R.drawable.nomer3, 4 to R.drawable.nomer4,
            5 to R.drawable.nomer5, 6 to R.drawable.nomer6, 7 to R.drawable.nomer7,
            8 to R.drawable.nomer8, 9 to R.drawable.nomer9, 10 to R.drawable.nomer10)
        if (xp_now >= 0){
            return xp_paint_art[xp_now]
        }else{
            return xp_paint_art[0]
        }}
    fun ataka_paint(): Int? {
        val ataka_paint_art: Map<Int, Int> = mapOf(0 to R.drawable.pngshka, 1 to R.drawable.nomer1,
            2 to R.drawable.nomer2, 3 to R.drawable.nomer3, 4 to R.drawable.nomer4,
            5 to R.drawable.nomer5, 6 to R.drawable.nomer6, 7 to R.drawable.nomer7,
            8 to R.drawable.nomer8, 9 to R.drawable.nomer9, 10 to R.drawable.nomer10)
        return ataka_paint_art[this.ataka_now]}
}



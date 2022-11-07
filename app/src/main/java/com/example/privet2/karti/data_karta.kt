package com.example.privet2.karti
import com.example.privet2.R


open class data_karta(paint: Int, xp: Int, ataka: Int) {
    var ataka_now = ataka
    open val iconca_classa: Int = 0 // добавить Иконку класса
    val iconca_xp = 0  // добавить Иконку хп
    val paint = paint
    val xp = xp
    val ataka = ataka
    fun xp_paint(xp_now: Int): Int? {
        val xp_paint_art: Map<Int, Int> = mapOf(0 to R.drawable.koloda02, 1 to R.drawable.koloda02,
            2 to R.drawable.koloda02, 3 to R.drawable.koloda02, 4 to R.drawable.koloda02,
            5 to R.drawable.koloda02, 6 to R.drawable.koloda02, 7 to R.drawable.koloda02,
            8 to R.drawable.koloda02, 9 to R.drawable.koloda02, 10 to R.drawable.koloda02)  // добавить картинки
        if (xp_now >= 0){
            return xp_paint_art[xp_now]
        }else{
            return xp_paint_art[0]
        }}
    fun ataka_paint(): Int? {
        val ataka_paint_art: Map<Int, Int> = mapOf(0 to R.drawable.koloda02, 1 to R.drawable.koloda02,
            2 to R.drawable.koloda02, 3 to R.drawable.koloda02, 4 to R.drawable.koloda02,
            5 to R.drawable.koloda02, 6 to R.drawable.koloda02, 7 to R.drawable.koloda02,
            8 to R.drawable.koloda02, 9 to R.drawable.koloda02, 10 to R.drawable.koloda02)  // добавить картинки
        return ataka_paint_art[this.ataka_now]}
}



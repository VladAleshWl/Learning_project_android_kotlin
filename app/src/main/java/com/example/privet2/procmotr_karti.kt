package com.example.privet2

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.privet2.Data.Data_and_flagi
import com.example.privet2.karti.create_koloda
import com.example.privet2.karti.data_karta

class procmotr_karti : AppCompatActivity() {
    val data_k = Data_and_flagi()
    val cr_kol = create_koloda()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_procmotr_karti)
        supportActionBar?.hide()

        val paint: ConstraintLayout = findViewById(R.id.karta_pr)
        val xp: ImageView = findViewById(R.id.image_xp_pr)
        val ataka: ImageView = findViewById(R.id.image_ataka_pr)
        val text_im: ImageView = findViewById(R.id.image_text_pr)
        val back: ImageView = findViewById(R.id.image_back_pr)

        val karta: data_karta = data_k.get_karta()

        back.setOnClickListener{ finish() }
        paint.setBackgroundResource(karta.paint)
        xp.setBackgroundResource(karta.xp_paint(karta.xp)!!)
        ataka.setBackgroundResource(karta.ataka_paint(karta.ataka)!!)
        text_im.setBackgroundResource(cr_kol.text_about_kart(karta.ip_karti)) //не раскомичивать пока нет текста
    }
}
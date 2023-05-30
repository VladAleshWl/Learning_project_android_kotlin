package com.example.privet2

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.privet2.Data.Data_and_flagi
import java.io.DataOutputStream
import java.net.URL
import java.nio.charset.StandardCharsets
import java.util.concurrent.Executors
import javax.net.ssl.HttpsURLConnection
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val HON: ConstraintLayout = findViewById(R.id.hon)
        val vihod: ImageView = findViewById(R.id.image_vixod)
        val koloda: ImageView = findViewById(R.id.image_koloda)
        val igra: ImageView = findViewById(R.id.image_igra)
        val nastr: ImageView = findViewById(R.id.image_nastr)
        val kliker: ImageView = findViewById(R.id.image_kliker)
        val vihod_kones: ConstraintLayout = findViewById(R.id.constraintLayout_konez)
        val DA: ImageView = findViewById(R.id.image_Da)
        val NET: ImageView = findViewById(R.id.image_No)
        val executor = Executors.newSingleThreadExecutor()
        val data_flagi = Data_and_flagi

//        val apppref: SharedPreferences = getSharedPreferences("APP_PREFERENCES", Context.MODE_PRIVATE)
//        apppref
//            .edit()
//            .putString("mAppIUD", "123456789-987654321")
//            .putString("key", "value")
//            .apply();

        var apppref: SharedPreferences = getSharedPreferences("APP_PREFERENCES", Context.MODE_PRIVATE)
        var s: Int = apppref.getInt("Level", 0)!!

        when(s){
            1 -> data_flagi.flag_1_go_yr = true
            2 -> {
                data_flagi.flag_1_go_yr = true
                data_flagi.flag_2_go_yr = true
            }
        }

        /*var apppref: SharedPreferences? = null
        val APP_PREFERENCES = "apppref"

        apppref = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE)
        val editor = apppref.edit()
        editor.putString("mAppIUD", "123456789-987654321")
        editor.apply()*/



        kliker.setBackgroundResource(R.drawable.clickbutton)

        vihod.setOnClickListener {                                    //открытие лаута (уверены)
            vihod_kones.visibility = View.VISIBLE
            vihod.setClickable(false)
            koloda.setClickable(false)
            igra.setClickable(false)
            nastr.setClickable(false)

        }
        DA.setOnClickListener {
            android.os.Process.killProcess(android.os.Process.myPid());   //выход из приложения
            System.exit(0);
        }
        nastr.setOnClickListener {
            val emailToCheck = "test@gmail.com"
            thread {
                val text = try {
                    val uriBuilder = Uri.Builder()
                        .appendQueryParameter("email", emailToCheck)
                        .build()

                    val params = uriBuilder.toString().replace(
                        "?",
                        ""
                    )  // Remove the "?" from the beginning of the parameters ?name=Jack&salary=8054&age=45
                    val postData = params.toByteArray(StandardCharsets.UTF_8)

                    val url = URL("https://mistyflower.ru/api/user/create")
                    val httpsURLConnection = url.openConnection() as HttpsURLConnection
                    httpsURLConnection.requestMethod = "POST"
                    httpsURLConnection.setRequestProperty(
                        "Content-Type",
                        "application/x-www-form-urlencoded"
                    ) // The format of the content we're sending to the server
                    httpsURLConnection.setRequestProperty(
                        "Accept",
                        "application/json"
                    ) // The format of response we want to get from the server
                    httpsURLConnection.doInput = true
                    httpsURLConnection.doOutput = true
                    val dataOutputStream = DataOutputStream(httpsURLConnection.outputStream)
                    dataOutputStream.write(postData)
                    val response = httpsURLConnection.inputStream.bufferedReader()
                        .use { it.readText() }

                } catch (e: Exception) {
                    println("ERROR $e")
                    return@thread
                }
                runOnUiThread { println(text) }
            }
        }

        NET.setOnClickListener {
            vihod_kones.visibility = View.INVISIBLE
            kliker.visibility = View.VISIBLE
            vihod.setClickable(true)                     //закрытие лаута (уверены)
            koloda.setClickable(true)
            igra.setClickable(true)
            nastr.setClickable(true)
        }

        koloda.setOnClickListener {
            val MyIntent =
                Intent(this, com.example.privet2.koloda::class.java)       //переход в колоду
            startActivity(MyIntent)
        }

        igra.setOnClickListener {
            val MyIntent = Intent(this, karta::class.java)     //переход на карту
            startActivity(MyIntent)
        }

        kliker.setOnClickListener {
            apppref
                .edit()
                .putInt("Level", 0)
                .apply();
            data_flagi.flag_1_go_yr = false
            data_flagi.flag_2_go_yr = false
        }
    }

    override fun onBackPressed() {                //предотвращение случайного выхода
        var HON: ConstraintLayout = findViewById(R.id.hon)
        var vihod: ImageView = findViewById(R.id.image_vixod)
        var koloda: ImageView = findViewById(R.id.image_koloda)
        var igra: ImageView = findViewById(R.id.image_igra)
        var nastr: ImageView = findViewById(R.id.image_nastr)
        var kliker: ImageView = findViewById(R.id.image_kliker)
        var vihod_kones: ConstraintLayout = findViewById(R.id.constraintLayout_konez)
        var DA: ImageView = findViewById(R.id.image_Da)
        var NET: ImageView = findViewById(R.id.image_No)

        vihod.setOnClickListener {
            vihod_kones.visibility = View.VISIBLE
            vihod.setClickable(false)
            koloda.setClickable(false)
            igra.setClickable(false)
            nastr.setClickable(false)

        }
        DA.setOnClickListener {
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }

        NET.setOnClickListener {
            vihod_kones.visibility = View.INVISIBLE
            kliker.visibility = View.VISIBLE
            vihod.setClickable(true)
            koloda.setClickable(true)
            igra.setClickable(true)
            nastr.setClickable(true)
        }
        vihod.performClick()
    }
}
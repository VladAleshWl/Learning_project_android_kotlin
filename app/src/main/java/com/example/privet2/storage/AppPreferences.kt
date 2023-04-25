package com.example.privet2.storage

import android.content.Context
import android.content.SharedPreferences

class AppPreferences(ctx: Context) {
    var data: SharedPreferences = ctx.getSharedPreferences("APP_PREFERENCES", Context.MODE_PRIVATE)

    fun saveHighScore(key: String, resource: Int){
        data.edit().putInt(key, resource).apply()
    }

    fun getHingScore(key: String): Int{
        return data.getInt(key, 0)
    }

    fun clearHingScore(key: String) {
        data.edit().putInt(key, 0).apply()
    }
}
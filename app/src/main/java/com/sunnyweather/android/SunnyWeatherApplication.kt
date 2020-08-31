package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {



    companion object{

//      const val TOKEN = "Nu7Odu4s92u1rqLU"
        const val TOKEN = "nY9CIEerwOGKchH7"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }


}
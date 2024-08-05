package spa.lyh.cn.darktest

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatDelegate

class App:Application() {
    lateinit var sp: SharedPreferences

    override fun onCreate() {
        super.onCreate()
        sp = getSharedPreferences("darkmode", Context.MODE_PRIVATE)
        when(sp.getInt("darkmode",0)){
            0 -> {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
            }
            1 -> {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
            2 -> {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
        }
    }
}
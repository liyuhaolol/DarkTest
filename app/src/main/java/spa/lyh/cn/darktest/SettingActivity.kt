package spa.lyh.cn.darktest

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import spa.lyh.cn.darktest.databinding.ActivitySettingBinding

class SettingActivity:BaseActivity() {
    lateinit var b:ActivitySettingBinding
    lateinit var sp: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivitySettingBinding.inflate(layoutInflater)
        setContentView(b.root)
        sp = getSharedPreferences("darkmode", Context.MODE_PRIVATE)
        when(sp.getInt("darkmode",0)){
            0 -> {
                b.radioButton1.isChecked = true
            }
            1 -> {
                b.radioButton2.isChecked = true
            }
            2 -> {
                b.radioButton3.isChecked = true
            }
        }
        b.radioButton1.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
            val editor: SharedPreferences.Editor = sp.edit()
            editor.putInt("darkmode",0)
            editor.apply()
        }
        b.radioButton2.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            val editor: SharedPreferences.Editor = sp.edit()
            editor.putInt("darkmode",1)
            editor.apply()
        }
        b.radioButton3.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            val editor: SharedPreferences.Editor = sp.edit()
            editor.putInt("darkmode",2)
            editor.apply()
        }
    }
}
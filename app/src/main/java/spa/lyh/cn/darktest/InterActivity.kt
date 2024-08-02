package spa.lyh.cn.darktest

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatDelegate
import spa.lyh.cn.darktest.databinding.ActivityInterBinding

class InterActivity:BaseActivity() {
    lateinit var b:ActivityInterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
        b = ActivityInterBinding.inflate(layoutInflater)
        setContentView(b.root)
        b.btn.setOnClickListener {
            val intent = Intent(this@InterActivity,SettingActivity::class.java)
            startActivity(intent)
        }
    }


        override fun onConfigurationChanged(newConfig: Configuration) {
            super.onConfigurationChanged(newConfig)
            Log.e("qwer","$localClassName: Something Changed")
            if ((newConfig.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES) {
                Log.e("qwer","深色")
            } else {
                Log.e("qwer","浅色")
            }
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
    }
}
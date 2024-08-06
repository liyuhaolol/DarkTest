package spa.lyh.cn.darktest

import android.app.UiModeManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.res.Configuration
import android.database.ContentObserver
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import android.util.Log
import spa.lyh.cn.darktest.databinding.ActivityInterBinding

class InterActivity:BaseActivity() {
    lateinit var b:ActivityInterBinding
    //lateinit var uiModeManager:UiModeManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Log.e("qwer","onCreate")
        b = ActivityInterBinding.inflate(layoutInflater)
        setContentView(b.root)
        b.btn.setOnClickListener {
            val intent = Intent(this@InterActivity,SettingActivity::class.java)
            startActivity(intent)
        }
        //uiModeManager = getSystemService(Context.UI_MODE_SERVICE) as UiModeManager
    }


        override fun onConfigurationChanged(newConfig: Configuration) {
            super.onConfigurationChanged(newConfig)
/*            val currentNightMode = uiModeManager.nightMode
            if (currentNightMode == UiModeManager.MODE_NIGHT_YES) {
                // 当前是夜间模式
                Log.e("qwer","Night")
            } else {
                // 当前不是夜间模式
                Log.e("qwer","Day")
            }*/
            if ((newConfig.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES) {
                recreate()
            } else {
                recreate()
            }
    }
}
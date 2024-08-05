package spa.lyh.cn.darktest

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import spa.lyh.cn.darktest.databinding.ActivityInterBinding

class InterActivity:BaseActivity() {
    lateinit var b:ActivityInterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("qwer","onCreate")
        b = ActivityInterBinding.inflate(layoutInflater)
        setContentView(b.root)
        b.btn.setOnClickListener {
            val intent = Intent(this@InterActivity,SettingActivity::class.java)
            startActivity(intent)
        }
    }


        override fun onConfigurationChanged(newConfig: Configuration) {
            super.onConfigurationChanged(newConfig)
            if ((newConfig.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES) {
                recreate()
                //window.decorView.invalidate()
            } else {
                recreate()
                //window.decorView.invalidate()
            }
    }
}
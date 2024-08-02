package spa.lyh.cn.darktest

import android.os.Bundle
import spa.lyh.cn.darktest.databinding.ActivitySettingBinding

class SettingActivity:BaseActivity() {
    lateinit var b:ActivitySettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivitySettingBinding.inflate(layoutInflater)
        setContentView(b.root)
    }
}
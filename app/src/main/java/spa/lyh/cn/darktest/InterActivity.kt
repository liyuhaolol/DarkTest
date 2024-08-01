package spa.lyh.cn.darktest

import android.os.Bundle
import spa.lyh.cn.darktest.databinding.ActivityInterBinding

class InterActivity:BaseActivity() {
    lateinit var b:ActivityInterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityInterBinding.inflate(layoutInflater)
        setContentView(b.root)
    }
}
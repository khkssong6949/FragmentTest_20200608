package kr.co.hgney.fragmenttest_20200608

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity :BaseActivity() {
    override fun setupEvents() {
    }

    override fun setValues() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }
}

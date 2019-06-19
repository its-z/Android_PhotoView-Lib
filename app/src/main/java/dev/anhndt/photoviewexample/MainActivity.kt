package dev.anhndt.photoviewexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.anhndt.photoview.ToastMessage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvDemoToast.setOnClickListener { ToastMessage.showToast(this@MainActivity, "abac") }
    }
}

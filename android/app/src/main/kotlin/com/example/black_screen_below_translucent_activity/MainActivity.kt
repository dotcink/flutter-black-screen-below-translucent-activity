package com.example.black_screen_below_translucent_activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Gravity
import android.widget.Button
import android.widget.FrameLayout
import io.flutter.embedding.android.FlutterActivity

class MainActivity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val button = Button(this)
        button.apply {
            text = "Open Translucent Activity"
            setOnClickListener {
                startActivity(Intent(this@MainActivity, TranslucentActivity::class.java))
            }
        }
        findViewById<FrameLayout>(android.R.id.content).apply {
            addView(button, FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT, Gravity.CENTER))
        }
    }
}

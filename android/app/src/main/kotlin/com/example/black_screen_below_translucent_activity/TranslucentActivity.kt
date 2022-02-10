package com.example.black_screen_below_translucent_activity

import android.app.Activity
import android.os.Bundle

class TranslucentActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Translucent"
    }
}
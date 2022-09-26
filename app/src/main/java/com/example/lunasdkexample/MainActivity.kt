package com.example.lunasdkexample

import android.os.Bundle
import com.luna.sdk.utils.base.LocationPermissionActivity

class MainActivity : LocationPermissionActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
package com.tha.padc_build_config

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tha.shared.showSnackBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showSnackBar("This is consumer app")
    }
}
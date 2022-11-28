package com.tha.rider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tha.shared.showSnackBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showSnackBar("This is rider app")
    }
}
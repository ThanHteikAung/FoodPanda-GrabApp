package com.tha.rider

import android.app.PendingIntent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tha.shared.showSnackBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()
        showSnackBar("This is rider app")

        sendNotification(
            this,
            title = "Hello",
            body = "Notifications provide short, timely information about events in your app while it's not in use. This page teaches you how to create a notification with various features for Android 4.0 (API level 14) and higher. For an introduction to how notifications appear on Android, see the Notifications Overview. ",
            pendingIntent = PendingIntent.getActivity(
                this,
                0,
                RestaurantDetailsActivity.newIntent(this),
                PendingIntent.FLAG_IMMUTABLE
            )
        )
    }
}
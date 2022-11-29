package com.tha.padc_build_config

import android.app.Application
import com.tha.shared.data.models.RestaurantModelImpl

class RestaurantDeliveryApp: Application() {
    override fun onCreate() {
        super.onCreate()
        RestaurantModelImpl.initRetrofitWithBaseUrl(BuildConfig.ENDPOINT)
    }
}
package com.tha.shared.mvp.views

import com.tha.shared.data.vos.RestaurantVO

interface MainView {

    fun showRestaurants(restaurants: List<RestaurantVO>)
    fun showError(errorMessage: String)
}
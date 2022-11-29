package com.tha.shared.data.models

import com.tha.shared.data.vos.RestaurantVO

interface RestaurantModel {

    fun getRestaurants(
        onSuccess: (List<RestaurantVO>) -> Unit,
        onFailure: (String) -> Unit
    )

}
package com.tha.shared.network.response

import com.google.gson.annotations.SerializedName
import com.tha.shared.data.vos.RestaurantVO

data class RestaurantListResponse(

    @SerializedName("code")
    val code: String?,

    @SerializedName("message")
    val message: String?,

    @SerializedName("data")
    val data: List<RestaurantVO>?

)

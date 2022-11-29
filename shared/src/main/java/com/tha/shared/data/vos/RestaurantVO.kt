package com.tha.shared.data.vos

import com.google.gson.annotations.SerializedName


data class RestaurantVO(

    @SerializedName("name")
    val name: String?,

    @SerializedName("category")
    val category: String?,

    @SerializedName("delivery_price")
    val deliveryPrice: String?,

    @SerializedName("rating")
    val rating: String?,

    @SerializedName("image_url")
    val imageUrl: String?

)

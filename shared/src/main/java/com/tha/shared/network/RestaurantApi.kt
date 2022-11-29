package com.tha.shared.network

import com.tha.shared.network.response.RestaurantListResponse
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface RestaurantApi {

    @GET(ENDPOINT_GET_RESTAURANT)
    fun getRestaurants(): Observable<RestaurantListResponse>

}
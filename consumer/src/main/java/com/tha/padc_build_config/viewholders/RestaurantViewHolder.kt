package com.tha.padc_build_config.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.tha.shared.data.vos.RestaurantVO
import kotlinx.android.synthetic.main.view_holder_restaurant.view.*

class RestaurantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    fun bindData(restVO: RestaurantVO?) {
        Glide.with(itemView.context)
            .load(restVO?.imageUrl)
            .into(itemView.ivRestImage)

        itemView.tvRestName.text = restVO?.name
        itemView.tvRestCategory.text = restVO?.category
        itemView.tvPrice.text = restVO?.deliveryPrice
        itemView.tvRatePoint.text = restVO?.rating
    }
}
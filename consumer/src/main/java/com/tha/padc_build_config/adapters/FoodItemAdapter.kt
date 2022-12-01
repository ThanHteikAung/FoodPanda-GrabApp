package com.tha.padc_build_config.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tha.padc_build_config.R
import com.tha.padc_build_config.viewholders.RestaurantViewHolder
import com.tha.shared.data.vos.RestaurantVO

class FoodItemAdapter : RecyclerView.Adapter<RestaurantViewHolder>() {

    private var mRestList: List<RestaurantVO>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_holder_restaurant, parent, false)
        return RestaurantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        holder.bindData(mRestList?.get(position))
    }

    override fun getItemCount(): Int {
        return mRestList?.count() ?: 0
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setNewData(data: List<RestaurantVO>) {
        mRestList = data
        notifyDataSetChanged()
    }
}
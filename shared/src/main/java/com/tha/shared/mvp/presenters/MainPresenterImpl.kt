package com.tha.shared.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.tha.shared.data.models.RestaurantModel
import com.tha.shared.data.models.RestaurantModelImpl
import com.tha.shared.mvp.views.MainView

class MainPresenterImpl : ViewModel(), MainPresenter {

    private var mView: MainView? = null
    private var mRestaurantModel: RestaurantModel = RestaurantModelImpl

    override fun initView(view: MainView) {
        mView = view
    }

    override fun onUiReady() {
        mRestaurantModel.getRestaurants(
            onSuccess = {
                mView?.showRestaurants(it)
            },
            onFailure = {
                mView?.showError(it)
            }
        )
    }
}
package com.tha.padc_build_config.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.tha.padc_build_config.R
import com.tha.padc_build_config.adapters.RestaurantAdapter
import com.tha.shared.data.vos.RestaurantVO
import com.tha.shared.mvp.presenters.MainPresenter
import com.tha.shared.mvp.presenters.MainPresenterImpl
import com.tha.shared.mvp.views.MainView
import com.tha.shared.showSnackBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var mRestaurantAdapter: RestaurantAdapter
    private lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpPresenter()
        setUpToolbar()
        setUpRecyclerView()

        mPresenter.onUiReady()
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProvider(this)[MainPresenterImpl::class.java]
        mPresenter.initView(this)
    }

    private fun setUpToolbar(){
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Welcome to ${getString(R.string.app_name)}"
    }


    private fun setUpRecyclerView() {
        mRestaurantAdapter = RestaurantAdapter()
        rvRestaurant.adapter = mRestaurantAdapter
        rvRestaurant.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    override fun showRestaurants(restaurants: List<RestaurantVO>) {
        mRestaurantAdapter.setNewData(restaurants)
    }

    override fun showError(errorMessage: String) {
        showSnackBar(errorMessage)
    }
}
package com.tha.shared.mvp.presenters

import com.tha.shared.mvp.views.MainView

interface MainPresenter {
    fun initView(view: MainView)
    fun onUiReady()
}
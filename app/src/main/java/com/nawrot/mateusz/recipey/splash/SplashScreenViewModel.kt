package com.nawrot.mateusz.recipey.splash

import com.nawrot.mateusz.recipey.base.BaseViewModel
import com.nawrot.mateusz.recipey.navigation.NavigationRouter
import com.nawrot.mateusz.recipey.navigation.NavigationTarget


class SplashScreenViewModel (private val navigationRouter: NavigationRouter) : BaseViewModel() {

    fun openHomeScreen() {
        navigationRouter.navigateTo(NavigationTarget.HOME)
    }

}
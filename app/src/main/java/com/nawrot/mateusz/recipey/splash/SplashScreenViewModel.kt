package com.nawrot.mateusz.recipey.splash

import com.nawrot.mateusz.recipey.base.BaseViewModel
import com.nawrot.mateusz.recipey.domain.splash.interactor.InitializeAppUseCase
import com.nawrot.mateusz.recipey.navigation.NavigationRouter
import com.nawrot.mateusz.recipey.navigation.NavigationTarget
import io.reactivex.Completable


class SplashScreenViewModel (private val navigationRouter: NavigationRouter,
                             private val initializeAppUseCase: InitializeAppUseCase) : BaseViewModel() {

    fun openHomeScreen() {
        navigationRouter.navigateTo(NavigationTarget.HOME)
    }

    fun initializeApplication(): Completable {
        return initializeAppUseCase.execute("Test param")
    }

}
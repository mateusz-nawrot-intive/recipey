package com.nawrot.mateusz.recipey.splash

import android.content.Context
import com.nawrot.mateusz.recipey.base.BaseViewModel
import com.nawrot.mateusz.recipey.domain.splash.interactor.InitializeAppUseCase
import com.nawrot.mateusz.recipey.navigation.NavigationRouter
import com.nawrot.mateusz.recipey.navigation.NavigationTarget
import io.reactivex.Completable
import javax.inject.Inject


class SplashScreenViewModel @Inject constructor(private val navigationRouter: NavigationRouter,
                                                private val initializeAppUseCase: InitializeAppUseCase) : BaseViewModel() {

    fun openHomeScreen(context: Context) {
        navigationRouter.navigateTo(context, NavigationTarget.HOME)
    }

    fun initializeApplication(): Completable {
        return initializeAppUseCase.execute("Test")
    }

}
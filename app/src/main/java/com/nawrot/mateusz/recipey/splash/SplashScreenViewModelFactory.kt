package com.nawrot.mateusz.recipey.splash

import com.nawrot.mateusz.recipey.base.BaseViewModelFactory
import com.nawrot.mateusz.recipey.di.ActivityScope
import com.nawrot.mateusz.recipey.domain.splash.interactor.InitializeAppUseCase
import com.nawrot.mateusz.recipey.navigation.NavigationRouter
import javax.inject.Inject


@ActivityScope
class SplashScreenViewModelFactory @Inject constructor(private val navigationRouter: NavigationRouter,
                                                       private val initializeAppUseCase: InitializeAppUseCase) : BaseViewModelFactory<SplashScreenViewModel>(SplashScreenViewModel::class) {
    override fun createViewModel(): SplashScreenViewModel {
        return SplashScreenViewModel(navigationRouter, initializeAppUseCase)
    }
}
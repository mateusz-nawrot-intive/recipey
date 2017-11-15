package com.nawrot.mateusz.recipey.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.nawrot.mateusz.recipey.home.HomeViewModel
import com.nawrot.mateusz.recipey.splash.SplashScreenViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(recipeyViewModelFactory: RecipeyViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(SplashScreenViewModel::class)
    abstract fun bindSplashViewModel(splashScreenViewModel: SplashScreenViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(homeViewModel: HomeViewModel): ViewModel

}
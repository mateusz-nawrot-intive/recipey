package com.nawrot.mateusz.recipey.di

import com.nawrot.mateusz.recipey.home.HomeActivity
import com.nawrot.mateusz.recipey.splash.SplashScreenActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class BuildersModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(HomeActivityModule::class))
    abstract fun bindHomeActivity(): HomeActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(SplashScreenActivityModule::class))
    abstract fun bindSplashScreenActivity() : SplashScreenActivity
}
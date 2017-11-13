package com.nawrot.mateusz.recipey.splash

import android.content.Context
import com.nawrot.mateusz.recipey.di.BaseActivityModule
import dagger.Module
import dagger.Provides


@Module
class SplashScreenActivityModule : BaseActivityModule(){

    @Provides
    fun provideContext(activity: SplashScreenActivity): Context = activity

}
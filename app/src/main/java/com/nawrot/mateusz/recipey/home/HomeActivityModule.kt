package com.nawrot.mateusz.recipey.home

import android.content.Context
import com.nawrot.mateusz.recipey.di.BaseActivityModule
import dagger.Module
import dagger.Provides


@Module
class HomeActivityModule : BaseActivityModule() {

    @Provides
    fun provideContext(homeActivity: HomeActivity): Context = homeActivity

}
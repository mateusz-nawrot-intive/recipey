package com.nawrot.mateusz.recipey.di

import com.nawrot.mateusz.recipey.navigation.AppNavigator
import com.nawrot.mateusz.recipey.navigation.Navigator
import dagger.Module
import dagger.Provides


@Module
abstract class BaseActivityModule {

    @Provides
    fun navigator(): Navigator = AppNavigator()

}
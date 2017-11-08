package com.nawrot.mateusz.recipey.di

import com.nawrot.mateusz.recipey.home.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class BuildersModule {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): HomeActivity
}
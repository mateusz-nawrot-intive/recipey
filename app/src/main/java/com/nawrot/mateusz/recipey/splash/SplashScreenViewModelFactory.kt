package com.nawrot.mateusz.recipey.splash

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.nawrot.mateusz.recipey.di.ActivityScope
import javax.inject.Inject


@ActivityScope
class SplashScreenViewModelFactory @Inject constructor() : ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        require(modelClass.isAssignableFrom(SplashScreenViewModel::class.java)) {
            "Could not instantiate ${javaClass.simpleName} class"
        }
        return SplashScreenViewModel() as T
    }
}
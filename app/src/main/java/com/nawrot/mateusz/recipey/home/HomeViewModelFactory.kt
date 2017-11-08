package com.nawrot.mateusz.recipey.home

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.nawrot.mateusz.recipey.di.ActivityScope
import com.nawrot.mateusz.recipey.domain.recipe.interactor.GetRecipesUseCase
import javax.inject.Inject


@ActivityScope
class HomeViewModelFactory @Inject constructor(private val getRecipesUseCase: GetRecipesUseCase) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        require(modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            "Could not instantiate ${javaClass.simpleName} class"
        }
        return HomeViewModel(getRecipesUseCase) as T
    }

}
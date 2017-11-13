package com.nawrot.mateusz.recipey.home

import com.nawrot.mateusz.recipey.base.BaseViewModelFactory
import com.nawrot.mateusz.recipey.di.ActivityScope
import com.nawrot.mateusz.recipey.domain.recipe.interactor.GetRecipesUseCase
import com.nawrot.mateusz.recipey.navigation.NavigationRouter
import javax.inject.Inject


@ActivityScope
class HomeViewModelFactory @Inject constructor(private val navigationRouter: NavigationRouter,
                                               private val getRecipesUseCase: GetRecipesUseCase) : BaseViewModelFactory<HomeViewModel>(HomeViewModel::class) {

    override fun createViewModel(): HomeViewModel {
        return HomeViewModel(navigationRouter, getRecipesUseCase)
    }

}
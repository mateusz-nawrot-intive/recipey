package com.nawrot.mateusz.recipey.home

import android.content.Context
import android.widget.Toast
import com.nawrot.mateusz.recipey.base.BaseViewModel
import com.nawrot.mateusz.recipey.domain.recipe.interactor.GetRecipesUseCase


class HomeViewModel(private val getRecipesUseCase: GetRecipesUseCase) : BaseViewModel() {

    fun doSomething(context: Context) {
        Toast.makeText(context, "Blabla", Toast.LENGTH_LONG).show()
    }

}
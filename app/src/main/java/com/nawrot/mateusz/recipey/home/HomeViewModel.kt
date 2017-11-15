package com.nawrot.mateusz.recipey.home

import android.content.Context
import android.widget.Toast
import com.nawrot.mateusz.recipey.base.BaseViewModel
import com.nawrot.mateusz.recipey.domain.recipe.interactor.GetRecipesUseCase
import com.nawrot.mateusz.recipey.domain.recipe.model.Recipe
import com.nawrot.mateusz.recipey.navigation.NavigationRouter
import io.reactivex.Observable
import javax.inject.Inject


class HomeViewModel @Inject constructor(private val navigationRouter: NavigationRouter,
                                        private val getRecipesUseCase: GetRecipesUseCase) : BaseViewModel() {

    fun doSomething(context: Context): Observable<List<Recipe>> {
        Toast.makeText(context, "Blabla", Toast.LENGTH_LONG).show()
        return getRecipesUseCase.execute(Unit)
    }

}
package com.nawrot.mateusz.recipey.data.recipe.repository

import android.content.Context
import android.util.Log
import com.nawrot.mateusz.recipey.domain.recipe.model.Recipe
import com.nawrot.mateusz.recipey.domain.recipe.repository.RecipeRepository
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class FbRecipeRepository @Inject constructor(val context: Context) : RecipeRepository {

    override fun getRecipes(): Observable<List<Recipe>> {
        Log.d("FB_RECIPE_REPO", "context class = " + context)
        return Observable.defer { Observable.just(emptyList<Recipe>()) }
    }

}
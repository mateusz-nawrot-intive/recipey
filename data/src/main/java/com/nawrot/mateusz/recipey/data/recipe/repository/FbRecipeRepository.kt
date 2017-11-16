package com.nawrot.mateusz.recipey.data.recipe.repository

import android.util.Log
import com.nawrot.mateusz.recipey.domain.recipe.model.Recipe
import com.nawrot.mateusz.recipey.domain.recipe.repository.RecipeRepository
import io.reactivex.Observable
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class FbRecipeRepository @Inject constructor(private val retrofit: Retrofit) : RecipeRepository {

    override fun getRecipes(): Observable<List<Recipe>> {
        Log.d("FB_RECIPE", "retrofit baseurl = ${retrofit.baseUrl()}")
        return Observable.defer { Observable.just(emptyList<Recipe>()) }
    }

}
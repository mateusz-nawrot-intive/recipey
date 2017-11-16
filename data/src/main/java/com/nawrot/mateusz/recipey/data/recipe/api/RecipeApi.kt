package com.nawrot.mateusz.recipey.data.recipe.api

import com.nawrot.mateusz.recipey.data.recipe.data.RecipeDto
import io.reactivex.Single
import retrofit2.http.GET


interface RecipeApi {

    @GET("data/recipes")
    fun getRecipes(): Single<List<RecipeDto>>

}
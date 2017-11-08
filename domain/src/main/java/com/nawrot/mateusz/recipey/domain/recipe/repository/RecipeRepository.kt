package com.nawrot.mateusz.recipey.domain.recipe.repository

import com.nawrot.mateusz.recipey.domain.recipe.model.Recipe
import io.reactivex.Observable


interface RecipeRepository {

    fun getRecipes() : Observable<List<Recipe>>
}
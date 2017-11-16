package com.nawrot.mateusz.recipey.domain.recipe.repository

import com.nawrot.mateusz.recipey.domain.recipe.model.Recipe
import io.reactivex.Single


interface RecipeRepository {

    fun getRecipes() : Single<List<Recipe>>
}
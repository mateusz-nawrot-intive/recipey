package com.nawrot.mateusz.recipey.data.recipe.repository

import com.nawrot.mateusz.recipey.domain.recipe.model.Recipe
import com.nawrot.mateusz.recipey.domain.recipe.repository.RecipeRepository
import io.reactivex.Observable
import javax.inject.Inject


class FbRecipeRepository @Inject constructor() : RecipeRepository {

    override fun getRecipes(): Observable<List<Recipe>> {
        TODO()
    }

}
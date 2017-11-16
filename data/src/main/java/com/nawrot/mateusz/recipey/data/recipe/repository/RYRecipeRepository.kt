package com.nawrot.mateusz.recipey.data.recipe.repository

import com.nawrot.mateusz.recipey.data.recipe.api.RecipeApi
import com.nawrot.mateusz.recipey.domain.recipe.model.Recipe
import com.nawrot.mateusz.recipey.domain.recipe.repository.RecipeRepository
import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class RYRecipeRepository @Inject constructor(private val retrofit: Retrofit) : RecipeRepository {

    override fun getRecipes(): Single<List<Recipe>> {
        return retrofit.create(RecipeApi::class.java).getRecipes()
                .map { recipeDtos ->
                    recipeDtos.map { Recipe(it.name, it.ingredients) }
                }
    }

}
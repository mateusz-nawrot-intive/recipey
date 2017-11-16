package com.nawrot.mateusz.recipey.domain.recipe.interactor

import com.nawrot.mateusz.recipey.domain.base.SchedulersProvider
import com.nawrot.mateusz.recipey.domain.base.usecase.SingleUseCase
import com.nawrot.mateusz.recipey.domain.recipe.model.Recipe
import com.nawrot.mateusz.recipey.domain.recipe.repository.RecipeRepository
import io.reactivex.Single
import javax.inject.Inject


class GetRecipesUseCase @Inject constructor(schedulersProvider: SchedulersProvider,
                                            private val recipeRepository: RecipeRepository): SingleUseCase<Unit, List<Recipe>>(schedulersProvider) {

    override fun createUseCaseSingle(param: Unit): Single<List<Recipe>> {
        return recipeRepository.getRecipes()
    }

}

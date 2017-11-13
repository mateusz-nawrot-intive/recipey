package com.nawrot.mateusz.recipey.domain.recipe.interactor

import com.nawrot.mateusz.recipey.domain.base.SchedulersProvider
import com.nawrot.mateusz.recipey.domain.base.usecase.ObservableUseCase
import com.nawrot.mateusz.recipey.domain.recipe.model.Recipe
import com.nawrot.mateusz.recipey.domain.recipe.repository.RecipeRepository
import io.reactivex.Observable
import javax.inject.Inject


class GetRecipesUseCase @Inject constructor(schedulersProvider: SchedulersProvider,
                                            private val recipeRepository: RecipeRepository): ObservableUseCase<Unit, List<Recipe>>(schedulersProvider) {

    override fun createUseCaseObservable(param: Unit): Observable<List<Recipe>> {
        return recipeRepository.getRecipes()
    }

}

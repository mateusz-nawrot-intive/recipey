package com.nawrot.mateusz.recipey.di

import android.app.Application
import android.content.Context
import com.nawrot.mateusz.recipey.data.base.AndroidSchedulersProvider
import com.nawrot.mateusz.recipey.data.recipe.repository.FbRecipeRepository
import com.nawrot.mateusz.recipey.domain.base.SchedulersProvider
import com.nawrot.mateusz.recipey.domain.recipe.repository.RecipeRepository
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
abstract class AppModule {

    @Module
    companion object {
        @Provides
        fun provideContext(app: Application): Context {
            return app.applicationContext
        }
    }

    @Binds
    abstract fun schedulersProvider(androidSchedulersProvider: AndroidSchedulersProvider): SchedulersProvider

    @Binds
    abstract fun recipeRepository(recipeRepository: FbRecipeRepository): RecipeRepository

}
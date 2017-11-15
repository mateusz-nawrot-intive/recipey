package com.nawrot.mateusz.recipey.di

import android.content.Context
import com.nawrot.mateusz.recipey.App
import com.nawrot.mateusz.recipey.data.base.AndroidSchedulersProvider
import com.nawrot.mateusz.recipey.data.recipe.repository.FbRecipeRepository
import com.nawrot.mateusz.recipey.domain.base.SchedulersProvider
import com.nawrot.mateusz.recipey.domain.recipe.repository.RecipeRepository
import com.nawrot.mateusz.recipey.navigation.AppNavigator
import com.nawrot.mateusz.recipey.navigation.Navigator
import dagger.Binds
import dagger.Module


@Module(includes = arrayOf(ViewModelModule::class))
abstract class AppModule {

    @Binds
    abstract fun bindContext(app: App): Context

    @Binds
    abstract fun schedulersProvider(androidSchedulersProvider: AndroidSchedulersProvider): SchedulersProvider

    @Binds
    abstract fun navigator(appNavigator: AppNavigator): Navigator

    @Binds
    abstract fun recipeRepository(recipeRepository: FbRecipeRepository): RecipeRepository

}
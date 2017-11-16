package com.nawrot.mateusz.recipey.di

import android.content.Context
import com.nawrot.mateusz.recipey.App
import com.nawrot.mateusz.recipey.R
import com.nawrot.mateusz.recipey.data.base.AndroidSchedulersProvider
import com.nawrot.mateusz.recipey.data.recipe.repository.FbRecipeRepository
import com.nawrot.mateusz.recipey.domain.base.SchedulersProvider
import com.nawrot.mateusz.recipey.domain.recipe.repository.RecipeRepository
import com.nawrot.mateusz.recipey.navigation.AppNavigator
import com.nawrot.mateusz.recipey.navigation.Navigator
import dagger.Binds
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Named
import javax.inject.Singleton


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

    @Module
    companion object {

        @JvmStatic
        @Provides
        @Named("applicationId")
        fun applicationId(context: Context) : String {
            return context.getString(R.string.application_id)
        }

        @JvmStatic
        @Provides
        @Named("apiKey")
        fun apiKey(context: Context) : String {
            return context.getString(R.string.rest_api_key)
        }

        @JvmStatic
        @Provides
        @Singleton
        fun okHttpClient(): OkHttpClient {
            val builder = OkHttpClient.Builder()
            builder.retryOnConnectionFailure(true)

            val logInterceptor = HttpLoggingInterceptor()
            logInterceptor.level = HttpLoggingInterceptor.Level.BODY
            builder.addInterceptor(logInterceptor)
            return builder.build()
        }

        @JvmStatic
        @Provides
        @Singleton
        fun retrofit(okHttpClient: OkHttpClient, @Named("applicationId") applicationId: String, @Named("apiKey") apiKey: String) : Retrofit {
            return Retrofit.Builder()
                    .baseUrl("https://api.backendless.com/$applicationId/$apiKey/")
                    .addConverterFactory(MoshiConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(okHttpClient)
                    .build()
        }

    }

}
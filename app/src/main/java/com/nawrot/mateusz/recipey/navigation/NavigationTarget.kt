package com.nawrot.mateusz.recipey.navigation

import android.app.Activity
import com.nawrot.mateusz.recipey.home.HomeActivity
import kotlin.reflect.KClass


enum class NavigationTarget(val targetClass: KClass<out Activity>) {

    HOME(HomeActivity::class),
    RECIPE_DETAILS(HomeActivity::class);

    val params: HashMap<String, Any> = hashMapOf()

    fun withParam(name: String, value: String): NavigationTarget {
        params.put(name, value)
        return this
    }

    fun withParam(name: String, value: Int): NavigationTarget {
        params.put(name, value)
        return this
    }

    fun withParam(name: String, value: Double): NavigationTarget {
        params.put(name, value)
        return this
    }

    fun withParam(name: String, value: Boolean): NavigationTarget {
        params.put(name, value)
        return this
    }

}
package com.nawrot.mateusz.recipey.navigation

import android.content.Context
import android.util.Log
import com.nawrot.mateusz.recipey.di.ActivityScope
import javax.inject.Inject

@ActivityScope
class NavigationRouter @Inject constructor(private val context: Context, private val navigator: Navigator) {

    init {
        Log.d("NAVIGATION_ROUTER", "Context class = " + context.javaClass.simpleName)
    }

    fun navigateTo(navigationTarget: NavigationTarget) {
        navigator.navigateTo(context, navigationTarget)
    }
}
package com.nawrot.mateusz.recipey.navigation

import android.content.Context
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NavigationRouter @Inject constructor(private val navigator: Navigator) {

    init {
        Log.d("NAVIGATION_ROUTER", "Creating navigation router")
    }

    fun navigateTo(context: Context, navigationTarget: NavigationTarget) {
        navigator.navigateTo(context, navigationTarget)
    }
}
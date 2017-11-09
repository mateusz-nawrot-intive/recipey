package com.nawrot.mateusz.recipey.navigation

import android.content.Context


interface Navigator {

    fun navigateTo(context: Context, navigationTarget: NavigationTarget)

}
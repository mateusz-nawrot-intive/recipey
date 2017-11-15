package com.nawrot.mateusz.recipey.navigation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class AppNavigator @Inject constructor() : Navigator {
    init {
        Log.d("APP_NAVIGATOR", "CREATING APP NAVIGATOR")
    }

    override fun navigateTo(context: Context, navigationTarget: NavigationTarget) {
        val activityIntent = Intent(context, navigationTarget.targetClass.java)
        activityIntent.putExtras(prepareParams(navigationTarget.params))
        context.startActivity(activityIntent)
    }

    private fun prepareParams(targetParams: HashMap<String, Any>): Bundle {
        val result = Bundle()

        for ((key, value) in targetParams) {
            when (value) {
                is String -> result.putString(key, value)
                is Int -> result.putInt(key, value)
                is Double -> result.putDouble(key, value)
                is Boolean -> result.putBoolean(key, value)
            }
        }

        return result
    }
}
package com.nawrot.mateusz.recipey.base

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import kotlin.reflect.KClass


abstract class BaseViewModelFactory<out P : Any>(private val viewModelClass: KClass<P>) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        require(modelClass.isAssignableFrom(viewModelClass.java)) {
            "Could not instantiate ${javaClass.simpleName} class"
        }
        return createViewModel() as T
    }

    abstract fun createViewModel(): P
}
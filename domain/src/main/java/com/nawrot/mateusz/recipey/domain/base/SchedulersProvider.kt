package com.nawrot.mateusz.recipey.domain.base

import io.reactivex.ObservableTransformer


interface SchedulersProvider {

    fun <T> apply() : ObservableTransformer<T, T>
}
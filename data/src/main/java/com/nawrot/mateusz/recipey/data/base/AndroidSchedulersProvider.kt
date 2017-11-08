package com.nawrot.mateusz.recipey.data.base

import com.nawrot.mateusz.recipey.domain.base.SchedulersProvider
import io.reactivex.ObservableTransformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class AndroidSchedulersProvider : SchedulersProvider {

    override fun <T> apply(): ObservableTransformer<T, T> {
        return ObservableTransformer { it ->
            it.apply {
                subscribeOn(Schedulers.io())
                observeOn(AndroidSchedulers.mainThread())
            }
        }
    }
}
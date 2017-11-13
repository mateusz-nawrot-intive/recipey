package com.nawrot.mateusz.recipey.data.base

import android.util.Log
import com.nawrot.mateusz.recipey.domain.base.SchedulersProvider
import io.reactivex.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class AndroidSchedulersProvider @Inject constructor() : SchedulersProvider {

    override fun completableTransformer(): CompletableTransformer {
        return getCompletableTransformer()
    }

    override fun <T> singleTransformer(): SingleTransformer<T, T> {
        return getSingleTransformer()
    }

    override fun <T> observableTransformer(): ObservableTransformer<T, T> {
        return getObservableTransformer()
    }

    private fun getCompletableTransformer(): CompletableTransformer {
        Log.d("AndroidSchedulersProv", "CREATING COMPLETABLE TRANSFORMER");
        return CompletableTransformer {
            it.apply {
                subscribeOn(Schedulers.io())
                observeOn(AndroidSchedulers.mainThread())
            }
        }
    }

    private fun <T> getSingleTransformer(): SingleTransformer<T, T> {
        Log.d("AndroidSchedulersProv", "CREATING SINGLE TRANSFORMER");
        return SingleTransformer {
            it.apply {
                subscribeOn(io.reactivex.schedulers.Schedulers.io())
                observeOn(AndroidSchedulers.mainThread())
            }
        }
    }

    private fun <T> getObservableTransformer(): ObservableTransformer<T, T> {
        Log.d("AndroidSchedulersProv", "CREATING OBSERVABLE TRANSFORMER");
        return ObservableTransformer {
            it.apply {
                subscribeOn(Schedulers.io())
                observeOn(AndroidSchedulers.mainThread())
            }
        }
    }
}
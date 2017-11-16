package com.nawrot.mateusz.recipey

import android.app.Activity
import android.app.Application
import com.backendless.Backendless
import com.nawrot.mateusz.recipey.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


class App : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this)

        initBackendless()
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }

    private fun initBackendless() {
        Backendless.initApp(this, getString(R.string.application_id), getString(R.string.api_key))
    }
}
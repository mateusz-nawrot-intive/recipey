package com.nawrot.mateusz.recipey.splash

import android.os.Bundle
import com.nawrot.mateusz.recipey.R
import com.nawrot.mateusz.recipey.base.BaseActivity


class SplashScreenActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
    }

}
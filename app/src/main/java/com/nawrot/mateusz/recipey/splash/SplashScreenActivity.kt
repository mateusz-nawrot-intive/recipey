package com.nawrot.mateusz.recipey.splash

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import com.nawrot.mateusz.recipey.R
import com.nawrot.mateusz.recipey.base.BaseActivity
import com.nawrot.mateusz.recipey.base.getColorCompat
import com.nawrot.mateusz.recipey.base.getDimenValue
import com.nawrot.mateusz.recipey.base.setColor
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_splash_screen.*
import javax.inject.Inject


class SplashScreenActivity : BaseActivity() {

    @Inject
    lateinit var splashScreenViewModelFactory: SplashScreenViewModelFactory

    private lateinit var splashScreenViewModel: SplashScreenViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        splashScreenViewModel = ViewModelProviders.of(this, splashScreenViewModelFactory).get(SplashScreenViewModel::class.java)

        splashScreenProgress.setColor(getColorCompat(R.color.white))
        animateSplash()
        splashScreenViewModel.initializeApplication().subscribe(
                { splashScreenViewModel.openHomeScreen() },
                { error -> Log.d("ERROR", Log.getStackTraceString(error)) }
        )
    }

    private fun animateSplash() {
        splashScreenTitle.alpha = 0f
        splashScreenTitle.translationY = 3 * getDimenValue(R.dimen.activity_horizontal_margin)

        splashScreenProgress.alpha = 0f

        splashScreenTitle.animate().alpha(1f).translationY(0f)
                .duration = resources.getInteger(android.R.integer.config_longAnimTime).toLong()

        splashScreenProgress.animate().alpha(1f)
                .setStartDelay(resources.getInteger(android.R.integer.config_longAnimTime).toLong())
                .duration = resources.getInteger(android.R.integer.config_longAnimTime).toLong()
    }

}
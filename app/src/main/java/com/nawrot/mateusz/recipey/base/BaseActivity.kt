package com.nawrot.mateusz.recipey.base

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem


open class BaseActivity : AppCompatActivity() {

    fun initToolbar(toolbar: Toolbar, navigationIconEnabled: Boolean? = null) {
        setSupportActionBar(toolbar)
        navigationIconEnabled?.let { supportActionBar?.setDisplayHomeAsUpEnabled(navigationIconEnabled) }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
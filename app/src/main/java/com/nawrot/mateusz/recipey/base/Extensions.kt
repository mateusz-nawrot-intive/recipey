package com.nawrot.mateusz.recipey.base

import android.content.Context
import android.graphics.PorterDuff
import android.support.annotation.ColorRes
import android.support.annotation.DimenRes
import android.support.v4.content.ContextCompat
import android.widget.ProgressBar


fun ProgressBar.setColor(color: Int) {
    indeterminateDrawable.setColorFilter(color, PorterDuff.Mode.SRC_IN)
}

fun Context.getColorCompat(@ColorRes color: Int): Int {
    return ContextCompat.getColor(this, color)
}

fun Context.getDimenValue(@DimenRes dimen: Int): Float {
    return resources.getDimension(dimen)
}


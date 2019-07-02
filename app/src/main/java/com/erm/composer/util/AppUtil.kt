package com.erm.composer.util

import android.os.Looper

fun onMainThread() =  Looper.myLooper() == Looper.getMainLooper()
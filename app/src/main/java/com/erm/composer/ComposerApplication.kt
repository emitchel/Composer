package com.erm.composer

import com.facebook.stetho.Stetho
import com.jakewharton.threetenabp.AndroidThreeTen
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import timber.log.Timber

class ComposerApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<ComposerApplication> =
        DaggerAppComponent.builder().create(this@ComposerApplication)

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
        AndroidThreeTen.init(this)
        Stetho.initializeWithDefaults(this)
    }

}
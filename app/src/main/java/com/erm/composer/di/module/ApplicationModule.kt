package com.erm.composer.di.module

import android.content.Context
import com.erm.composer.ComposerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class ApplicationModule {

    @Singleton
    @Provides
    fun provideApplicationContext(application: ComposerApplication): Context =
        application.applicationContext

}
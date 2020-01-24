package com.erm.composer.di.module

import com.erm.composer.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class InjectorsModule {
//
//    @ContributesAndroidInjector()
//    abstract fun contributeBaseActivity(): BaseActivity

    @ContributesAndroidInjector(modules = [(FragmentBuildersModule::class)])
    abstract fun contributeMainActivity(): MainActivity
//
//    @ContributesAndroidInjector()
//    abstract fun contributeDetailsActivity(): DetailsActivity

}
package com.erm.composer.di.component

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import com.erm.artists.di.module.*
import com.erm.composer.ComposerApplication
import com.erm.composer.di.module.ApplicationModule
import com.erm.composer.di.module.InjectorsModule
import com.erm.composer.di.module.RepositoryModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ApplicationModule::class,
    PersistenceModule::class,
    RepositoryModule::class,
    InjectorsModule::class])
interface AppComponent: AndroidInjector<ComposerApplication> {
    @Component.Builder
    abstract class Builder: AndroidInjector.Builder<ComposerApplication>()
}
package com.erm.artists.di.module

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import androidx.room.Room
import com.erm.composer.data.db.ComposerDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * All repository classes go here
 */
@Module
class PersistenceModule {
    companion object {
        private const val COMPOSER_DATABASE_NAME = "composer.db"
    }

    @Singleton
    @Provides
    fun provideSharedPreferences(applicationContext: Context): SharedPreferences =
        PreferenceManager.getDefaultSharedPreferences(applicationContext)

    @Singleton
    @Provides
    fun provideDatabase(applicationContext: Context): ComposerDatabase {
        return Room.databaseBuilder(
            applicationContext.applicationContext,
            ComposerDatabase::class.java,
            COMPOSER_DATABASE_NAME
        ).build()
    }
}
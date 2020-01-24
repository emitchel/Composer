package com.erm.composer.di.module

import com.erm.composer.data.repository.ArtistRepository
import com.erm.composer.data.repository.impl.BandsInTownArtistRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton


/**
 * All repository classes go here
 */
@Module
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindBandsInTownArtistRespository(bandsInTownArtistRepository: BandsInTownArtistRepository): ArtistRepository

}
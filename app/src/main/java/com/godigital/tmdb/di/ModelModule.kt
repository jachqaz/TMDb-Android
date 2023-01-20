package com.godigital.tmdb.di


import com.godigital.tmdb.domain.model.Movie
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ModelModule {
    @Singleton
    @Provides
    fun provideMovie() = Movie()

}

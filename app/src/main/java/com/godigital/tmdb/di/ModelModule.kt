package com.godigital.tmdb.di


import com.godigital.tmdb.domain.model.Post
import com.godigital.tmdb.domain.model.User
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
    fun providePost() = Post()

    @Singleton
    @Provides
    fun provideUser() = User()

}

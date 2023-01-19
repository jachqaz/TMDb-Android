package com.godigital.tmdb.di

import androidx.lifecycle.MutableLiveData
import com.godigital.tmdb.domain.model.Post
import com.godigital.tmdb.domain.model.User
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MutableLiveDataModule {

    @Singleton
    @Provides
    fun provideMutableLiveDataUser() = MutableLiveData<List<User>>()

    @Singleton
    @Provides
    fun provideMutableLiveDataPost() = MutableLiveData<List<Post>>()
}

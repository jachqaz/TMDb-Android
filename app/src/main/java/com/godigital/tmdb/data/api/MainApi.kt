package com.godigital.tmdb.data.api

import com.godigital.tmdb.data.api.interfaces.PostApi
import com.godigital.tmdb.data.api.interfaces.UserApi
import com.godigital.tmdb.data.api.objects.ObjectRetrofit
import com.godigital.tmdb.domain.model.Post
import com.godigital.tmdb.domain.model.User
import retrofit2.Response
import javax.inject.Inject

class MainApi @Inject constructor() {
    suspend fun getUsers(): Response<List<User>> {
        return ObjectRetrofit.getInstance().create(UserApi::class.java).getUsers()
    }

    suspend fun getPosts(): Response<List<Post>> {
        return ObjectRetrofit.getInstance().create(PostApi::class.java).getPosts()
    }

    suspend fun findPost(userId: Long): Response<List<Post>> {
        return ObjectRetrofit.getInstance().create(PostApi::class.java).findPost(userId)
    }

}

package com.godigital.tmdb.data.api.interfaces

import com.godigital.tmdb.domain.model.Post
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PostApi {
    @GET("/posts")
    suspend fun getPosts(): Response<List<Post>>

    @GET("/posts")
    suspend fun findPost(@Query("userId") id: Long): Response<List<Post>>
}

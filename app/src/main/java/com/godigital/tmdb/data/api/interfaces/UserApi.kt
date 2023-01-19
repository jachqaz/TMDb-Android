package com.godigital.tmdb.data.api.interfaces

import com.godigital.tmdb.domain.model.User
import retrofit2.Response
import retrofit2.http.GET

interface UserApi {
    @GET("/users")
    suspend fun getUsers(): Response<List<User>>
}

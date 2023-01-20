package com.godigital.tmdb.data.api.interfaces

import com.godigital.tmdb.domain.model.ListMovie
import com.godigital.tmdb.domain.model.Movie
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApi {
    @GET("/3/list/{list_id}")
    suspend fun getList(
        @Path("list_id") list_id: Int,
        @Query("api_key") api_key: String
    ): Response<ListMovie>

    @GET("/3/movie/{movie_id}")
    suspend fun getMovies(
        @Path("movie_id") movie_id: Int,
        @Query("api_key") api_key: String
    ): Response<Movie>

}

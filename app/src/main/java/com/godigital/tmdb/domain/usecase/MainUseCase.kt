package com.godigital.tmdb.domain.usecase

import com.godigital.tmdb.data.api.MainApi
import com.godigital.tmdb.domain.model.Movie
import javax.inject.Inject

class MainUseCase @Inject constructor(
    private val mainApi: MainApi
) {
    suspend fun getMovies(): List<Movie> {
        return mainApi.getMovies()
    }
}

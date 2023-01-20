package com.godigital.tmdb.domain.usecase

import com.godigital.tmdb.data.api.MainApi
import com.godigital.tmdb.data.room.MovieRepository
import com.godigital.tmdb.domain.model.Movie
import javax.inject.Inject

class MainUseCase @Inject constructor(
    private val mainApi: MainApi,
    private val movieRepository: MovieRepository
) {
    suspend fun getMovies(): List<Movie> {
        return movieRepository.getMovies().ifEmpty {
            mainApi.getMovies().let { movieRepository.insertAll(it) }
            movieRepository.getMovies()
        }
    }
}

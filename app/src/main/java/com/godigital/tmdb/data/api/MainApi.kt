package com.godigital.tmdb.data.api

import com.godigital.tmdb.data.api.interfaces.MovieApi
import com.godigital.tmdb.data.api.objects.ObjectRetrofit
import com.godigital.tmdb.data.api.objects.ObjectRetrofit.APY_KEY
import com.godigital.tmdb.data.api.objects.ObjectRetrofit.LIST_ID
import com.godigital.tmdb.domain.model.Movie
import javax.inject.Inject

class MainApi @Inject constructor() {
    suspend fun getMovies(): List<Movie> {
        val listMovie: ArrayList<Movie> = arrayListOf()
        ObjectRetrofit.getInstance().create(MovieApi::class.java).getList(LIST_ID, APY_KEY)
            .body()?.items?.forEach {
            if (it.id != null && listMovie.size < 5) {
                listMovie.add(
                    ObjectRetrofit.getInstance().create(MovieApi::class.java)
                        .getMovies(it.id!!, APY_KEY).body() ?: Movie()
                )
            }
        }
        return listMovie
    }
}

package com.godigital.tmdb.data.api.objects

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ObjectRetrofit {
    private const val BASE_URL = "https://api.themoviedb.org/"
    const val APY_KEY = "f16c8506cda4e08300b9149a1ff5cd59"
    const val LIST_ID = 1
    const val MOVIE_ID = 634649

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}

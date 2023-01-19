package com.godigital.tmdb.domain.usecase

import com.godigital.tmdb.data.api.MainApi
import com.godigital.tmdb.domain.model.Post
import com.godigital.tmdb.domain.model.User
import javax.inject.Inject

class MainUseCase @Inject constructor(
    private val mainApi: MainApi,
) {
}

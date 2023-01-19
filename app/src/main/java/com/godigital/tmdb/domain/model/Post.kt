package com.godigital.tmdb.domain.model



data class Post(
    var postId: Long = 0,
    var userId: Int? = 0,
    var id: Int? = 0,
    var title: String? = "",
    var body: String? = "",
)

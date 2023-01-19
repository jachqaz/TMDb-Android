package com.godigital.tmdb.domain.model




data class User(
    var userId: Long = 0,
    val id: Long? = 0,
    val name: String? = "",
    val username: String? = "",
    val email: String? = "",
    val phone: String? = "",
    val website: String? = "",
)

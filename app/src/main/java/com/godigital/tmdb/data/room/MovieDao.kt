package com.godigital.tmdb.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.godigital.tmdb.domain.model.Movie

@Dao
interface MovieDao {
    @Query("SELECT * FROM movie")
    fun getAll(): List<Movie>

    @Insert()
    suspend fun insertAll(movies: List<Movie>)
}

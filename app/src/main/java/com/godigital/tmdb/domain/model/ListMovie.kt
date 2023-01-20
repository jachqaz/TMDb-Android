package com.godigital.tmdb.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "list_movie")
data class ListMovie(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("created_by") var createdBy: String? = null,
    @SerializedName("description") var description: String? = null,
    @SerializedName("favorite_count") var favoriteCount: Int? = null,
    @ColumnInfo(name = "id")
    @SerializedName("id") var id: String? = null,
    @SerializedName("items") var items: ArrayList<Items> = arrayListOf(),
    @SerializedName("item_count") var itemCount: Int? = null,
    @SerializedName("iso_639_1") var iso6391: String? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("poster_path") var posterPath: String? = null
)
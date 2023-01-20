package com.godigital.tmdb.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "spoken_languages")
data class SpokenLanguages(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("english_name") var englishName: String? = null,
    @SerializedName("iso_639_1") var iso6391: String? = null,
    @ColumnInfo(name = "name")
    @SerializedName("name") var name: String? = null

)
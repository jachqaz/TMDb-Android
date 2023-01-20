package com.godigital.tmdb.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "production_countries")
data class ProductionCountries(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("iso_3166_1") var iso31661: String? = null,
    @ColumnInfo(name = "name")
    @SerializedName("name") var name: String? = null

)
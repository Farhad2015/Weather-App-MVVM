package com.code_example.myapplication.features.weather_info_show.model.data_class

import com.google.gson.annotations.SerializedName

data class Clouds(
    @SerializedName("all")
    val all: Int = 0
)

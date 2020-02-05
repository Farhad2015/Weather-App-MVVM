package com.code_example.myapplication.features.weather_info_show.model

import com.code_example.myapplication.common.RequestCompleteListener
import com.code_example.myapplication.features.weather_info_show.model.data_class.City
import com.code_example.myapplication.features.weather_info_show.model.data_class.WeatherInfoResponse

interface WeatherInfoShowModel {
    fun getCityList(callback:RequestCompleteListener<MutableList<City>>)
    fun getWeatherInfo(cityId:Int, callback: RequestCompleteListener<WeatherInfoResponse>)
}
package com.example.weather.repository

import io.ktor.client.request.*
import com.example.weather.data.WeatherData
import com.example.weather.di.DataModule
import com.example.weather.di.DataModule.API_KEY
import com.example.weather.di.DataModule.URL

object Repository {
    suspend fun getWeather(latitude: Double, longitude: Double) : WeatherData {
        return DataModule.client.get(URL + "/data/2.5/weather") {
            parameter("appid", API_KEY)
            parameter("lat", latitude)
            parameter("lon", longitude)
            parameter("lang", "kr")
        }
    }
}
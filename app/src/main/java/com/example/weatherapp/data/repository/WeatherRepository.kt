package com.example.weatherapp.data.repository

import android.content.Context
import com.example.weatherapp.utils.Constants.APP_ID
import com.example.weatherapp.data.api.WeatherApi
import com.example.weatherapp.data.db.WeatherDao
import com.example.weatherapp.data.model.WeatherModel
import com.example.weatherapp.data.repository.base.BaseRepository
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class WeatherRepository @Inject constructor(
    @ApplicationContext val context: Context,
    private val weatherApi: WeatherApi,
    private val weatherDao: WeatherDao
    ): BaseRepository() {

    suspend fun getWeatherFromServer(latitude: Double, longitude: Double) = apiCall {
        weatherApi.getWeather(latitude, longitude, APP_ID)
    }

    suspend fun insert(weatherModel: WeatherModel) {
        weatherDao.insert(weatherModel)
    }

    suspend fun getWeatherFromDatabase() = weatherDao.getWeather()

}
package com.example.weatherapp.data.db

import androidx.room.*
import com.example.weatherapp.data.model.WeatherModel

@Dao
interface WeatherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(vararg weatherModel: WeatherModel)

    @Query("SELECT * FROM weather_table")
    suspend fun getWeather(): WeatherModel
}
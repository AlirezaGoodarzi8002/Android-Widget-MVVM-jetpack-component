package com.example.weatherapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.weatherapp.data.model.Converters
import com.example.weatherapp.data.model.WeatherModel

@Database(entities = [WeatherModel::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase: RoomDatabase() {
    abstract fun weatherDao(): WeatherDao
}
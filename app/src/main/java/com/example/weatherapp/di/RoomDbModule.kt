package com.example.weatherapp.di

import android.app.Application
import androidx.room.Room
import com.example.weatherapp.utils.Constants
import com.example.weatherapp.data.db.AppDatabase
import com.example.weatherapp.data.db.WeatherDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RoomDbModule
{
    @Singleton
    @Provides
    fun providesDatabase (application: Application): AppDatabase =
        Room.databaseBuilder(application, AppDatabase::class.java, Constants.DB_NAME).build()

    @Singleton
    @Provides
    fun providesCurrentWeatherDao (database: AppDatabase) : WeatherDao = database.weatherDao()
}
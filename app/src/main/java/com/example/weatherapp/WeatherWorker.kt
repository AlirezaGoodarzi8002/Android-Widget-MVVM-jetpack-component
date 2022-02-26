package com.example.weatherapp

import android.content.Context
import android.content.Intent
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.weatherapp.data.model.base.Resource
import com.example.weatherapp.data.repository.WeatherRepository
import com.example.weatherapp.ui.view.NewAppWidget
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

@HiltWorker
class WeatherWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted workerParams: WorkerParameters,
    private val weatherRepository: WeatherRepository
) : CoroutineWorker(context, workerParams) {

    override suspend fun doWork(): Result {
        val latitude: Double
        val longitude: Double
        inputData.apply {
             latitude = getDouble(KEY_LATITUDE, 0.0)
             longitude = getDouble(KEY_LONGITUDE, 0.0)
        }

        return when(val response = weatherRepository.getWeatherFromServer(latitude, longitude)) {
            is Resource.Success -> {
                weatherRepository.insert(response.data)
                NewAppWidget.setIntent(applicationContext, response.data.toString())

                Result.success()
            }

            is Resource.Failure -> {
                Result.failure()
            }

            null -> {
                Result.failure()
            }
        }
    }

    companion object {
        const val KEY_LATITUDE = "KEY_LATITUDE"
        const val KEY_LONGITUDE = "KEY_LONGITUDE"
    }
}
package com.example.weatherapp.ui.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.*
import androidx.work.WorkInfo
import com.example.weatherapp.data.model.WeatherModel
import com.example.weatherapp.data.model.base.Resource
import com.example.weatherapp.data.repository.WeatherRepository
import com.example.weatherapp.helper.LocationHelper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val weatherRepository: WeatherRepository, application: Application
) : AndroidViewModel(application) {

    val weatherLiveData = MutableLiveData<WeatherModel?>()

    fun getWeatherFromServer() {
        LocationHelper.setLocation(getApplication<Application>().applicationContext) {
            viewModelScope.launch {
                when (val response = weatherRepository.getWeatherFromServer(it.latitude, it.longitude)) {
                    is Resource.Success -> {
                        insertWeather(response.data)
                        weatherLiveData.postValue(response.data)
                    }

                    is Resource.Failure -> {
                        Log.e(
                            "mainlog", "getWeatherFromServer: error code ->${response.code}" +
                                    "is server error? -> ${response.isServerError}",
                        )
                    }
                }
            }
        }
    }

    fun insertWeather(weatherModel: WeatherModel) {
        viewModelScope.launch {
            weatherRepository.insert(weatherModel)
        }
    }

    suspend fun getWeatherFromDatabase() = weatherRepository.getWeatherFromDatabase()

}
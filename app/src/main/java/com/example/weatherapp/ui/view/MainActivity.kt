package com.example.weatherapp.ui.view

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.R
import com.example.weatherapp.data.repository.WeatherRepository
import com.example.weatherapp.helper.WorkManagerHelper
import com.example.weatherapp.ui.viewmodel.MainViewModel
import com.example.weatherapp.utils.PermissionUtility
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


private const val REQ_CODE_LOCATION = 100

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    @Inject
    lateinit var workManagerHelper: WorkManagerHelper

    @Inject
    lateinit var weatherRepository: WeatherRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        if (ActivityCompat.checkSelfPermission(applicationContext, Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                applicationContext, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            getWeather()
        } else {
            getLocationPermission()
        }
    }

    private fun getLocationPermission() {
        PermissionUtility.getMultiplePermission(
            this@MainActivity,
            arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION),
            REQ_CODE_LOCATION
        )
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (grantResults[0] == PackageManager.PERMISSION_GRANTED && requestCode == REQ_CODE_LOCATION) {
            getWeather()
        }
    }

    private fun getWeather() {
        mainViewModel.getWeatherFromServer()
        mainViewModel.weatherLiveData.observe(this@MainActivity) { weatherModel ->
            workManagerHelper.enqueueWorkRequest()
        }
    }

}
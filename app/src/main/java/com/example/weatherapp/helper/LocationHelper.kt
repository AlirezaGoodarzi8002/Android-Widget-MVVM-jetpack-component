package com.example.weatherapp.helper

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.tasks.SuccessContinuation

object LocationHelper {

    fun setLocation(context: Context, callback: (Location) -> Unit) {
        try {
            val fusedLocationClient = LocationServices.getFusedLocationProviderClient(context)

            if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    context, Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                return
            }
            fusedLocationClient.lastLocation.addOnSuccessListener { location: Location? ->
                if (location != null)
                    callback.invoke(location)
                else {
                    val locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager

                    locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER)?.let {
                        callback.invoke(it)
                    }
                }
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
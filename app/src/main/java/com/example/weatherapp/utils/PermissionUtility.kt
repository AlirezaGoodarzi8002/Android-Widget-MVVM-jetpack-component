package com.example.weatherapp.utils

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

object PermissionUtility {

    fun getMultiplePermission(activity: Activity, permissions: Array<out String>, reqCode: Int){
        try {
            ActivityCompat.requestPermissions(activity, permissions, reqCode)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}
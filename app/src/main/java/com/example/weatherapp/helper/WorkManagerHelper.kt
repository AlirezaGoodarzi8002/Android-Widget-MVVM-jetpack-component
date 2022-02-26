package com.example.weatherapp.helper

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.work.*
import com.example.weatherapp.WeatherWorker
import com.google.common.util.concurrent.ListenableFuture
import dagger.hilt.android.qualifiers.ApplicationContext
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WorkManagerHelper @Inject constructor(
    @ApplicationContext private val applicationContext: Context
) {

    private lateinit var workManager: WorkManager
    private lateinit var uuid: UUID

    fun enqueueWorkRequest() {
        LocationHelper.setLocation(applicationContext) { location ->
            val constraints = Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build()

            val workData = workDataOf(
                WeatherWorker.KEY_LATITUDE to location.latitude,
                WeatherWorker.KEY_LONGITUDE to location.longitude
            )

            val weatherWorkRequest =
                PeriodicWorkRequestBuilder<WeatherWorker>(30L, TimeUnit.MINUTES)
                    .setConstraints(constraints)
                    .setInputData(workData)
                    .build()

            uuid = weatherWorkRequest.id
            workManager = WorkManager.getInstance(applicationContext)
            workManager.enqueue(weatherWorkRequest)
        }
    }

    fun cancelWorkManager() {
        if (::workManager.isInitialized)
            workManager.cancelAllWork()
    }

    fun getWorkInfoByIdLiveData(): LiveData<WorkInfo>? {
        return if (::workManager.isInitialized)
            workManager.getWorkInfoByIdLiveData(uuid)
        else
            null
    }

}
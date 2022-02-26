package com.example.weatherapp.ui.view

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.RemoteViews
import androidx.work.WorkManager
import com.example.weatherapp.R
import com.example.weatherapp.data.model.WeatherModel
import com.example.weatherapp.data.repository.WeatherRepository
import com.example.weatherapp.helper.LocationHelper
import com.example.weatherapp.helper.WorkManagerHelper
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@AndroidEntryPoint
class NewAppWidget : AppWidgetProvider() {

    @Inject
    lateinit var weatherRepository: WeatherRepository

    @Inject
    lateinit var workManagerHelper: WorkManagerHelper

    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {

        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    override fun onDisabled(context: Context) {
        workManagerHelper.cancelWorkManager()
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        super.onReceive(context, intent)

        /** could get data this way
        val stringData = intent?.getStringExtra(KEY_DATA) ?: ""
        val weatherModel = try {
            Gson().fromJson(stringData, WeatherModel::class.java)
        } catch (e: Exception) {
            e.printStackTrace()
            ""
        }
        */

        val appWidgetManager = AppWidgetManager.getInstance(context)
        val thisAppWidgetComponentName = ComponentName(context!!.packageName, javaClass.name)
        val appWidgetIds = appWidgetManager.getAppWidgetIds(thisAppWidgetComponentName)
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    private fun updateAppWidget(context: Context, appWidgetManager: AppWidgetManager, appWidgetId: Int) {
        CoroutineScope(Dispatchers.IO).launch {
            val weatherModel = weatherRepository.getWeatherFromDatabase()

            Log.i("mainlog", "updateAppWidget: $weatherModel")

            val temperatureText = "temperature: ${weatherModel.main.temperature}"
            val weatherText = "weather: ${weatherModel.weather[0].main}"
            // Construct the RemoteViews object
            val views = RemoteViews(context.packageName, R.layout.new_app_widget)
            views.setTextViewText(R.id.tv_widget_temperature, temperatureText)
            views.setTextViewText(R.id.tv_widget_weather, weatherText)

            // Instruct the widget manager to update the widget
            appWidgetManager.updateAppWidget(appWidgetId, views)
        }
    }

    companion object {
        private const val KEY_DATA = "KEY_DATA"

        fun setIntent(context: Context, data: String) {
            Intent(context, NewAppWidget::class.java).apply {
                putExtra(KEY_DATA, data)
                action = "android.appwidget.action.APPWIDGET_UPDATE"
                context.sendBroadcast(this)
            }
        }
    }

}
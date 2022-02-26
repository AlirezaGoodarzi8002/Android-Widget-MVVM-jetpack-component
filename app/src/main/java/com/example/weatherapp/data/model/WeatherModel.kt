package com.example.weatherapp.data.model

import androidx.room.*
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken

@Entity(tableName = "weather_table")
data class WeatherModel (
    @PrimaryKey(autoGenerate = false)
    var weatherId: Int = 1,
    @Embedded
    @SerializedName("clouds")
    var clouds: Clouds,
    @Embedded
    @SerializedName("main")
    var main: Main,
    @TypeConverters(Converters::class)
    @SerializedName("weather")
    var weather: List<Weather>
)

data class Clouds(
    @SerializedName("all")
    @ColumnInfo(name = "cloudsPercentInSky")
    var cloudsPercentInSky: String
)

data class Main(
    @SerializedName("temp")
    @ColumnInfo(name = "temp")
    var temperature: String
)

data class Weather (
    @SerializedName("main")
    @ColumnInfo(name = "main")
    var main: String,
    @SerializedName("description")
    @ColumnInfo(name = "description")
    var description: String
)

class Converters {

    @TypeConverter
    fun fromWeatherList(weatherList: List<Weather>): String? = Gson().toJson(weatherList)

    @TypeConverter
    fun toWeatherList(weatherList: String): List<Weather> {
        val weatherArray = Gson().fromJson(weatherList, Array<Weather>::class.java)
        return weatherArray.toList()
    }
}

package com.example.weatherapp.data.model;

import java.lang.System;

@androidx.room.Entity(tableName = "weather_table")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J7\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\t\u0010%\u001a\u00020&H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\'"}, d2 = {"Lcom/example/weatherapp/data/model/WeatherModel;", "", "weatherId", "", "clouds", "Lcom/example/weatherapp/data/model/Clouds;", "main", "Lcom/example/weatherapp/data/model/Main;", "weather", "", "Lcom/example/weatherapp/data/model/Weather;", "(ILcom/example/weatherapp/data/model/Clouds;Lcom/example/weatherapp/data/model/Main;Ljava/util/List;)V", "getClouds", "()Lcom/example/weatherapp/data/model/Clouds;", "setClouds", "(Lcom/example/weatherapp/data/model/Clouds;)V", "getMain", "()Lcom/example/weatherapp/data/model/Main;", "setMain", "(Lcom/example/weatherapp/data/model/Main;)V", "getWeather", "()Ljava/util/List;", "setWeather", "(Ljava/util/List;)V", "getWeatherId", "()I", "setWeatherId", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class WeatherModel {
    @androidx.room.PrimaryKey(autoGenerate = false)
    private int weatherId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    @com.google.gson.annotations.SerializedName(value = "clouds")
    private com.example.weatherapp.data.model.Clouds clouds;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    @com.google.gson.annotations.SerializedName(value = "main")
    private com.example.weatherapp.data.model.Main main;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "weather")
    private java.util.List<com.example.weatherapp.data.model.Weather> weather;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.model.WeatherModel copy(int weatherId, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.model.Clouds clouds, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.model.Main main, @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverters(value = {com.example.weatherapp.data.model.Converters.class})
    java.util.List<com.example.weatherapp.data.model.Weather> weather) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public WeatherModel(int weatherId, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.model.Clouds clouds, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.model.Main main, @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverters(value = {com.example.weatherapp.data.model.Converters.class})
    java.util.List<com.example.weatherapp.data.model.Weather> weather) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getWeatherId() {
        return 0;
    }
    
    public final void setWeatherId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.model.Clouds component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.model.Clouds getClouds() {
        return null;
    }
    
    public final void setClouds(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.model.Clouds p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.model.Main component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.model.Main getMain() {
        return null;
    }
    
    public final void setMain(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.model.Main p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weatherapp.data.model.Weather> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weatherapp.data.model.Weather> getWeather() {
        return null;
    }
    
    public final void setWeather(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weatherapp.data.model.Weather> p0) {
    }
}
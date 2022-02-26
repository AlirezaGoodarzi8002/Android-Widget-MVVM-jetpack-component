package com.example.weatherapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ)\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/weatherapp/data/repository/WeatherRepository;", "Lcom/example/weatherapp/data/repository/base/BaseRepository;", "context", "Landroid/content/Context;", "weatherApi", "Lcom/example/weatherapp/data/api/WeatherApi;", "weatherDao", "Lcom/example/weatherapp/data/db/WeatherDao;", "(Landroid/content/Context;Lcom/example/weatherapp/data/api/WeatherApi;Lcom/example/weatherapp/data/db/WeatherDao;)V", "getContext", "()Landroid/content/Context;", "getWeatherFromDatabase", "Lcom/example/weatherapp/data/model/WeatherModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherFromServer", "Lcom/example/weatherapp/data/model/base/Resource;", "latitude", "", "longitude", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "weatherModel", "(Lcom/example/weatherapp/data/model/WeatherModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherRepository extends com.example.weatherapp.data.repository.base.BaseRepository {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final com.example.weatherapp.data.api.WeatherApi weatherApi = null;
    private final com.example.weatherapp.data.db.WeatherDao weatherDao = null;
    
    @javax.inject.Inject()
    public WeatherRepository(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.api.WeatherApi weatherApi, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.db.WeatherDao weatherDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWeatherFromServer(double latitude, double longitude, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.weatherapp.data.model.base.Resource<com.example.weatherapp.data.model.WeatherModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.model.WeatherModel weatherModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWeatherFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.weatherapp.data.model.WeatherModel> continuation) {
        return null;
    }
}
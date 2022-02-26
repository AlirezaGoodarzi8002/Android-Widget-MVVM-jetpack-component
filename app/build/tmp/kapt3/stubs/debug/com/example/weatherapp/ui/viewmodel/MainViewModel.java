package com.example.weatherapp.ui.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\f\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tR\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/weatherapp/ui/viewmodel/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "weatherRepository", "Lcom/example/weatherapp/data/repository/WeatherRepository;", "application", "Landroid/app/Application;", "(Lcom/example/weatherapp/data/repository/WeatherRepository;Landroid/app/Application;)V", "weatherLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/weatherapp/data/model/WeatherModel;", "getWeatherLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getWeatherFromDatabase", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherFromServer", "", "insertWeather", "weatherModel", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.weatherapp.data.repository.WeatherRepository weatherRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.weatherapp.data.model.WeatherModel> weatherLiveData = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.repository.WeatherRepository weatherRepository, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.weatherapp.data.model.WeatherModel> getWeatherLiveData() {
        return null;
    }
    
    public final void getWeatherFromServer() {
    }
    
    public final void insertWeather(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.model.WeatherModel weatherModel) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWeatherFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.weatherapp.data.model.WeatherModel> continuation) {
        return null;
    }
}
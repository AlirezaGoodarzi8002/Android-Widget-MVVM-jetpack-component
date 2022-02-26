package com.example.weatherapp.ui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J-\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006 "}, d2 = {"Lcom/example/weatherapp/ui/view/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mainViewModel", "Lcom/example/weatherapp/ui/viewmodel/MainViewModel;", "weatherRepository", "Lcom/example/weatherapp/data/repository/WeatherRepository;", "getWeatherRepository", "()Lcom/example/weatherapp/data/repository/WeatherRepository;", "setWeatherRepository", "(Lcom/example/weatherapp/data/repository/WeatherRepository;)V", "workManagerHelper", "Lcom/example/weatherapp/helper/WorkManagerHelper;", "getWorkManagerHelper", "()Lcom/example/weatherapp/helper/WorkManagerHelper;", "setWorkManagerHelper", "(Lcom/example/weatherapp/helper/WorkManagerHelper;)V", "getLocationPermission", "", "getWeather", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.weatherapp.ui.viewmodel.MainViewModel mainViewModel;
    @javax.inject.Inject()
    public com.example.weatherapp.helper.WorkManagerHelper workManagerHelper;
    @javax.inject.Inject()
    public com.example.weatherapp.data.repository.WeatherRepository weatherRepository;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.helper.WorkManagerHelper getWorkManagerHelper() {
        return null;
    }
    
    public final void setWorkManagerHelper(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.helper.WorkManagerHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.repository.WeatherRepository getWeatherRepository() {
        return null;
    }
    
    public final void setWeatherRepository(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.repository.WeatherRepository p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getLocationPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void getWeather() {
    }
}
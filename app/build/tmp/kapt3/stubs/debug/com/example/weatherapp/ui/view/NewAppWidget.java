package com.example.weatherapp.ui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/example/weatherapp/ui/view/NewAppWidget;", "Landroid/appwidget/AppWidgetProvider;", "()V", "weatherRepository", "Lcom/example/weatherapp/data/repository/WeatherRepository;", "getWeatherRepository", "()Lcom/example/weatherapp/data/repository/WeatherRepository;", "setWeatherRepository", "(Lcom/example/weatherapp/data/repository/WeatherRepository;)V", "workManagerHelper", "Lcom/example/weatherapp/helper/WorkManagerHelper;", "getWorkManagerHelper", "()Lcom/example/weatherapp/helper/WorkManagerHelper;", "setWorkManagerHelper", "(Lcom/example/weatherapp/helper/WorkManagerHelper;)V", "onDisabled", "", "context", "Landroid/content/Context;", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "updateAppWidget", "appWidgetId", "", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class NewAppWidget extends android.appwidget.AppWidgetProvider {
    @javax.inject.Inject()
    public com.example.weatherapp.data.repository.WeatherRepository weatherRepository;
    @javax.inject.Inject()
    public com.example.weatherapp.helper.WorkManagerHelper workManagerHelper;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.weatherapp.ui.view.NewAppWidget.Companion Companion = null;
    private static final java.lang.String KEY_DATA = "KEY_DATA";
    
    public NewAppWidget() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.data.repository.WeatherRepository getWeatherRepository() {
        return null;
    }
    
    public final void setWeatherRepository(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.repository.WeatherRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.helper.WorkManagerHelper getWorkManagerHelper() {
        return null;
    }
    
    public final void setWorkManagerHelper(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.helper.WorkManagerHelper p0) {
    }
    
    @java.lang.Override()
    public void onUpdate(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.appwidget.AppWidgetManager appWidgetManager, @org.jetbrains.annotations.NotNull()
    int[] appWidgetIds) {
    }
    
    @java.lang.Override()
    public void onDisabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final void updateAppWidget(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int appWidgetId) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/weatherapp/ui/view/NewAppWidget$Companion;", "", "()V", "KEY_DATA", "", "setIntent", "", "context", "Landroid/content/Context;", "data", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void setIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String data) {
        }
    }
}
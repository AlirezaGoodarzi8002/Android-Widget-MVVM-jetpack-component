package com.example.weatherapp.data.repository;

import android.content.Context;
import com.example.weatherapp.data.api.WeatherApi;
import com.example.weatherapp.data.db.WeatherDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherRepository_Factory implements Factory<WeatherRepository> {
  private final Provider<Context> contextProvider;

  private final Provider<WeatherApi> weatherApiProvider;

  private final Provider<WeatherDao> weatherDaoProvider;

  public WeatherRepository_Factory(Provider<Context> contextProvider,
      Provider<WeatherApi> weatherApiProvider, Provider<WeatherDao> weatherDaoProvider) {
    this.contextProvider = contextProvider;
    this.weatherApiProvider = weatherApiProvider;
    this.weatherDaoProvider = weatherDaoProvider;
  }

  @Override
  public WeatherRepository get() {
    return newInstance(contextProvider.get(), weatherApiProvider.get(), weatherDaoProvider.get());
  }

  public static WeatherRepository_Factory create(Provider<Context> contextProvider,
      Provider<WeatherApi> weatherApiProvider, Provider<WeatherDao> weatherDaoProvider) {
    return new WeatherRepository_Factory(contextProvider, weatherApiProvider, weatherDaoProvider);
  }

  public static WeatherRepository newInstance(Context context, WeatherApi weatherApi,
      WeatherDao weatherDao) {
    return new WeatherRepository(context, weatherApi, weatherDao);
  }
}

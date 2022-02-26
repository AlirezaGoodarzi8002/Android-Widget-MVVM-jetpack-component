package com.example.weatherapp;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.example.weatherapp.data.repository.WeatherRepository;
import dagger.internal.DaggerGenerated;
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
public final class WeatherWorker_Factory {
  private final Provider<WeatherRepository> weatherRepositoryProvider;

  public WeatherWorker_Factory(Provider<WeatherRepository> weatherRepositoryProvider) {
    this.weatherRepositoryProvider = weatherRepositoryProvider;
  }

  public WeatherWorker get(Context context, WorkerParameters workerParams) {
    return newInstance(context, workerParams, weatherRepositoryProvider.get());
  }

  public static WeatherWorker_Factory create(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    return new WeatherWorker_Factory(weatherRepositoryProvider);
  }

  public static WeatherWorker newInstance(Context context, WorkerParameters workerParams,
      WeatherRepository weatherRepository) {
    return new WeatherWorker(context, workerParams, weatherRepository);
  }
}

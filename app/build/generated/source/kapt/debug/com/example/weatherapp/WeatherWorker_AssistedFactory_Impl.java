package com.example.weatherapp;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
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
public final class WeatherWorker_AssistedFactory_Impl implements WeatherWorker_AssistedFactory {
  private final WeatherWorker_Factory delegateFactory;

  WeatherWorker_AssistedFactory_Impl(WeatherWorker_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public WeatherWorker create(Context context, WorkerParameters parameters) {
    return delegateFactory.get(context, parameters);
  }

  public static Provider<WeatherWorker_AssistedFactory> create(
      WeatherWorker_Factory delegateFactory) {
    return InstanceFactory.create(new WeatherWorker_AssistedFactory_Impl(delegateFactory));
  }
}

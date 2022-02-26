package com.example.weatherapp.ui.viewmodel;

import android.app.Application;
import com.example.weatherapp.data.repository.WeatherRepository;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<WeatherRepository> weatherRepositoryProvider;

  private final Provider<Application> applicationProvider;

  public MainViewModel_Factory(Provider<WeatherRepository> weatherRepositoryProvider,
      Provider<Application> applicationProvider) {
    this.weatherRepositoryProvider = weatherRepositoryProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(weatherRepositoryProvider.get(), applicationProvider.get());
  }

  public static MainViewModel_Factory create(Provider<WeatherRepository> weatherRepositoryProvider,
      Provider<Application> applicationProvider) {
    return new MainViewModel_Factory(weatherRepositoryProvider, applicationProvider);
  }

  public static MainViewModel newInstance(WeatherRepository weatherRepository,
      Application application) {
    return new MainViewModel(weatherRepository, application);
  }
}

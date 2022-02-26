package com.example.weatherapp.ui.view;

import com.example.weatherapp.data.repository.WeatherRepository;
import com.example.weatherapp.helper.WorkManagerHelper;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<WorkManagerHelper> workManagerHelperProvider;

  private final Provider<WeatherRepository> weatherRepositoryProvider;

  public MainActivity_MembersInjector(Provider<WorkManagerHelper> workManagerHelperProvider,
      Provider<WeatherRepository> weatherRepositoryProvider) {
    this.workManagerHelperProvider = workManagerHelperProvider;
    this.weatherRepositoryProvider = weatherRepositoryProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<WorkManagerHelper> workManagerHelperProvider,
      Provider<WeatherRepository> weatherRepositoryProvider) {
    return new MainActivity_MembersInjector(workManagerHelperProvider, weatherRepositoryProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectWorkManagerHelper(instance, workManagerHelperProvider.get());
    injectWeatherRepository(instance, weatherRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.example.weatherapp.ui.view.MainActivity.workManagerHelper")
  public static void injectWorkManagerHelper(MainActivity instance,
      WorkManagerHelper workManagerHelper) {
    instance.workManagerHelper = workManagerHelper;
  }

  @InjectedFieldSignature("com.example.weatherapp.ui.view.MainActivity.weatherRepository")
  public static void injectWeatherRepository(MainActivity instance,
      WeatherRepository weatherRepository) {
    instance.weatherRepository = weatherRepository;
  }
}

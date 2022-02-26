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
public final class NewAppWidget_MembersInjector implements MembersInjector<NewAppWidget> {
  private final Provider<WeatherRepository> weatherRepositoryProvider;

  private final Provider<WorkManagerHelper> workManagerHelperProvider;

  public NewAppWidget_MembersInjector(Provider<WeatherRepository> weatherRepositoryProvider,
      Provider<WorkManagerHelper> workManagerHelperProvider) {
    this.weatherRepositoryProvider = weatherRepositoryProvider;
    this.workManagerHelperProvider = workManagerHelperProvider;
  }

  public static MembersInjector<NewAppWidget> create(
      Provider<WeatherRepository> weatherRepositoryProvider,
      Provider<WorkManagerHelper> workManagerHelperProvider) {
    return new NewAppWidget_MembersInjector(weatherRepositoryProvider, workManagerHelperProvider);
  }

  @Override
  public void injectMembers(NewAppWidget instance) {
    injectWeatherRepository(instance, weatherRepositoryProvider.get());
    injectWorkManagerHelper(instance, workManagerHelperProvider.get());
  }

  @InjectedFieldSignature("com.example.weatherapp.ui.view.NewAppWidget.weatherRepository")
  public static void injectWeatherRepository(NewAppWidget instance,
      WeatherRepository weatherRepository) {
    instance.weatherRepository = weatherRepository;
  }

  @InjectedFieldSignature("com.example.weatherapp.ui.view.NewAppWidget.workManagerHelper")
  public static void injectWorkManagerHelper(NewAppWidget instance,
      WorkManagerHelper workManagerHelper) {
    instance.workManagerHelper = workManagerHelper;
  }
}

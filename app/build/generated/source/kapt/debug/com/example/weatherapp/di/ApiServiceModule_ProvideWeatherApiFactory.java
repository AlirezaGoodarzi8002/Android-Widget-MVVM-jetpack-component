package com.example.weatherapp.di;

import com.example.weatherapp.data.api.WeatherApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiServiceModule_ProvideWeatherApiFactory implements Factory<WeatherApi> {
  private final Provider<Retrofit> retrofitProvider;

  public ApiServiceModule_ProvideWeatherApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public WeatherApi get() {
    return provideWeatherApi(retrofitProvider.get());
  }

  public static ApiServiceModule_ProvideWeatherApiFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new ApiServiceModule_ProvideWeatherApiFactory(retrofitProvider);
  }

  public static WeatherApi provideWeatherApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(ApiServiceModule.INSTANCE.provideWeatherApi(retrofit));
  }
}

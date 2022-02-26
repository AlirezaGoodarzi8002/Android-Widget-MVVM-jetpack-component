package com.example.weatherapp.di;

import com.example.weatherapp.data.db.AppDatabase;
import com.example.weatherapp.data.db.WeatherDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RoomDbModule_ProvidesCurrentWeatherDaoFactory implements Factory<WeatherDao> {
  private final RoomDbModule module;

  private final Provider<AppDatabase> databaseProvider;

  public RoomDbModule_ProvidesCurrentWeatherDaoFactory(RoomDbModule module,
      Provider<AppDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public WeatherDao get() {
    return providesCurrentWeatherDao(module, databaseProvider.get());
  }

  public static RoomDbModule_ProvidesCurrentWeatherDaoFactory create(RoomDbModule module,
      Provider<AppDatabase> databaseProvider) {
    return new RoomDbModule_ProvidesCurrentWeatherDaoFactory(module, databaseProvider);
  }

  public static WeatherDao providesCurrentWeatherDao(RoomDbModule instance, AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(instance.providesCurrentWeatherDao(database));
  }
}

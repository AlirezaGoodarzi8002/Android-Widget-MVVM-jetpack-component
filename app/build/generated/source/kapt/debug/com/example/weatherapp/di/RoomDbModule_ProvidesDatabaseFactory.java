package com.example.weatherapp.di;

import android.app.Application;
import com.example.weatherapp.data.db.AppDatabase;
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
public final class RoomDbModule_ProvidesDatabaseFactory implements Factory<AppDatabase> {
  private final RoomDbModule module;

  private final Provider<Application> applicationProvider;

  public RoomDbModule_ProvidesDatabaseFactory(RoomDbModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AppDatabase get() {
    return providesDatabase(module, applicationProvider.get());
  }

  public static RoomDbModule_ProvidesDatabaseFactory create(RoomDbModule module,
      Provider<Application> applicationProvider) {
    return new RoomDbModule_ProvidesDatabaseFactory(module, applicationProvider);
  }

  public static AppDatabase providesDatabase(RoomDbModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.providesDatabase(application));
  }
}

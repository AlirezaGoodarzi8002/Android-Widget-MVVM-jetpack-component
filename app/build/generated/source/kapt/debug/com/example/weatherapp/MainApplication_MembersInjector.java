package com.example.weatherapp;

import androidx.hilt.work.HiltWorkerFactory;
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
public final class MainApplication_MembersInjector implements MembersInjector<MainApplication> {
  private final Provider<HiltWorkerFactory> workerFactoryProvider;

  public MainApplication_MembersInjector(Provider<HiltWorkerFactory> workerFactoryProvider) {
    this.workerFactoryProvider = workerFactoryProvider;
  }

  public static MembersInjector<MainApplication> create(
      Provider<HiltWorkerFactory> workerFactoryProvider) {
    return new MainApplication_MembersInjector(workerFactoryProvider);
  }

  @Override
  public void injectMembers(MainApplication instance) {
    injectWorkerFactory(instance, workerFactoryProvider.get());
  }

  @InjectedFieldSignature("com.example.weatherapp.MainApplication.workerFactory")
  public static void injectWorkerFactory(MainApplication instance,
      HiltWorkerFactory workerFactory) {
    instance.workerFactory = workerFactory;
  }
}

package com.example.weatherapp.helper;

import android.content.Context;
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
public final class WorkManagerHelper_Factory implements Factory<WorkManagerHelper> {
  private final Provider<Context> applicationContextProvider;

  public WorkManagerHelper_Factory(Provider<Context> applicationContextProvider) {
    this.applicationContextProvider = applicationContextProvider;
  }

  @Override
  public WorkManagerHelper get() {
    return newInstance(applicationContextProvider.get());
  }

  public static WorkManagerHelper_Factory create(Provider<Context> applicationContextProvider) {
    return new WorkManagerHelper_Factory(applicationContextProvider);
  }

  public static WorkManagerHelper newInstance(Context applicationContext) {
    return new WorkManagerHelper(applicationContext);
  }
}

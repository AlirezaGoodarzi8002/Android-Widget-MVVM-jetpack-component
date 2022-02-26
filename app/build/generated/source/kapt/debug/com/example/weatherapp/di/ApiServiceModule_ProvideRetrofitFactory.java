package com.example.weatherapp.di;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
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
public final class ApiServiceModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<Gson> gsonProvider;

  private final Provider<OkHttpClient> clientProvider;

  public ApiServiceModule_ProvideRetrofitFactory(Provider<Gson> gsonProvider,
      Provider<OkHttpClient> clientProvider) {
    this.gsonProvider = gsonProvider;
    this.clientProvider = clientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(gsonProvider.get(), clientProvider.get());
  }

  public static ApiServiceModule_ProvideRetrofitFactory create(Provider<Gson> gsonProvider,
      Provider<OkHttpClient> clientProvider) {
    return new ApiServiceModule_ProvideRetrofitFactory(gsonProvider, clientProvider);
  }

  public static Retrofit provideRetrofit(Gson gson, OkHttpClient client) {
    return Preconditions.checkNotNullFromProvides(ApiServiceModule.INSTANCE.provideRetrofit(gson, client));
  }
}

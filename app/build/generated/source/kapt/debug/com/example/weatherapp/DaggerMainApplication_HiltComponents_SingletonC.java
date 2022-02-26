package com.example.weatherapp;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.work.HiltWorkerFactory;
import androidx.hilt.work.HiltWrapper_WorkerFactoryModule;
import androidx.hilt.work.WorkerAssistedFactory;
import androidx.hilt.work.WorkerFactoryModule_ProvideFactoryFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.example.weatherapp.data.api.WeatherApi;
import com.example.weatherapp.data.db.AppDatabase;
import com.example.weatherapp.data.db.WeatherDao;
import com.example.weatherapp.data.repository.WeatherRepository;
import com.example.weatherapp.di.ApiServiceModule;
import com.example.weatherapp.di.ApiServiceModule_ProvideGsonFactory;
import com.example.weatherapp.di.ApiServiceModule_ProvideOkHttpClientFactory;
import com.example.weatherapp.di.ApiServiceModule_ProvideRetrofitFactory;
import com.example.weatherapp.di.ApiServiceModule_ProvideWeatherApiFactory;
import com.example.weatherapp.di.RoomDbModule;
import com.example.weatherapp.di.RoomDbModule_ProvidesCurrentWeatherDaoFactory;
import com.example.weatherapp.di.RoomDbModule_ProvidesDatabaseFactory;
import com.example.weatherapp.helper.WorkManagerHelper;
import com.example.weatherapp.ui.view.MainActivity;
import com.example.weatherapp.ui.view.MainActivity_MembersInjector;
import com.example.weatherapp.ui.view.NewAppWidget;
import com.example.weatherapp.ui.view.NewAppWidget_MembersInjector;
import com.example.weatherapp.ui.viewmodel.MainViewModel;
import com.example.weatherapp.ui.viewmodel.MainViewModel_HiltModules_KeyModule_ProvideFactory;
import com.google.gson.Gson;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerMainApplication_HiltComponents_SingletonC extends MainApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final RoomDbModule roomDbModule;

  private final DaggerMainApplication_HiltComponents_SingletonC singletonC = this;

  private Provider<Gson> provideGsonProvider;

  private Provider<OkHttpClient> provideOkHttpClientProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<AppDatabase> providesDatabaseProvider;

  private Provider<WeatherDao> providesCurrentWeatherDaoProvider;

  private Provider<WeatherWorker_AssistedFactory> weatherWorker_AssistedFactoryProvider;

  private Provider<WorkManagerHelper> workManagerHelperProvider;

  private DaggerMainApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam, RoomDbModule roomDbModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.roomDbModule = roomDbModuleParam;
    initialize(applicationContextModuleParam, roomDbModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  private Retrofit retrofit() {
    return ApiServiceModule_ProvideRetrofitFactory.provideRetrofit(provideGsonProvider.get(), provideOkHttpClientProvider.get());
  }

  private WeatherApi weatherApi() {
    return ApiServiceModule_ProvideWeatherApiFactory.provideWeatherApi(provideRetrofitProvider.get());
  }

  private AppDatabase appDatabase() {
    return RoomDbModule_ProvidesDatabaseFactory.providesDatabase(roomDbModule, ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
  }

  private WeatherDao weatherDao() {
    return RoomDbModule_ProvidesCurrentWeatherDaoFactory.providesCurrentWeatherDao(roomDbModule, providesDatabaseProvider.get());
  }

  private WeatherRepository weatherRepository() {
    return new WeatherRepository(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule), weatherApi(), providesCurrentWeatherDaoProvider.get());
  }

  private WeatherWorker weatherWorker(Context context, WorkerParameters workerParams) {
    return new WeatherWorker(context, workerParams, weatherRepository());
  }

  private WeatherWorker_AssistedFactory weatherWorker_AssistedFactory() {
    return new WeatherWorker_AssistedFactory() {
      @Override
      public WeatherWorker create(Context context, WorkerParameters workerParams) {
        return singletonC.weatherWorker(context, workerParams);
      }
    };
  }

  private Map<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>> mapOfStringAndProviderOfWorkerAssistedFactoryOf(
      ) {
    return Collections.<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>>singletonMap("com.example.weatherapp.WeatherWorker", (Provider) weatherWorker_AssistedFactoryProvider);
  }

  private HiltWorkerFactory hiltWorkerFactory() {
    return WorkerFactoryModule_ProvideFactoryFactory.provideFactory(mapOfStringAndProviderOfWorkerAssistedFactoryOf());
  }

  private WorkManagerHelper workManagerHelper() {
    return new WorkManagerHelper(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ApplicationContextModule applicationContextModuleParam,
      final RoomDbModule roomDbModuleParam) {
    this.provideGsonProvider = DoubleCheck.provider(new SwitchingProvider<Gson>(singletonC, 2));
    this.provideOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonC, 3));
    this.provideRetrofitProvider = DoubleCheck.provider(new SwitchingProvider<Retrofit>(singletonC, 1));
    this.providesDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<AppDatabase>(singletonC, 5));
    this.providesCurrentWeatherDaoProvider = DoubleCheck.provider(new SwitchingProvider<WeatherDao>(singletonC, 4));
    this.weatherWorker_AssistedFactoryProvider = new SwitchingProvider<>(singletonC, 0);
    this.workManagerHelperProvider = DoubleCheck.provider(new SwitchingProvider<WorkManagerHelper>(singletonC, 6));
  }

  @Override
  public void injectMainApplication(MainApplication mainApplication) {
    injectMainApplication2(mainApplication);
  }

  @Override
  public void injectNewAppWidget(NewAppWidget newAppWidget) {
    injectNewAppWidget2(newAppWidget);
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  private MainApplication injectMainApplication2(MainApplication instance) {
    MainApplication_MembersInjector.injectWorkerFactory(instance, hiltWorkerFactory());
    return instance;
  }

  private NewAppWidget injectNewAppWidget2(NewAppWidget instance) {
    NewAppWidget_MembersInjector.injectWeatherRepository(instance, weatherRepository());
    NewAppWidget_MembersInjector.injectWorkManagerHelper(instance, workManagerHelperProvider.get());
    return instance;
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private RoomDbModule roomDbModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder apiServiceModule(ApiServiceModule apiServiceModule) {
      Preconditions.checkNotNull(apiServiceModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_WorkerFactoryModule(
        HiltWrapper_WorkerFactoryModule hiltWrapper_WorkerFactoryModule) {
      Preconditions.checkNotNull(hiltWrapper_WorkerFactoryModule);
      return this;
    }

    public Builder roomDbModule(RoomDbModule roomDbModule) {
      this.roomDbModule = Preconditions.checkNotNull(roomDbModule);
      return this;
    }

    public MainApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (roomDbModule == null) {
        this.roomDbModule = new RoomDbModule();
      }
      return new DaggerMainApplication_HiltComponents_SingletonC(applicationContextModule, roomDbModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements MainApplication_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(DaggerMainApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public MainApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityCBuilder implements MainApplication_HiltComponents.ActivityC.Builder {
    private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(DaggerMainApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements MainApplication_HiltComponents.FragmentC.Builder {
    private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(DaggerMainApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements MainApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(DaggerMainApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements MainApplication_HiltComponents.ViewC.Builder {
    private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(DaggerMainApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonC, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements MainApplication_HiltComponents.ViewModelC.Builder {
    private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(DaggerMainApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements MainApplication_HiltComponents.ServiceC.Builder {
    private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerMainApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends MainApplication_HiltComponents.ViewWithFragmentC {
    private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(DaggerMainApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends MainApplication_HiltComponents.FragmentC {
    private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(DaggerMainApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends MainApplication_HiltComponents.ViewC {
    private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(DaggerMainApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends MainApplication_HiltComponents.ActivityC {
    private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(DaggerMainApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
      injectMainActivity2(mainActivity);
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return Collections.<String>singleton(MainViewModel_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    private MainActivity injectMainActivity2(MainActivity instance) {
      MainActivity_MembersInjector.injectWorkManagerHelper(instance, singletonC.workManagerHelperProvider.get());
      MainActivity_MembersInjector.injectWeatherRepository(instance, singletonC.weatherRepository());
      return instance;
    }
  }

  private static final class ViewModelCImpl extends MainApplication_HiltComponents.ViewModelC {
    private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<MainViewModel> mainViewModelProvider;

    private ViewModelCImpl(DaggerMainApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam);

    }

    private MainViewModel mainViewModel() {
      return new MainViewModel(singletonC.weatherRepository(), ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule));
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.mainViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return Collections.<String, Provider<ViewModel>>singletonMap("com.example.weatherapp.ui.viewmodel.MainViewModel", (Provider) mainViewModelProvider);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(DaggerMainApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.example.weatherapp.ui.viewmodel.MainViewModel 
          return (T) viewModelCImpl.mainViewModel();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends MainApplication_HiltComponents.ActivityRetainedC {
    private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(DaggerMainApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonC, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(DaggerMainApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends MainApplication_HiltComponents.ServiceC {
    private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerMainApplication_HiltComponents_SingletonC singletonC,
        Service serviceParam) {
      this.singletonC = singletonC;


    }
  }

  private static final class SwitchingProvider<T> implements Provider<T> {
    private final DaggerMainApplication_HiltComponents_SingletonC singletonC;

    private final int id;

    SwitchingProvider(DaggerMainApplication_HiltComponents_SingletonC singletonC, int id) {
      this.singletonC = singletonC;
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.example.weatherapp.WeatherWorker_AssistedFactory 
        return (T) singletonC.weatherWorker_AssistedFactory();

        case 1: // retrofit2.Retrofit 
        return (T) singletonC.retrofit();

        case 2: // com.google.gson.Gson 
        return (T) ApiServiceModule_ProvideGsonFactory.provideGson();

        case 3: // okhttp3.OkHttpClient 
        return (T) ApiServiceModule_ProvideOkHttpClientFactory.provideOkHttpClient();

        case 4: // com.example.weatherapp.data.db.WeatherDao 
        return (T) singletonC.weatherDao();

        case 5: // com.example.weatherapp.data.db.AppDatabase 
        return (T) singletonC.appDatabase();

        case 6: // com.example.weatherapp.helper.WorkManagerHelper 
        return (T) singletonC.workManagerHelper();

        default: throw new AssertionError(id);
      }
    }
  }
}

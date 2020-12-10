package com.example.protelcase;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.data.di.NetworkModule;
import com.example.data.di.NetworkModule_ProvideOkHttpClientFactory;
import com.example.data.di.NetworkModule_ProvideRetrofitFactory;
import com.example.data.di.ServiceModule;
import com.example.data.di.ServiceModule_ProvideNewsServiceFactory;
import com.example.data.mappers.NewsMapper;
import com.example.data.remote.NewsService;
import com.example.data.repo.NewsRemoteRepoImpl;
import com.example.domain.repositories.NewsRepository;
import com.example.domain.usecases.GetNewsUseCase;
import com.example.protelcase.di.ViewModelFactory;
import com.example.protelcase.ui.home.HomeActivity;
import com.example.protelcase.ui.home.HomeFragment;
import com.example.protelcase.ui.home.HomeFragment_MembersInjector;
import com.example.protelcase.ui.home.HomeViewModel;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerProtelCaseApplication_HiltComponents_ApplicationC extends ProtelCaseApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private final NetworkModule networkModule;

  private final ServiceModule serviceModule;

  private volatile Object okHttpClient = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object newsService = new MemoizedSentinel();

  private volatile Object newsRepository = new MemoizedSentinel();

  private volatile Object homeViewModel = new MemoizedSentinel();

  private volatile Provider<HomeViewModel> homeViewModelProvider;

  private volatile Object viewModelFactory = new MemoizedSentinel();

  private DaggerProtelCaseApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam, NetworkModule networkModuleParam,
      ServiceModule serviceModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.networkModule = networkModuleParam;
    this.serviceModule = serviceModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private OkHttpClient getOkHttpClient() {
    Object local = okHttpClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = okHttpClient;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideOkHttpClientFactory.provideOkHttpClient(networkModule);
          okHttpClient = DoubleCheck.reentrantCheck(okHttpClient, local);
        }
      }
    }
    return (OkHttpClient) local;
  }

  private Retrofit getRetrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideRetrofitFactory.provideRetrofit(networkModule, getOkHttpClient());
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private NewsService getNewsService() {
    Object local = newsService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = newsService;
        if (local instanceof MemoizedSentinel) {
          local = ServiceModule_ProvideNewsServiceFactory.provideNewsService(serviceModule, getRetrofit());
          newsService = DoubleCheck.reentrantCheck(newsService, local);
        }
      }
    }
    return (NewsService) local;
  }

  private NewsRemoteRepoImpl getNewsRemoteRepoImpl() {
    return new NewsRemoteRepoImpl(getNewsService(), new NewsMapper());}

  private NewsRepository getNewsRepository() {
    Object local = newsRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = newsRepository;
        if (local instanceof MemoizedSentinel) {
          local = getNewsRemoteRepoImpl();
          newsRepository = DoubleCheck.reentrantCheck(newsRepository, local);
        }
      }
    }
    return (NewsRepository) local;
  }

  private GetNewsUseCase getGetNewsUseCase() {
    return new GetNewsUseCase(getNewsRepository());}

  private HomeViewModel getHomeViewModel() {
    Object local = homeViewModel;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = homeViewModel;
        if (local instanceof MemoizedSentinel) {
          local = new HomeViewModel(getGetNewsUseCase());
          homeViewModel = DoubleCheck.reentrantCheck(homeViewModel, local);
        }
      }
    }
    return (HomeViewModel) local;
  }

  private Provider<HomeViewModel> getHomeViewModelProvider() {
    Object local = homeViewModelProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      homeViewModelProvider = (Provider<HomeViewModel>) local;
    }
    return (Provider<HomeViewModel>) local;
  }

  private Map<Class<? extends ViewModel>, Provider<ViewModel>> getMapOfClassOfAndProviderOfViewModel(
      ) {
    return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(HomeViewModel.class, (Provider) getHomeViewModelProvider());}

  private ViewModelFactory getViewModelFactory() {
    Object local = viewModelFactory;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = viewModelFactory;
        if (local instanceof MemoizedSentinel) {
          local = new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());
          viewModelFactory = DoubleCheck.reentrantCheck(viewModelFactory, local);
        }
      }
    }
    return (ViewModelFactory) local;
  }

  @Override
  public void injectProtelCaseApplication(ProtelCaseApplication protelCaseApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();}

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();}

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private NetworkModule networkModule;

    private ServiceModule serviceModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public Builder serviceModule(ServiceModule serviceModule) {
      this.serviceModule = Preconditions.checkNotNull(serviceModule);
      return this;
    }

    public ProtelCaseApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      if (serviceModule == null) {
        this.serviceModule = new ServiceModule();
      }
      return new DaggerProtelCaseApplication_HiltComponents_ApplicationC(applicationContextModule, networkModule, serviceModule);
    }
  }

  private final class ActivityRetainedCBuilder implements ProtelCaseApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public ProtelCaseApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends ProtelCaseApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();}

    private final class ActivityCBuilder implements ProtelCaseApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public ProtelCaseApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends ProtelCaseApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerProtelCaseApplication_HiltComponents_ApplicationC.this.applicationContextModule), Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>emptyMap());}

      @Override
      public void injectHomeActivity(HomeActivity homeActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());}

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();}

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();}

      private final class FragmentCBuilder implements ProtelCaseApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public ProtelCaseApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends ProtelCaseApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerProtelCaseApplication_HiltComponents_ApplicationC.this.applicationContextModule), Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>emptyMap());}

        @Override
        public void injectHomeFragment(HomeFragment homeFragment) {
          injectHomeFragment2(homeFragment);}

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());}

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();}

        private HomeFragment injectHomeFragment2(HomeFragment instance) {
          HomeFragment_MembersInjector.injectViewModelFactory(instance, DaggerProtelCaseApplication_HiltComponents_ApplicationC.this.getViewModelFactory());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements ProtelCaseApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public ProtelCaseApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends ProtelCaseApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements ProtelCaseApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public ProtelCaseApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends ProtelCaseApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }
    }
  }

  private final class ServiceCBuilder implements ProtelCaseApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public ProtelCaseApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends ProtelCaseApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.example.protelcase.ui.home.HomeViewModel 
        return (T) DaggerProtelCaseApplication_HiltComponents_ApplicationC.this.getHomeViewModel();

        default: throw new AssertionError(id);
      }
    }
  }
}

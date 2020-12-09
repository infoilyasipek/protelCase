package com.example.protelcase.ui.home;

import com.example.protelcase.di.ViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public HomeFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<HomeFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new HomeFragment_MembersInjector(viewModelFactoryProvider);}

  @Override
  public void injectMembers(HomeFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.example.protelcase.ui.home.HomeFragment.viewModelFactory")
  public static void injectViewModelFactory(HomeFragment instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}

package com.example.protelcase.ui.home;

import com.example.domain.usecases.GetNewsUseCase;
import dagger.internal.Factory;
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<GetNewsUseCase> getNewsUseCaseProvider;

  public HomeViewModel_Factory(Provider<GetNewsUseCase> getNewsUseCaseProvider) {
    this.getNewsUseCaseProvider = getNewsUseCaseProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(getNewsUseCaseProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<GetNewsUseCase> getNewsUseCaseProvider) {
    return new HomeViewModel_Factory(getNewsUseCaseProvider);
  }

  public static HomeViewModel newInstance(GetNewsUseCase getNewsUseCase) {
    return new HomeViewModel(getNewsUseCase);
  }
}

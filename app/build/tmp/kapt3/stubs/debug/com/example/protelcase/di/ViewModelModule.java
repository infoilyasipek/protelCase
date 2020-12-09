package com.example.protelcase.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/protelcase/di/ViewModelModule;", "", "()V", "bindMainViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/example/protelcase/ui/home/HomeViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/example/protelcase/di/ViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.protelcase.di.ViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.example.protelcase.ui.home.HomeViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindMainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.protelcase.ui.home.HomeViewModel viewModel);
    
    public ViewModelModule() {
        super();
    }
}
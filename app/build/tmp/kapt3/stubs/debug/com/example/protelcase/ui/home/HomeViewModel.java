package com.example.protelcase.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00100\u000fH\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\f\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lcom/example/protelcase/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "getNewsUseCase", "Lcom/example/domain/usecases/GetNewsUseCase;", "(Lcom/example/domain/usecases/GetNewsUseCase;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "dateFilter", "Landroidx/lifecycle/MutableLiveData;", "", "getDateFilter", "()Landroidx/lifecycle/MutableLiveData;", "setDateFilter", "(Landroidx/lifecycle/MutableLiveData;)V", "newsList", "Landroidx/lifecycle/LiveData;", "Lcom/example/domain/models/Resource;", "", "Lcom/example/domain/models/News;", "getNewsList", "()Landroidx/lifecycle/LiveData;", "loadNewsList", "onCleared", "", "refresh", "app_debug"})
@javax.inject.Singleton()
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> dateFilter;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.domain.models.Resource<java.util.List<com.example.domain.models.News>>> newsList = null;
    private final com.example.domain.usecases.GetNewsUseCase getNewsUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDateFilter() {
        return null;
    }
    
    public final void setDateFilter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.domain.models.Resource<java.util.List<com.example.domain.models.News>>> getNewsList() {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<com.example.domain.models.Resource<java.util.List<com.example.domain.models.News>>> loadNewsList() {
        return null;
    }
    
    public final void setDateFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String dateFilter) {
    }
    
    public final void refresh() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.domain.usecases.GetNewsUseCase getNewsUseCase) {
        super();
    }
}
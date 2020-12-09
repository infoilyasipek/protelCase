package com.example.protelcase.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/protelcase/ui/home/NewsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/domain/models/News;", "Lcom/example/protelcase/ui/home/NewsAdapter$WeatherViewHolder;", "listener", "Lcom/example/protelcase/interfaces/OnItemClickedListener;", "(Lcom/example/protelcase/interfaces/OnItemClickedListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "NewsDiffCallBack", "WeatherViewHolder", "app_debug"})
public final class NewsAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.domain.models.News, com.example.protelcase.ui.home.NewsAdapter.WeatherViewHolder> {
    private final com.example.protelcase.interfaces.OnItemClickedListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.protelcase.ui.home.NewsAdapter.WeatherViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.protelcase.ui.home.NewsAdapter.WeatherViewHolder holder, int position) {
    }
    
    public NewsAdapter(@org.jetbrains.annotations.NotNull()
    com.example.protelcase.interfaces.OnItemClickedListener listener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/protelcase/ui/home/NewsAdapter$WeatherViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/protelcase/databinding/ItemNewsBinding;", "(Lcom/example/protelcase/ui/home/NewsAdapter;Lcom/example/protelcase/databinding/ItemNewsBinding;)V", "bind", "", "news", "Lcom/example/domain/models/News;", "app_debug"})
    public final class WeatherViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.protelcase.databinding.ItemNewsBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.domain.models.News news) {
        }
        
        public WeatherViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.protelcase.databinding.ItemNewsBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/protelcase/ui/home/NewsAdapter$NewsDiffCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/domain/models/News;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class NewsDiffCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.domain.models.News> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.domain.models.News oldItem, @org.jetbrains.annotations.NotNull()
        com.example.domain.models.News newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.domain.models.News oldItem, @org.jetbrains.annotations.NotNull()
        com.example.domain.models.News newItem) {
            return false;
        }
        
        public NewsDiffCallBack() {
            super();
        }
    }
}
package com.example.protelcase.util;

import java.lang.System;

/**
 * Global executor pools for the whole application.
 *
 * Grouping tasks like this avoids the effects of task starvation (e.g. disk reads don't wait behind
 * webservice requests).
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/protelcase/util/AppExecutors;", "", "()V", "diskIO", "Ljava/util/concurrent/Executor;", "mainThread", "networkIO", "MainThreadExecutor", "app_debug"})
public final class AppExecutors {
    private static final java.util.concurrent.Executor diskIO = null;
    private static final java.util.concurrent.Executor networkIO = null;
    private static final java.util.concurrent.Executor mainThread = null;
    public static final com.example.protelcase.util.AppExecutors INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.Executor diskIO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.Executor networkIO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.Executor mainThread() {
        return null;
    }
    
    private AppExecutors() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/protelcase/util/AppExecutors$MainThreadExecutor;", "Ljava/util/concurrent/Executor;", "()V", "mainThreadHandler", "Landroid/os/Handler;", "execute", "", "command", "Ljava/lang/Runnable;", "app_debug"})
    static final class MainThreadExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mainThreadHandler = null;
        
        @java.lang.Override()
        public void execute(@org.jetbrains.annotations.NotNull()
        java.lang.Runnable command) {
        }
        
        public MainThreadExecutor() {
            super();
        }
    }
}
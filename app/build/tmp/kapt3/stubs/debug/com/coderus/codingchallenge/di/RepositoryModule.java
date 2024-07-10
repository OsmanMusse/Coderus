package com.coderus.codingchallenge.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/coderus/codingchallenge/di/RepositoryModule;", "", "()V", "provideRepository", "Lcom/coderus/codingchallenge/domain/repository/LauncherRepository;", "database", "Lcom/coderus/codingchallenge/data/local/AppDatabase;", "api", "Lcom/coderus/codingchallenge/data/remote/APIService;", "providesIoDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "app_debug"})
@dagger.Module
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull
    public static final com.coderus.codingchallenge.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.coderus.codingchallenge.domain.repository.LauncherRepository provideRepository(@org.jetbrains.annotations.NotNull
    com.coderus.codingchallenge.data.local.AppDatabase database, @org.jetbrains.annotations.NotNull
    com.coderus.codingchallenge.data.remote.APIService api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final kotlinx.coroutines.CoroutineDispatcher providesIoDispatcher() {
        return null;
    }
}
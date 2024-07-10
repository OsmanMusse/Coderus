package com.coderus.codingchallenge.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/coderus/codingchallenge/domain/repository/LauncherRepository_Impl;", "Lcom/coderus/codingchallenge/domain/repository/LauncherRepository;", "db", "Lcom/coderus/codingchallenge/data/local/AppDatabase;", "apiService", "Lcom/coderus/codingchallenge/data/remote/APIService;", "(Lcom/coderus/codingchallenge/data/local/AppDatabase;Lcom/coderus/codingchallenge/data/remote/APIService;)V", "dao", "Lcom/coderus/codingchallenge/data/local/LaunchDao;", "getRocketList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/coderus/codingchallenge/util/Resource;", "", "Lcom/coderus/codingchallenge/data/local/RocketLaunch;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LauncherRepository_Impl implements com.coderus.codingchallenge.domain.repository.LauncherRepository {
    private final com.coderus.codingchallenge.data.local.AppDatabase db = null;
    private final com.coderus.codingchallenge.data.remote.APIService apiService = null;
    private final com.coderus.codingchallenge.data.local.LaunchDao dao = null;
    
    @javax.inject.Inject
    public LauncherRepository_Impl(@org.jetbrains.annotations.NotNull
    com.coderus.codingchallenge.data.local.AppDatabase db, @org.jetbrains.annotations.NotNull
    com.coderus.codingchallenge.data.remote.APIService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getRocketList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.coderus.codingchallenge.util.Resource<java.util.List<com.coderus.codingchallenge.data.local.RocketLaunch>>>> continuation) {
        return null;
    }
}
package com.coderus.codingchallenge.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u00f8\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001\u00a8\u0006\b\u00c0\u0006\u0001"}, d2 = {"Lcom/coderus/codingchallenge/domain/repository/LauncherRepository;", "", "getRocketList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/coderus/codingchallenge/util/Resource;", "", "Lcom/coderus/codingchallenge/data/local/RocketLaunch;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface LauncherRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRocketList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.coderus.codingchallenge.util.Resource<java.util.List<com.coderus.codingchallenge.data.local.RocketLaunch>>>> continuation);
}
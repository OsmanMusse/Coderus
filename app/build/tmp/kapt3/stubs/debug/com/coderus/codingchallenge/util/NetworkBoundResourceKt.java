package com.coderus.codingchallenge.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u009e\u0001\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00042\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u00062\u001e\b\u0004\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2$\b\u0004\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\f2\u0014\b\u0006\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u000f0\bH\u0086\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"networkBoundResource", "Lkotlinx/coroutines/flow/Flow;", "Lcom/coderus/codingchallenge/util/Resource;", "ResultType", "RequestType", "query", "Lkotlin/Function0;", "fetch", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "saveFetchResult", "Lkotlin/Function2;", "", "shouldFetch", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "app_debug"})
public final class NetworkBoundResourceKt {
    
    @org.jetbrains.annotations.NotNull
    public static final <ResultType extends java.lang.Object, RequestType extends java.lang.Object>kotlinx.coroutines.flow.Flow<com.coderus.codingchallenge.util.Resource<ResultType>> networkBoundResource(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.flow.Flow<? extends ResultType>> query, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super RequestType>, ? extends java.lang.Object> fetch, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super RequestType, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> saveFetchResult, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super ResultType, java.lang.Boolean> shouldFetch) {
        return null;
    }
}
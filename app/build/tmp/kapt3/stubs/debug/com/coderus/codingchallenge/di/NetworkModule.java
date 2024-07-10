package com.coderus.codingchallenge.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0007J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\bH\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/coderus/codingchallenge/di/NetworkModule;", "", "()V", "providesApiService", "Lcom/coderus/codingchallenge/data/remote/APIService;", "retrofit", "Lretrofit2/Retrofit;", "providesConverterFactory", "Lretrofit2/Converter$Factory;", "providesHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "providesOKHttpClient", "Lokhttp3/OkHttpClient;", "httpLoggingInterceptor", "providesRetrofit", "okHttpClient", "converter", "app_debug"})
@dagger.Module
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull
    public static final com.coderus.codingchallenge.di.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final okhttp3.logging.HttpLoggingInterceptor providesHttpLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final okhttp3.OkHttpClient providesOKHttpClient(@org.jetbrains.annotations.NotNull
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final retrofit2.Converter.Factory providesConverterFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final retrofit2.Retrofit providesRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull
    retrofit2.Converter.Factory converter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.coderus.codingchallenge.data.remote.APIService providesApiService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}
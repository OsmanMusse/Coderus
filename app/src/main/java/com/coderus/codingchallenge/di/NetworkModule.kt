package com.coderus.codingchallenge.di

import com.coderus.codingchallenge.data.remote.APIService
import com.coderus.codingchallenge.util.Constant
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.Executors
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)

object NetworkModule {


    @Singleton
    @Provides
    fun providesHttpLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @Singleton
    @Provides
    fun providesOKHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }

    @Singleton
    @Provides

    fun providesConverterFactory(): Converter.Factory{
        return MoshiConverterFactory.create(Moshi.Builder().add(KotlinJsonAdapterFactory()).build())
    }

    @Singleton
    @Provides
    fun providesRetrofit(
        okHttpClient: OkHttpClient,
        converter: Converter.Factory
    ):Retrofit{

        return Retrofit.Builder()
            .baseUrl(Constant.BASE_URL)
            .client(okHttpClient)
            .callbackExecutor(Executors.newSingleThreadExecutor())
            .addConverterFactory(converter)
            .build()
    }

    @Singleton
    @Provides
    fun providesApiService(
        retrofit: Retrofit
    ) : APIService {
        return retrofit.create(APIService::class.java)
    }



}
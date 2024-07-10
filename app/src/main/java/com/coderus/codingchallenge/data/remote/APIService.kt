package com.coderus.codingchallenge.data.remote

import com.coderus.codingchallenge.data.local.RocketLaunch
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import java.util.concurrent.Executors

/**
 * Retrofit API to retrieve data from the SpaceX API.
 */
interface APIService {

    /**
     * Retrieve list of rocket launches from the SpaceX API.
     */
    @GET("launches")
    suspend fun getRocketLaunchList(): List<RocketLaunch>
}

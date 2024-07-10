package com.coderus.codingchallenge.di

import com.coderus.codingchallenge.data.local.AppDatabase
import com.coderus.codingchallenge.data.remote.APIService
import com.coderus.codingchallenge.domain.repository.LauncherRepository
import com.coderus.codingchallenge.domain.repository.LauncherRepository_Impl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object RepositoryModule {
    @Provides
    @Singleton
    fun provideRepository(database:AppDatabase,api:APIService): LauncherRepository {
        return LauncherRepository_Impl(database,api)
    }

    @Provides
    fun providesIoDispatcher(): CoroutineDispatcher = Dispatchers.IO

}
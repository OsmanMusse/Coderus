package com.coderus.codingchallenge.di

import android.app.Application
import androidx.room.Room
import com.coderus.codingchallenge.data.local.AppDatabase
import com.coderus.codingchallenge.data.local.LaunchDao
import com.coderus.codingchallenge.util.Constant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {


    @Singleton
    @Provides
    fun provideDatabase(app: Application) =
        Room.databaseBuilder(app, AppDatabase::class.java, Constant.DATABASE_NAME)
            .addMigrations()
            .build()


    @Singleton
    @Provides
    fun provideLauncherDao(database: AppDatabase): LaunchDao {
        return database.dao()

    }
}
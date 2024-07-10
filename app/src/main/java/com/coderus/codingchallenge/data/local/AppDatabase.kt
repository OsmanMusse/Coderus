package com.coderus.codingchallenge.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.coderus.codingchallenge.util.Constant


/**
 * Room database for setup for application.
 */
@Database(entities = [RocketLaunch::class], version = 2, exportSchema = true)
abstract class AppDatabase : RoomDatabase() {
    /**
     * Dao for operating on the Room database.
     */
    abstract fun dao(): LaunchDao

    companion object {

        @Volatile
        private var instance: AppDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also { instance = it }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                Constant.DATABASE_NAME
            ).build()
    }
    }
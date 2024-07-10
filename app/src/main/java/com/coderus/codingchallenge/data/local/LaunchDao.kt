package com.coderus.codingchallenge.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.coderus.codingchallenge.data.local.RocketLaunch
import kotlinx.coroutines.flow.Flow

/**
 * Dao for operating on the Room database.
 */
@Dao
interface LaunchDao {
    /**
     * Retrieve stored [RocketLaunch]s.
     */
    @Query("SELECT * FROM rocket_launch")
    fun getAllLaunches(): Flow<List<RocketLaunch>>
    /**
     * Store new [RocketLaunch] List.
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(launches: List<RocketLaunch>)

    @Query("DELETE FROM rocket_launch")
    fun deleteAll()
}

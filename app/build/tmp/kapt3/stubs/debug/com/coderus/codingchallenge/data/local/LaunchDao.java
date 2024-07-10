package com.coderus.codingchallenge.data.local;

import java.lang.System;

/**
 * Dao for operating on the Room database.
 */
@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\n\u00c0\u0006\u0001"}, d2 = {"Lcom/coderus/codingchallenge/data/local/LaunchDao;", "", "deleteAll", "", "getAllLaunches", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/coderus/codingchallenge/data/local/RocketLaunch;", "insertAll", "launches", "app_debug"})
public abstract interface LaunchDao {
    
    /**
     * Retrieve stored [RocketLaunch]s.
     */
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM rocket_launch")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.coderus.codingchallenge.data.local.RocketLaunch>> getAllLaunches();
    
    /**
     * Store new [RocketLaunch] List.
     */
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.coderus.codingchallenge.data.local.RocketLaunch> launches);
    
    @androidx.room.Query(value = "DELETE FROM rocket_launch")
    public abstract void deleteAll();
}
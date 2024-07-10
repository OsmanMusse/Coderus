package com.coderus.codingchallenge.data.local;

import java.lang.System;

/**
 * Room database for setup for application.
 */
@androidx.room.Database(entities = {com.coderus.codingchallenge.data.local.RocketLaunch.class}, version = 2, exportSchema = true)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/coderus/codingchallenge/data/local/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "dao", "Lcom/coderus/codingchallenge/data/local/LaunchDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.coderus.codingchallenge.data.local.AppDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.coderus.codingchallenge.data.local.AppDatabase instance;
    private static final java.lang.Object LOCK = null;
    
    public AppDatabase() {
        super();
    }
    
    /**
     * Dao for operating on the Room database.
     */
    @org.jetbrains.annotations.NotNull
    public abstract com.coderus.codingchallenge.data.local.LaunchDao dao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/coderus/codingchallenge/data/local/AppDatabase$Companion;", "", "()V", "LOCK", "instance", "Lcom/coderus/codingchallenge/data/local/AppDatabase;", "createDatabase", "context", "Landroid/content/Context;", "invoke", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.coderus.codingchallenge.data.local.AppDatabase invoke(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        private final com.coderus.codingchallenge.data.local.AppDatabase createDatabase(android.content.Context context) {
            return null;
        }
    }
}
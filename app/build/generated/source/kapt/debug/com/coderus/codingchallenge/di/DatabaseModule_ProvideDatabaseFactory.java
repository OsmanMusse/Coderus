// Generated by Dagger (https://dagger.dev).
package com.coderus.codingchallenge.di;

import android.app.Application;
import com.coderus.codingchallenge.data.local.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<Application> appProvider;

  public DatabaseModule_ProvideDatabaseFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public AppDatabase get() {
    return provideDatabase(appProvider.get());
  }

  public static DatabaseModule_ProvideDatabaseFactory create(Provider<Application> appProvider) {
    return new DatabaseModule_ProvideDatabaseFactory(appProvider);
  }

  public static AppDatabase provideDatabase(Application app) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideDatabase(app));
  }
}

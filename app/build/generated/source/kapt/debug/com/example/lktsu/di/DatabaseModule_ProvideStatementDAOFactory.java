// Generated by Dagger (https://dagger.dev).
package com.example.lktsu.di;

import com.example.lktsu.data.room.AppDatabase;
import com.example.lktsu.data.room.StatementDAO;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideStatementDAOFactory implements Factory<StatementDAO> {
  private final DatabaseModule module;

  private final Provider<AppDatabase> databaseProvider;

  public DatabaseModule_ProvideStatementDAOFactory(DatabaseModule module,
      Provider<AppDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public StatementDAO get() {
    return provideStatementDAO(module, databaseProvider.get());
  }

  public static DatabaseModule_ProvideStatementDAOFactory create(DatabaseModule module,
      Provider<AppDatabase> databaseProvider) {
    return new DatabaseModule_ProvideStatementDAOFactory(module, databaseProvider);
  }

  public static StatementDAO provideStatementDAO(DatabaseModule instance, AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(instance.provideStatementDAO(database));
  }
}

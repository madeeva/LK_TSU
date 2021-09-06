package com.example.lktsu.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0004H\u0007J0\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\bH\u0007J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/example/lktsu/di/DatabaseModule;", "", "()V", "provideDatabase", "Lcom/example/lktsu/data/room/AppDatabase;", "context", "Landroid/content/Context;", "provideHistoryDAO", "Lcom/example/lktsu/data/room/HistoryDAO;", "database", "provideMarksDAO", "Lcom/example/lktsu/data/room/MarksDAO;", "provideNewsDAO", "Lcom/example/lktsu/data/room/NewsDAO;", "provideRoomRepositoryImpl", "Lcom/example/lktsu/repositories/RoomRepositoryImpl;", "studentDAO", "Lcom/example/lktsu/data/room/StudentDAO;", "newsDAO", "statementDAO", "Lcom/example/lktsu/data/room/StatementDAO;", "marksDAO", "historyDAO", "provideStatementDAO", "provideStudentDAO", "app_debug"})
@dagger.Module()
public final class DatabaseModule {
    
    public DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.lktsu.data.room.AppDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.lktsu.data.room.StudentDAO provideStudentDAO(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.room.AppDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.lktsu.data.room.NewsDAO provideNewsDAO(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.room.AppDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.lktsu.data.room.StatementDAO provideStatementDAO(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.room.AppDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.lktsu.data.room.MarksDAO provideMarksDAO(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.room.AppDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.lktsu.data.room.HistoryDAO provideHistoryDAO(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.room.AppDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.lktsu.repositories.RoomRepositoryImpl provideRoomRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.room.StudentDAO studentDAO, @org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.room.NewsDAO newsDAO, @org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.room.StatementDAO statementDAO, @org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.room.MarksDAO marksDAO, @org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.room.HistoryDAO historyDAO) {
        return null;
    }
}
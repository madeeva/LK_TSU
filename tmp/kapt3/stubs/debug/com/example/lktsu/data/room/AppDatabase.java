package com.example.lktsu.data.room;

import java.lang.System;

@androidx.room.Database(entities = {com.example.lktsu.data.model.StudentEntity.class, com.example.lktsu.data.model.NewsEntity.class, com.example.lktsu.data.model.StatementEntity.class, com.example.lktsu.data.model.MarksEntity.class, com.example.lktsu.data.model.HistoryEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/example/lktsu/data/room/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "historyDAO", "Lcom/example/lktsu/data/room/HistoryDAO;", "marksDAO", "Lcom/example/lktsu/data/room/MarksDAO;", "newsDAO", "Lcom/example/lktsu/data/room/NewsDAO;", "statementDAO", "Lcom/example/lktsu/data/room/StatementDAO;", "studentDAO", "Lcom/example/lktsu/data/room/StudentDAO;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.lktsu.data.room.StudentDAO studentDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.lktsu.data.room.NewsDAO newsDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.lktsu.data.room.StatementDAO statementDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.lktsu.data.room.MarksDAO marksDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.lktsu.data.room.HistoryDAO historyDAO();
}
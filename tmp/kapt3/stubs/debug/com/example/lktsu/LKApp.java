package com.example.lktsu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/example/lktsu/LKApp;", "Landroid/app/Application;", "()V", "roomRepositoryImpl", "Lcom/example/lktsu/repositories/RoomRepositoryImpl;", "getRoomRepositoryImpl", "()Lcom/example/lktsu/repositories/RoomRepositoryImpl;", "setRoomRepositoryImpl", "(Lcom/example/lktsu/repositories/RoomRepositoryImpl;)V", "onCreate", "", "Data", "app_debug"})
@dagger.hilt.android.HiltAndroidApp()
@javax.inject.Singleton()
public final class LKApp extends android.app.Application {
    @javax.inject.Inject()
    public com.example.lktsu.repositories.RoomRepositoryImpl roomRepositoryImpl;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.lktsu.LKApp.Data Data = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.example.lktsu.data.model.StudentEntity> students = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.example.lktsu.data.model.NewsEntity> newsList = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.example.lktsu.data.model.StatementEntity> statementList = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.example.lktsu.data.model.MarksEntity> marksList = null;
    
    public LKApp() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lktsu.repositories.RoomRepositoryImpl getRoomRepositoryImpl() {
        return null;
    }
    
    public final void setRoomRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.repositories.RoomRepositoryImpl p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/lktsu/LKApp$Data;", "", "()V", "marksList", "", "Lcom/example/lktsu/data/model/MarksEntity;", "getMarksList", "()Ljava/util/List;", "newsList", "Lcom/example/lktsu/data/model/NewsEntity;", "getNewsList", "statementList", "Lcom/example/lktsu/data/model/StatementEntity;", "getStatementList", "students", "Lcom/example/lktsu/data/model/StudentEntity;", "getStudents", "app_debug"})
    public static final class Data {
        
        private Data() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.lktsu.data.model.StudentEntity> getStudents() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.lktsu.data.model.NewsEntity> getNewsList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.lktsu.data.model.StatementEntity> getStatementList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.lktsu.data.model.MarksEntity> getMarksList() {
            return null;
        }
    }
}
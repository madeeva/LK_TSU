package com.example.lktsu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0010\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0011\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0012\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0013\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0014\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0015\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/lktsu/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "roomRepositoryImpl", "Lcom/example/lktsu/repositories/RoomRepositoryImpl;", "getRoomRepositoryImpl", "()Lcom/example/lktsu/repositories/RoomRepositoryImpl;", "setRoomRepositoryImpl", "(Lcom/example/lktsu/repositories/RoomRepositoryImpl;)V", "studentEntity", "Lcom/example/lktsu/data/model/StudentEntity;", "onClickAbout", "", "view", "Landroid/view/View;", "onClickExit", "onClickIcon", "onClickInfo", "onClickMarks", "onClickNews", "onClickSchedule", "onClickStatements", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.example.lktsu.repositories.RoomRepositoryImpl roomRepositoryImpl;
    private com.example.lktsu.data.model.StudentEntity studentEntity;
    
    public MainActivity() {
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
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onClickNews(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final void onClickSchedule(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final void onClickMarks(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final void onClickStatements(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final void onClickIcon(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final void onClickExit(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final void onClickAbout(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final void onClickInfo(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
}
package com.example.lktsu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/lktsu/MoreActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "news", "Lcom/example/lktsu/data/model/NewsEntity;", "roomRepositoryImpl", "Lcom/example/lktsu/repositories/RoomRepositoryImpl;", "getRoomRepositoryImpl", "()Lcom/example/lktsu/repositories/RoomRepositoryImpl;", "setRoomRepositoryImpl", "(Lcom/example/lktsu/repositories/RoomRepositoryImpl;)V", "statement", "Lcom/example/lktsu/data/model/StatementEntity;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MoreActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.example.lktsu.repositories.RoomRepositoryImpl roomRepositoryImpl;
    private com.example.lktsu.data.model.NewsEntity news;
    private com.example.lktsu.data.model.StatementEntity statement;
    
    public MoreActivity() {
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
}
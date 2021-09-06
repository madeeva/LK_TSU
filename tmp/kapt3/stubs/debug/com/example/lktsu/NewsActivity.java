package com.example.lktsu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/example/lktsu/NewsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "news", "", "Lcom/example/lktsu/data/model/NewsEntity;", "roomRepositoryImpl", "Lcom/example/lktsu/repositories/RoomRepositoryImpl;", "getRoomRepositoryImpl", "()Lcom/example/lktsu/repositories/RoomRepositoryImpl;", "setRoomRepositoryImpl", "(Lcom/example/lktsu/repositories/RoomRepositoryImpl;)V", "onClickInfo", "", "view", "Landroid/view/View;", "onClickNews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class NewsActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.example.lktsu.repositories.RoomRepositoryImpl roomRepositoryImpl;
    private java.util.List<com.example.lktsu.data.model.NewsEntity> news;
    
    public NewsActivity() {
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
    
    public final void onClickInfo(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
}
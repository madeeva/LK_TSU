package com.example.lktsu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/lktsu/StatementsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "roomRepositoryImpl", "Lcom/example/lktsu/repositories/RoomRepositoryImpl;", "getRoomRepositoryImpl", "()Lcom/example/lktsu/repositories/RoomRepositoryImpl;", "setRoomRepositoryImpl", "(Lcom/example/lktsu/repositories/RoomRepositoryImpl;)V", "statementList", "", "Lcom/example/lktsu/data/model/StatementEntity;", "getStatementList", "()Ljava/util/List;", "setStatementList", "(Ljava/util/List;)V", "onClickInfo", "", "view", "Landroid/view/View;", "onClickStatement", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class StatementsActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.example.lktsu.repositories.RoomRepositoryImpl roomRepositoryImpl;
    public java.util.List<com.example.lktsu.data.model.StatementEntity> statementList;
    
    public StatementsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.lktsu.repositories.RoomRepositoryImpl getRoomRepositoryImpl() {
        return null;
    }
    
    public final void setRoomRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.repositories.RoomRepositoryImpl p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.lktsu.data.model.StatementEntity> getStatementList() {
        return null;
    }
    
    public final void setStatementList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.lktsu.data.model.StatementEntity> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onClickStatement(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final void onClickInfo(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
}
package com.example.lktsu.data.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/lktsu/data/room/NewsDAO;", "", "addNews", "", "newsEntity", "Lcom/example/lktsu/data/model/NewsEntity;", "readNews", "id", "", "readNewsList", "", "app_debug"})
public abstract interface NewsDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM news_table")
    public abstract java.util.List<com.example.lktsu.data.model.NewsEntity> readNewsList();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM news_table WHERE id=:id")
    public abstract com.example.lktsu.data.model.NewsEntity readNews(long id);
    
    @androidx.room.Insert(entity = com.example.lktsu.data.model.NewsEntity.class, onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void addNews(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.model.NewsEntity newsEntity);
}
package com.example.lktsu.data.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/example/lktsu/data/room/HistoryDAO;", "", "addHistory", "", "historyEntity", "Lcom/example/lktsu/data/model/HistoryEntity;", "readHistory", "number", "", "app_debug"})
public abstract interface HistoryDAO {
    
    @androidx.room.Insert(entity = com.example.lktsu.data.model.HistoryEntity.class, onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void addHistory(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.model.HistoryEntity historyEntity);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM history_table WHERE number=:number")
    public abstract com.example.lktsu.data.model.HistoryEntity readHistory(long number);
}
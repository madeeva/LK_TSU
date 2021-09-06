package com.example.lktsu.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010 \u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\u0006\u0010\u001a\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J)\u0010#\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020&H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020!0\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J\u0019\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u0019\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\u0019\u00103\u001a\u00020*2\u0006\u00104\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u0019\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J!\u00109\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010:\u001a\u00020%H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J!\u0010<\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010=\u001a\u00020%H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J!\u0010>\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010?\u001a\u00020%H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J!\u0010@\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010A\u001a\u00020%H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006B"}, d2 = {"Lcom/example/lktsu/repositories/RoomRepositoryImpl;", "Lcom/example/lktsu/data/model/RoomRepository;", "studentDAO", "Lcom/example/lktsu/data/room/StudentDAO;", "newsDAO", "Lcom/example/lktsu/data/room/NewsDAO;", "statementDAO", "Lcom/example/lktsu/data/room/StatementDAO;", "marksDAO", "Lcom/example/lktsu/data/room/MarksDAO;", "historyDAO", "Lcom/example/lktsu/data/room/HistoryDAO;", "(Lcom/example/lktsu/data/room/StudentDAO;Lcom/example/lktsu/data/room/NewsDAO;Lcom/example/lktsu/data/room/StatementDAO;Lcom/example/lktsu/data/room/MarksDAO;Lcom/example/lktsu/data/room/HistoryDAO;)V", "getHistory", "Lcom/example/lktsu/data/model/HistoryEntity;", "number", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNews", "Lcom/example/lktsu/data/model/NewsEntity;", "id", "getNewsList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSemesterMarks", "Lcom/example/lktsu/data/model/MarksEntity;", "studentId", "semester", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatement", "Lcom/example/lktsu/data/model/StatementEntity;", "getStatementList", "getStudent", "Lcom/example/lktsu/data/model/StudentEntity;", "getStudentMarks", "getStudentMarksForSubject", "subject", "", "", "(JLjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStudents", "insertHistory", "", "historyEntity", "(Lcom/example/lktsu/data/model/HistoryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMark", "marksEntity", "(Lcom/example/lktsu/data/model/MarksEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertNews", "newsEntity", "(Lcom/example/lktsu/data/model/NewsEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertStatement", "statementEntity", "(Lcom/example/lktsu/data/model/StatementEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertStudent", "studentEntity", "(Lcom/example/lktsu/data/model/StudentEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateEmail", "email", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePhone1", "phone1", "updatePhone2", "phone2", "updatePhone3", "phone3", "app_debug"})
@javax.inject.Singleton()
public final class RoomRepositoryImpl implements com.example.lktsu.data.model.RoomRepository {
    private final com.example.lktsu.data.room.StudentDAO studentDAO = null;
    private final com.example.lktsu.data.room.NewsDAO newsDAO = null;
    private final com.example.lktsu.data.room.StatementDAO statementDAO = null;
    private final com.example.lktsu.data.room.MarksDAO marksDAO = null;
    private final com.example.lktsu.data.room.HistoryDAO historyDAO = null;
    
    @javax.inject.Inject()
    public RoomRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.room.StudentDAO studentDAO, @org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.room.NewsDAO newsDAO, @org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.room.StatementDAO statementDAO, @org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.room.MarksDAO marksDAO, @org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.room.HistoryDAO historyDAO) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getStudent(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lktsu.data.model.StudentEntity> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getStudents(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.lktsu.data.model.StudentEntity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertStudent(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.model.StudentEntity studentEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updatePhone1(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String phone1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updatePhone2(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String phone2, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updatePhone3(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String phone3, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateEmail(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNewsList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.lktsu.data.model.NewsEntity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNews(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lktsu.data.model.NewsEntity> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertNews(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.model.NewsEntity newsEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getStatementList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.lktsu.data.model.StatementEntity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getStatement(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lktsu.data.model.StatementEntity> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertStatement(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.model.StatementEntity statementEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getStudentMarks(long studentId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.lktsu.data.model.MarksEntity>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertMark(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.model.MarksEntity marksEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSemesterMarks(long studentId, long semester, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.lktsu.data.model.MarksEntity>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getStudentMarksForSubject(long studentId, @org.jetbrains.annotations.NotNull()
    java.lang.String subject, int semester, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lktsu.data.model.MarksEntity> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertHistory(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.model.HistoryEntity historyEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getHistory(long number, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lktsu.data.model.HistoryEntity> p1) {
        return null;
    }
}
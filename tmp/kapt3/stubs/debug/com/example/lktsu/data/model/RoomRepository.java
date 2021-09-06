package com.example.lktsu.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0018\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J)\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u001bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0019\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0019\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u0016H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J!\u0010.\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u001aH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J!\u00101\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u001aH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J!\u00103\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u001aH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J!\u00105\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u001aH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00067"}, d2 = {"Lcom/example/lktsu/data/model/RoomRepository;", "", "getHistory", "Lcom/example/lktsu/data/model/HistoryEntity;", "number", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNews", "Lcom/example/lktsu/data/model/NewsEntity;", "id", "getNewsList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSemesterMarks", "Lcom/example/lktsu/data/model/MarksEntity;", "studentId", "semester", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatement", "Lcom/example/lktsu/data/model/StatementEntity;", "getStatementList", "getStudent", "Lcom/example/lktsu/data/model/StudentEntity;", "getStudentMarks", "getStudentMarksForSubject", "subject", "", "", "(JLjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStudents", "insertHistory", "", "historyEntity", "(Lcom/example/lktsu/data/model/HistoryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMark", "marksEntity", "(Lcom/example/lktsu/data/model/MarksEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertNews", "newsEntity", "(Lcom/example/lktsu/data/model/NewsEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertStatement", "statementEntity", "(Lcom/example/lktsu/data/model/StatementEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertStudent", "studentEntity", "(Lcom/example/lktsu/data/model/StudentEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateEmail", "email", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePhone1", "phone1", "updatePhone2", "phone2", "updatePhone3", "phone3", "app_debug"})
public abstract interface RoomRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStudent(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lktsu.data.model.StudentEntity> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStudents(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.lktsu.data.model.StudentEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertStudent(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.model.StudentEntity studentEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updatePhone1(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String phone1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updatePhone2(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String phone2, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updatePhone3(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String phone3, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateEmail(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNewsList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.lktsu.data.model.NewsEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNews(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lktsu.data.model.NewsEntity> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertNews(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.model.NewsEntity newsEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStatementList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.lktsu.data.model.StatementEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStatement(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lktsu.data.model.StatementEntity> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertStatement(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.model.StatementEntity statementEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStudentMarks(long studentId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.lktsu.data.model.MarksEntity>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertMark(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.model.MarksEntity marksEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSemesterMarks(long studentId, long semester, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.lktsu.data.model.MarksEntity>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStudentMarksForSubject(long studentId, @org.jetbrains.annotations.NotNull()
    java.lang.String subject, int semester, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lktsu.data.model.MarksEntity> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertHistory(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.model.HistoryEntity historyEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHistory(long number, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.lktsu.data.model.HistoryEntity> p1);
}
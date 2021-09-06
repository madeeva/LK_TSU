package com.example.lktsu.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/lktsu/data/Student;", "", "()V", "student", "app_debug"})
public final class Student {
    
    private Student() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/lktsu/data/Student$student;", "Landroid/provider/BaseColumns;", "()V", "COLUMN_EMAIL", "", "COLUMN_FIO", "COLUMN_GROUP", "COLUMN_TEL1", "COLUMN_TEL2", "COLUMN_TEL3", "TABLE_NAME", "id", "getId", "()Ljava/lang/String;", "app_debug"})
    public static final class student implements android.provider.BaseColumns {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.lktsu.data.Student.student INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_NAME = "student";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String id = "_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_FIO = "FIO";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_GROUP = "[group]";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_TEL1 = "tel1";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_TEL2 = "tel2";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_TEL3 = "tel3";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLUMN_EMAIL = "email";
        
        private student() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
    }
}
package com.example.lktsu.data.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\u0007\u001a\u00020\bH\'J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\'\u00a8\u0006\u0010"}, d2 = {"Lcom/example/lktsu/data/room/MarksDAO;", "", "addMark", "", "marksEntity", "Lcom/example/lktsu/data/model/MarksEntity;", "readStudentMarkForSubject", "studentId", "", "subject", "", "semester", "", "readStudentMarks", "", "readStudentMarksForSemester", "app_debug"})
public abstract interface MarksDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM marks_table WHERE student_id=:studentId")
    public abstract java.util.List<com.example.lktsu.data.model.MarksEntity> readStudentMarks(long studentId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM marks_table WHERE student_id=:studentId AND semester=:semester")
    public abstract java.util.List<com.example.lktsu.data.model.MarksEntity> readStudentMarksForSemester(long studentId, long semester);
    
    @androidx.room.Insert(entity = com.example.lktsu.data.model.MarksEntity.class, onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void addMark(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.model.MarksEntity marksEntity);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM marks_table WHERE student_id=:studentId AND subject=:subject AND semester=:semester")
    public abstract com.example.lktsu.data.model.MarksEntity readStudentMarkForSubject(long studentId, @org.jetbrains.annotations.NotNull()
    java.lang.String subject, int semester);
}
package com.example.lktsu.data.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000eH\'J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000eH\'J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000eH\'\u00a8\u0006\u0015"}, d2 = {"Lcom/example/lktsu/data/room/StudentDAO;", "", "addStudent", "", "student", "Lcom/example/lktsu/data/model/StudentEntity;", "readStudent", "id", "", "readStudents", "", "updateEmail", "", "email", "", "updatePhone1", "phone1", "updatePhone2", "phone2", "updatePhone3", "phone3", "app_debug"})
public abstract interface StudentDAO {
    
    @androidx.room.Insert(entity = com.example.lktsu.data.model.StudentEntity.class, onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void addStudent(@org.jetbrains.annotations.NotNull()
    com.example.lktsu.data.model.StudentEntity student);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM student_fio_table WHERE id=:id")
    public abstract com.example.lktsu.data.model.StudentEntity readStudent(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM student_fio_table")
    public abstract java.util.List<com.example.lktsu.data.model.StudentEntity> readStudents();
    
    @androidx.room.Query(value = "UPDATE student_fio_table SET phone1 = :phone1 WHERE id = :id")
    public abstract int updatePhone1(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String phone1);
    
    @androidx.room.Query(value = "UPDATE student_fio_table SET phone2 = :phone2 WHERE id = :id")
    public abstract int updatePhone2(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String phone2);
    
    @androidx.room.Query(value = "UPDATE student_fio_table SET phone3 = :phone3 WHERE id = :id")
    public abstract int updatePhone3(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String phone3);
    
    @androidx.room.Query(value = "UPDATE student_fio_table SET email = :email WHERE id = :id")
    public abstract int updateEmail(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String email);
}
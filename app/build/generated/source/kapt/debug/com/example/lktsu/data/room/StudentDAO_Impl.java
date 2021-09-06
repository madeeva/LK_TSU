package com.example.lktsu.data.room;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.lktsu.data.model.StudentEntity;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class StudentDAO_Impl implements StudentDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<StudentEntity> __insertionAdapterOfStudentEntity;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePhone1;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePhone2;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePhone3;

  private final SharedSQLiteStatement __preparedStmtOfUpdateEmail;

  public StudentDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStudentEntity = new EntityInsertionAdapter<StudentEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `student_fio_table` (`id`,`name`,`group`,`phone1`,`phone2`,`phone3`,`email`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StudentEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getGroup() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGroup());
        }
        if (value.getPhone1() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPhone1());
        }
        if (value.getPhone2() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhone2());
        }
        if (value.getPhone3() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPhone3());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getEmail());
        }
      }
    };
    this.__preparedStmtOfUpdatePhone1 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE student_fio_table SET phone1 = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdatePhone2 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE student_fio_table SET phone2 = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdatePhone3 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE student_fio_table SET phone3 = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateEmail = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE student_fio_table SET email = ? WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public void addStudent(final StudentEntity student) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfStudentEntity.insert(student);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updatePhone1(final long id, final String phone1) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePhone1.acquire();
    int _argIndex = 1;
    if (phone1 == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, phone1);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdatePhone1.release(_stmt);
    }
  }

  @Override
  public int updatePhone2(final long id, final String phone2) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePhone2.acquire();
    int _argIndex = 1;
    if (phone2 == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, phone2);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdatePhone2.release(_stmt);
    }
  }

  @Override
  public int updatePhone3(final long id, final String phone3) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePhone3.acquire();
    int _argIndex = 1;
    if (phone3 == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, phone3);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdatePhone3.release(_stmt);
    }
  }

  @Override
  public int updateEmail(final long id, final String email) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateEmail.acquire();
    int _argIndex = 1;
    if (email == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, email);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateEmail.release(_stmt);
    }
  }

  @Override
  public StudentEntity readStudent(final long id) {
    final String _sql = "SELECT * FROM student_fio_table WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "group");
      final int _cursorIndexOfPhone1 = CursorUtil.getColumnIndexOrThrow(_cursor, "phone1");
      final int _cursorIndexOfPhone2 = CursorUtil.getColumnIndexOrThrow(_cursor, "phone2");
      final int _cursorIndexOfPhone3 = CursorUtil.getColumnIndexOrThrow(_cursor, "phone3");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final StudentEntity _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpGroup;
        if (_cursor.isNull(_cursorIndexOfGroup)) {
          _tmpGroup = null;
        } else {
          _tmpGroup = _cursor.getString(_cursorIndexOfGroup);
        }
        final String _tmpPhone1;
        if (_cursor.isNull(_cursorIndexOfPhone1)) {
          _tmpPhone1 = null;
        } else {
          _tmpPhone1 = _cursor.getString(_cursorIndexOfPhone1);
        }
        final String _tmpPhone2;
        if (_cursor.isNull(_cursorIndexOfPhone2)) {
          _tmpPhone2 = null;
        } else {
          _tmpPhone2 = _cursor.getString(_cursorIndexOfPhone2);
        }
        final String _tmpPhone3;
        if (_cursor.isNull(_cursorIndexOfPhone3)) {
          _tmpPhone3 = null;
        } else {
          _tmpPhone3 = _cursor.getString(_cursorIndexOfPhone3);
        }
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        _result = new StudentEntity(_tmpId,_tmpName,_tmpGroup,_tmpPhone1,_tmpPhone2,_tmpPhone3,_tmpEmail);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<StudentEntity> readStudents() {
    final String _sql = "SELECT * FROM student_fio_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "group");
      final int _cursorIndexOfPhone1 = CursorUtil.getColumnIndexOrThrow(_cursor, "phone1");
      final int _cursorIndexOfPhone2 = CursorUtil.getColumnIndexOrThrow(_cursor, "phone2");
      final int _cursorIndexOfPhone3 = CursorUtil.getColumnIndexOrThrow(_cursor, "phone3");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final List<StudentEntity> _result = new ArrayList<StudentEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final StudentEntity _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpGroup;
        if (_cursor.isNull(_cursorIndexOfGroup)) {
          _tmpGroup = null;
        } else {
          _tmpGroup = _cursor.getString(_cursorIndexOfGroup);
        }
        final String _tmpPhone1;
        if (_cursor.isNull(_cursorIndexOfPhone1)) {
          _tmpPhone1 = null;
        } else {
          _tmpPhone1 = _cursor.getString(_cursorIndexOfPhone1);
        }
        final String _tmpPhone2;
        if (_cursor.isNull(_cursorIndexOfPhone2)) {
          _tmpPhone2 = null;
        } else {
          _tmpPhone2 = _cursor.getString(_cursorIndexOfPhone2);
        }
        final String _tmpPhone3;
        if (_cursor.isNull(_cursorIndexOfPhone3)) {
          _tmpPhone3 = null;
        } else {
          _tmpPhone3 = _cursor.getString(_cursorIndexOfPhone3);
        }
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        _item = new StudentEntity(_tmpId,_tmpName,_tmpGroup,_tmpPhone1,_tmpPhone2,_tmpPhone3,_tmpEmail);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

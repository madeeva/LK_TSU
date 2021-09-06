package com.example.lktsu.data.room;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.lktsu.data.model.MarksEntity;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MarksDAO_Impl implements MarksDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MarksEntity> __insertionAdapterOfMarksEntity;

  public MarksDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMarksEntity = new EntityInsertionAdapter<MarksEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `marks_table` (`id`,`student_id`,`subject`,`mark`,`semester`,`event`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MarksEntity value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getStudent_id());
        if (value.getSubject() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSubject());
        }
        if (value.getMark() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMark());
        }
        stmt.bindLong(5, value.getSemester());
        if (value.getEvent() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getEvent());
        }
      }
    };
  }

  @Override
  public void addMark(final MarksEntity marksEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMarksEntity.insert(marksEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<MarksEntity> readStudentMarks(final long studentId) {
    final String _sql = "SELECT * FROM marks_table WHERE student_id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, studentId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfStudentId = CursorUtil.getColumnIndexOrThrow(_cursor, "student_id");
      final int _cursorIndexOfSubject = CursorUtil.getColumnIndexOrThrow(_cursor, "subject");
      final int _cursorIndexOfMark = CursorUtil.getColumnIndexOrThrow(_cursor, "mark");
      final int _cursorIndexOfSemester = CursorUtil.getColumnIndexOrThrow(_cursor, "semester");
      final int _cursorIndexOfEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "event");
      final List<MarksEntity> _result = new ArrayList<MarksEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final MarksEntity _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpStudent_id;
        _tmpStudent_id = _cursor.getLong(_cursorIndexOfStudentId);
        final String _tmpSubject;
        if (_cursor.isNull(_cursorIndexOfSubject)) {
          _tmpSubject = null;
        } else {
          _tmpSubject = _cursor.getString(_cursorIndexOfSubject);
        }
        final String _tmpMark;
        if (_cursor.isNull(_cursorIndexOfMark)) {
          _tmpMark = null;
        } else {
          _tmpMark = _cursor.getString(_cursorIndexOfMark);
        }
        final long _tmpSemester;
        _tmpSemester = _cursor.getLong(_cursorIndexOfSemester);
        final String _tmpEvent;
        if (_cursor.isNull(_cursorIndexOfEvent)) {
          _tmpEvent = null;
        } else {
          _tmpEvent = _cursor.getString(_cursorIndexOfEvent);
        }
        _item = new MarksEntity(_tmpId,_tmpStudent_id,_tmpSubject,_tmpMark,_tmpSemester,_tmpEvent);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<MarksEntity> readStudentMarksForSemester(final long studentId, final long semester) {
    final String _sql = "SELECT * FROM marks_table WHERE student_id=? AND semester=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, studentId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, semester);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfStudentId = CursorUtil.getColumnIndexOrThrow(_cursor, "student_id");
      final int _cursorIndexOfSubject = CursorUtil.getColumnIndexOrThrow(_cursor, "subject");
      final int _cursorIndexOfMark = CursorUtil.getColumnIndexOrThrow(_cursor, "mark");
      final int _cursorIndexOfSemester = CursorUtil.getColumnIndexOrThrow(_cursor, "semester");
      final int _cursorIndexOfEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "event");
      final List<MarksEntity> _result = new ArrayList<MarksEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final MarksEntity _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpStudent_id;
        _tmpStudent_id = _cursor.getLong(_cursorIndexOfStudentId);
        final String _tmpSubject;
        if (_cursor.isNull(_cursorIndexOfSubject)) {
          _tmpSubject = null;
        } else {
          _tmpSubject = _cursor.getString(_cursorIndexOfSubject);
        }
        final String _tmpMark;
        if (_cursor.isNull(_cursorIndexOfMark)) {
          _tmpMark = null;
        } else {
          _tmpMark = _cursor.getString(_cursorIndexOfMark);
        }
        final long _tmpSemester;
        _tmpSemester = _cursor.getLong(_cursorIndexOfSemester);
        final String _tmpEvent;
        if (_cursor.isNull(_cursorIndexOfEvent)) {
          _tmpEvent = null;
        } else {
          _tmpEvent = _cursor.getString(_cursorIndexOfEvent);
        }
        _item = new MarksEntity(_tmpId,_tmpStudent_id,_tmpSubject,_tmpMark,_tmpSemester,_tmpEvent);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public MarksEntity readStudentMarkForSubject(final long studentId, final String subject,
      final int semester) {
    final String _sql = "SELECT * FROM marks_table WHERE student_id=? AND subject=? AND semester=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, studentId);
    _argIndex = 2;
    if (subject == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, subject);
    }
    _argIndex = 3;
    _statement.bindLong(_argIndex, semester);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfStudentId = CursorUtil.getColumnIndexOrThrow(_cursor, "student_id");
      final int _cursorIndexOfSubject = CursorUtil.getColumnIndexOrThrow(_cursor, "subject");
      final int _cursorIndexOfMark = CursorUtil.getColumnIndexOrThrow(_cursor, "mark");
      final int _cursorIndexOfSemester = CursorUtil.getColumnIndexOrThrow(_cursor, "semester");
      final int _cursorIndexOfEvent = CursorUtil.getColumnIndexOrThrow(_cursor, "event");
      final MarksEntity _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpStudent_id;
        _tmpStudent_id = _cursor.getLong(_cursorIndexOfStudentId);
        final String _tmpSubject;
        if (_cursor.isNull(_cursorIndexOfSubject)) {
          _tmpSubject = null;
        } else {
          _tmpSubject = _cursor.getString(_cursorIndexOfSubject);
        }
        final String _tmpMark;
        if (_cursor.isNull(_cursorIndexOfMark)) {
          _tmpMark = null;
        } else {
          _tmpMark = _cursor.getString(_cursorIndexOfMark);
        }
        final long _tmpSemester;
        _tmpSemester = _cursor.getLong(_cursorIndexOfSemester);
        final String _tmpEvent;
        if (_cursor.isNull(_cursorIndexOfEvent)) {
          _tmpEvent = null;
        } else {
          _tmpEvent = _cursor.getString(_cursorIndexOfEvent);
        }
        _result = new MarksEntity(_tmpId,_tmpStudent_id,_tmpSubject,_tmpMark,_tmpSemester,_tmpEvent);
      } else {
        _result = null;
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

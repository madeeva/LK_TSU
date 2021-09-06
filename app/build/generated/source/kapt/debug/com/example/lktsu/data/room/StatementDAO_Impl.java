package com.example.lktsu.data.room;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.lktsu.data.model.StatementEntity;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class StatementDAO_Impl implements StatementDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<StatementEntity> __insertionAdapterOfStatementEntity;

  public StatementDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStatementEntity = new EntityInsertionAdapter<StatementEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `statement_table` (`id`,`title`,`description`,`student_id`,`number`,`status`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StatementEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        stmt.bindLong(4, value.getStudent_id());
        stmt.bindLong(5, value.getNumber());
        if (value.getStatus() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getStatus());
        }
      }
    };
  }

  @Override
  public void addStatement(final StatementEntity statementEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfStatementEntity.insert(statementEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<StatementEntity> readStatementList() {
    final String _sql = "SELECT * FROM statement_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfStudentId = CursorUtil.getColumnIndexOrThrow(_cursor, "student_id");
      final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final List<StatementEntity> _result = new ArrayList<StatementEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final StatementEntity _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final long _tmpStudent_id;
        _tmpStudent_id = _cursor.getLong(_cursorIndexOfStudentId);
        final long _tmpNumber;
        _tmpNumber = _cursor.getLong(_cursorIndexOfNumber);
        final String _tmpStatus;
        if (_cursor.isNull(_cursorIndexOfStatus)) {
          _tmpStatus = null;
        } else {
          _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        }
        _item = new StatementEntity(_tmpId,_tmpTitle,_tmpDescription,_tmpStudent_id,_tmpNumber,_tmpStatus);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public StatementEntity readStatement(final long id) {
    final String _sql = "SELECT * FROM statement_table WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfStudentId = CursorUtil.getColumnIndexOrThrow(_cursor, "student_id");
      final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final StatementEntity _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final long _tmpStudent_id;
        _tmpStudent_id = _cursor.getLong(_cursorIndexOfStudentId);
        final long _tmpNumber;
        _tmpNumber = _cursor.getLong(_cursorIndexOfNumber);
        final String _tmpStatus;
        if (_cursor.isNull(_cursorIndexOfStatus)) {
          _tmpStatus = null;
        } else {
          _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        }
        _result = new StatementEntity(_tmpId,_tmpTitle,_tmpDescription,_tmpStudent_id,_tmpNumber,_tmpStatus);
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

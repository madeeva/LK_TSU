package com.example.lktsu.data.room;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.lktsu.data.model.HistoryEntity;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HistoryDAO_Impl implements HistoryDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HistoryEntity> __insertionAdapterOfHistoryEntity;

  public HistoryDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHistoryEntity = new EntityInsertionAdapter<HistoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `history_table` (`id`,`number`,`history`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HistoryEntity value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getNumber());
        if (value.getHistory() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getHistory());
        }
      }
    };
  }

  @Override
  public void addHistory(final HistoryEntity historyEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHistoryEntity.insert(historyEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public HistoryEntity readHistory(final long number) {
    final String _sql = "SELECT * FROM history_table WHERE number=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, number);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
      final int _cursorIndexOfHistory = CursorUtil.getColumnIndexOrThrow(_cursor, "history");
      final HistoryEntity _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpNumber;
        _tmpNumber = _cursor.getLong(_cursorIndexOfNumber);
        final String _tmpHistory;
        if (_cursor.isNull(_cursorIndexOfHistory)) {
          _tmpHistory = null;
        } else {
          _tmpHistory = _cursor.getString(_cursorIndexOfHistory);
        }
        _result = new HistoryEntity(_tmpId,_tmpNumber,_tmpHistory);
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

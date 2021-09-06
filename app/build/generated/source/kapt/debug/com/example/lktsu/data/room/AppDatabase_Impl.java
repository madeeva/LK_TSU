package com.example.lktsu.data.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile StudentDAO _studentDAO;

  private volatile NewsDAO _newsDAO;

  private volatile StatementDAO _statementDAO;

  private volatile MarksDAO _marksDAO;

  private volatile HistoryDAO _historyDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `student_fio_table` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `group` TEXT NOT NULL, `phone1` TEXT NOT NULL, `phone2` TEXT NOT NULL, `phone3` TEXT NOT NULL, `email` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `news_table` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `statement_table` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `student_id` INTEGER NOT NULL, `number` INTEGER NOT NULL, `status` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `marks_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `student_id` INTEGER NOT NULL, `subject` TEXT NOT NULL, `mark` TEXT NOT NULL, `semester` INTEGER NOT NULL, `event` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `history_table` (`id` INTEGER NOT NULL, `number` INTEGER NOT NULL, `history` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '569e2d5f80b2ea3a491c26f8a580defd')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `student_fio_table`");
        _db.execSQL("DROP TABLE IF EXISTS `news_table`");
        _db.execSQL("DROP TABLE IF EXISTS `statement_table`");
        _db.execSQL("DROP TABLE IF EXISTS `marks_table`");
        _db.execSQL("DROP TABLE IF EXISTS `history_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsStudentFioTable = new HashMap<String, TableInfo.Column>(7);
        _columnsStudentFioTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStudentFioTable.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStudentFioTable.put("group", new TableInfo.Column("group", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStudentFioTable.put("phone1", new TableInfo.Column("phone1", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStudentFioTable.put("phone2", new TableInfo.Column("phone2", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStudentFioTable.put("phone3", new TableInfo.Column("phone3", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStudentFioTable.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStudentFioTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStudentFioTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStudentFioTable = new TableInfo("student_fio_table", _columnsStudentFioTable, _foreignKeysStudentFioTable, _indicesStudentFioTable);
        final TableInfo _existingStudentFioTable = TableInfo.read(_db, "student_fio_table");
        if (! _infoStudentFioTable.equals(_existingStudentFioTable)) {
          return new RoomOpenHelper.ValidationResult(false, "student_fio_table(com.example.lktsu.data.model.StudentEntity).\n"
                  + " Expected:\n" + _infoStudentFioTable + "\n"
                  + " Found:\n" + _existingStudentFioTable);
        }
        final HashMap<String, TableInfo.Column> _columnsNewsTable = new HashMap<String, TableInfo.Column>(3);
        _columnsNewsTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsTable.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNewsTable.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNewsTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNewsTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNewsTable = new TableInfo("news_table", _columnsNewsTable, _foreignKeysNewsTable, _indicesNewsTable);
        final TableInfo _existingNewsTable = TableInfo.read(_db, "news_table");
        if (! _infoNewsTable.equals(_existingNewsTable)) {
          return new RoomOpenHelper.ValidationResult(false, "news_table(com.example.lktsu.data.model.NewsEntity).\n"
                  + " Expected:\n" + _infoNewsTable + "\n"
                  + " Found:\n" + _existingNewsTable);
        }
        final HashMap<String, TableInfo.Column> _columnsStatementTable = new HashMap<String, TableInfo.Column>(6);
        _columnsStatementTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatementTable.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatementTable.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatementTable.put("student_id", new TableInfo.Column("student_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatementTable.put("number", new TableInfo.Column("number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatementTable.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStatementTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStatementTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStatementTable = new TableInfo("statement_table", _columnsStatementTable, _foreignKeysStatementTable, _indicesStatementTable);
        final TableInfo _existingStatementTable = TableInfo.read(_db, "statement_table");
        if (! _infoStatementTable.equals(_existingStatementTable)) {
          return new RoomOpenHelper.ValidationResult(false, "statement_table(com.example.lktsu.data.model.StatementEntity).\n"
                  + " Expected:\n" + _infoStatementTable + "\n"
                  + " Found:\n" + _existingStatementTable);
        }
        final HashMap<String, TableInfo.Column> _columnsMarksTable = new HashMap<String, TableInfo.Column>(6);
        _columnsMarksTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMarksTable.put("student_id", new TableInfo.Column("student_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMarksTable.put("subject", new TableInfo.Column("subject", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMarksTable.put("mark", new TableInfo.Column("mark", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMarksTable.put("semester", new TableInfo.Column("semester", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMarksTable.put("event", new TableInfo.Column("event", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMarksTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMarksTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMarksTable = new TableInfo("marks_table", _columnsMarksTable, _foreignKeysMarksTable, _indicesMarksTable);
        final TableInfo _existingMarksTable = TableInfo.read(_db, "marks_table");
        if (! _infoMarksTable.equals(_existingMarksTable)) {
          return new RoomOpenHelper.ValidationResult(false, "marks_table(com.example.lktsu.data.model.MarksEntity).\n"
                  + " Expected:\n" + _infoMarksTable + "\n"
                  + " Found:\n" + _existingMarksTable);
        }
        final HashMap<String, TableInfo.Column> _columnsHistoryTable = new HashMap<String, TableInfo.Column>(3);
        _columnsHistoryTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryTable.put("number", new TableInfo.Column("number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryTable.put("history", new TableInfo.Column("history", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHistoryTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHistoryTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHistoryTable = new TableInfo("history_table", _columnsHistoryTable, _foreignKeysHistoryTable, _indicesHistoryTable);
        final TableInfo _existingHistoryTable = TableInfo.read(_db, "history_table");
        if (! _infoHistoryTable.equals(_existingHistoryTable)) {
          return new RoomOpenHelper.ValidationResult(false, "history_table(com.example.lktsu.data.model.HistoryEntity).\n"
                  + " Expected:\n" + _infoHistoryTable + "\n"
                  + " Found:\n" + _existingHistoryTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "569e2d5f80b2ea3a491c26f8a580defd", "4779f1656f5927082e4fb962b771d957");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "student_fio_table","news_table","statement_table","marks_table","history_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `student_fio_table`");
      _db.execSQL("DELETE FROM `news_table`");
      _db.execSQL("DELETE FROM `statement_table`");
      _db.execSQL("DELETE FROM `marks_table`");
      _db.execSQL("DELETE FROM `history_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(StudentDAO.class, StudentDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(NewsDAO.class, NewsDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(StatementDAO.class, StatementDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(MarksDAO.class, MarksDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(HistoryDAO.class, HistoryDAO_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public StudentDAO studentDAO() {
    if (_studentDAO != null) {
      return _studentDAO;
    } else {
      synchronized(this) {
        if(_studentDAO == null) {
          _studentDAO = new StudentDAO_Impl(this);
        }
        return _studentDAO;
      }
    }
  }

  @Override
  public NewsDAO newsDAO() {
    if (_newsDAO != null) {
      return _newsDAO;
    } else {
      synchronized(this) {
        if(_newsDAO == null) {
          _newsDAO = new NewsDAO_Impl(this);
        }
        return _newsDAO;
      }
    }
  }

  @Override
  public StatementDAO statementDAO() {
    if (_statementDAO != null) {
      return _statementDAO;
    } else {
      synchronized(this) {
        if(_statementDAO == null) {
          _statementDAO = new StatementDAO_Impl(this);
        }
        return _statementDAO;
      }
    }
  }

  @Override
  public MarksDAO marksDAO() {
    if (_marksDAO != null) {
      return _marksDAO;
    } else {
      synchronized(this) {
        if(_marksDAO == null) {
          _marksDAO = new MarksDAO_Impl(this);
        }
        return _marksDAO;
      }
    }
  }

  @Override
  public HistoryDAO historyDAO() {
    if (_historyDAO != null) {
      return _historyDAO;
    } else {
      synchronized(this) {
        if(_historyDAO == null) {
          _historyDAO = new HistoryDAO_Impl(this);
        }
        return _historyDAO;
      }
    }
  }
}

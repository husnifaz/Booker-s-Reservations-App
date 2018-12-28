package com.mobile.xcode.final1;

/**
 * Created by Muhammad Husni Farid on 30/05/2017.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "booker.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table reservasi (ID INTEGER PRIMARY KEY AUTOINCREMENT, nama text null, telp text null, meja text null, tanggal text null, jam text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "insert into reservasi values (NULL,'husni','087663','2','2017-05-10','20:33');";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub

    }

}
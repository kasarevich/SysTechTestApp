package com.kosarevskiy.systechtestapp.data.database;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.kosarevskiy.systechtestapp.mvp.model.Currency;

import javax.inject.Inject;

public class DBHelper extends SQLiteOpenHelper {

    public static final String RATE_TABLE_NAME = "rates";
    public static final String RATE_COLUMN_CURRENCY_CHAR_INDEX = "cur_index";
    public static final String RATE_COLUMN_CURRENCY_NAME = "cur_name";
    public static final String RATE_COLUMN_SCALE = "scale";
    public static final String RATE_COLUMN_FIRST_DAY_RATE = "first_day_rate";
    public static final String RATE_COLUMN_SECOND_DAY_RATE = "second_day_rate";
    public static final String RATE_COLUMN_IS_ENABLE = "is_enable";
    public static final String RATE_COLUMN_ORDER = "list_order ";

    @Inject
    public DBHelper(Context context, String databaseName, Integer version){
        super(context, databaseName, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        createTableIfNotExists(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + RATE_TABLE_NAME);
        onCreate(db);
    }

    private void createTableIfNotExists(SQLiteDatabase db) {
            db.execSQL(
                    "CREATE TABLE IF NOT EXISTS "
                            + RATE_TABLE_NAME + "("
                            + RATE_COLUMN_CURRENCY_CHAR_INDEX + " TEXT NOT NULL PRIMARY KEY, "
                            + RATE_COLUMN_CURRENCY_NAME + " TEXT, "
                            + RATE_COLUMN_SCALE + " TEXT, "
                            + RATE_COLUMN_FIRST_DAY_RATE + " REAL, "
                            + RATE_COLUMN_SECOND_DAY_RATE + " REAL, "
                            + RATE_COLUMN_IS_ENABLE + " BLOB , "
                            + RATE_COLUMN_ORDER + " INTEGER " + ")"
            );
    }

    private void insertCurrency(Currency currency){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.query()
            if ()
    }

    private void InsertOrUpdateIFExists(String index){

    }


}

package com.teamtreehouse.mememaker.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

import com.teamtreehouse.mememaker.models.Meme;
import com.teamtreehouse.mememaker.models.MemeAnnotation;

import java.util.ArrayList;

public class MemeDataSource {

    private Context mContext;
    private MemeSQLiteHelper mMemeSQLiteHelper;

    public MemeDataSource(Context context) {
        mContext = context;
        mMemeSQLiteHelper = new MemeSQLiteHelper(context);
        SQLiteDatabase database = mMemeSQLiteHelper.getReadableDatabase();
        database.close();
    }

    private SQLiteDatabase open() {
        return mMemeSQLiteHelper.getWritableDatabase();
    }

    private void close(SQLiteDatabase database) {
        database.close();
    }

    public void create(Meme meme) {
        SQLiteDatabase database = open();
        database.beginTransaction();
        //implementation details
        database.setTransactionSuccessful();
        database.endTransaction();
        close(database);
    }
}














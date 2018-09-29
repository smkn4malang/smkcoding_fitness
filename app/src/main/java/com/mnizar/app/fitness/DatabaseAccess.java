package com.mnizar.app.fitness;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseAccess {

    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static DatabaseAccess instance;
    Cursor cursor = null;

    private DatabaseAccess(Context context) {
        this.openHelper = new DatabaseHelper(context);
    }

    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    public void open() {
        this.db = openHelper.getWritableDatabase();
    }

    public void close() {
        if (db != null) {
            this.db.close();
        }
    }


    public String getArmExercises() {
        cursor = db.rawQuery("SELECT nama FROM arm_exercises", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while (cursor.moveToNext()) {
            String name = cursor.getString(0);
            buffer.append("" + name);
        }
        return buffer.toString();
    }

    public String getImage() {
        cursor = db.rawQuery("SELECT * FROM arm_image", new String[]{});
        StringBuffer buffer = new StringBuffer();
        if (cursor.moveToFirst()) {
            do {

            } while (cursor.moveToNext());
        }
        return buffer.toString();
    }

}

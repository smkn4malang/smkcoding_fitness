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

    private  DatabaseAccess(Context context){
        this.openHelper = new DatabaseHelper(context);
    }

    public static DatabaseAccess getInstance(Context context){
        if(instance == null){
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    public void open(){
        this.db = openHelper.getWritableDatabase();
    }

    public void close(){
        if (db != null){
            this.db.close();
        }
    }

    public String getInstruction(String jenis){
        cursor = db.rawQuery("SELECT instruksi FROM instructions WHERE jenis = '"+jenis+"'", new String[]{});
        StringBuffer buffer = new StringBuffer();
        while (cursor.moveToNext()){
            String instruksi = cursor.getString(0);
            buffer.append(""+instruksi);
        }
        return  buffer.toString();
    }

}

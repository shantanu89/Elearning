package com.abc.e_learning;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseConnection extends SQLiteOpenHelper
{
    public static final String DATABASE_NAME="register.db";
    public static final String TABLE_NAME="registeruser";
    public static final String coloumn1="ID";
    public static final String coloumn2="username";
    public static final String coloumn3="emailId";
    public static final String coloumn4="MobileNumber";
    public static final String coloumn5="password";


    public DatabaseConnection(Context context)
    {
        super(context,DATABASE_NAME, null  , 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
      db.execSQL("CREATE TABLE registeruser (ID INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT,emailID TEXT,MobileNumber Number ,password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS " +  TABLE_NAME);
        onCreate(db);
    }

    public long addUser(String user,String emailId ,String MobileNumber,String password)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("username",user);
        contentValues.put("emailId",emailId);
        contentValues.put("MobileNumber",MobileNumber);
        contentValues.put("password",password);
        long res=db.insert("registeruser",null,contentValues);
        db.close();
        return res;
    }

    public boolean checkUser(String username,String password)
    {
        String[] coloumns={ coloumn1 };
        SQLiteDatabase db = getReadableDatabase();
        String selection =coloumn2 + " = ?" + " AND " + coloumn5 + " = ?";
        String[] selectionArgs={username,password};
        Cursor cursor= db.query(TABLE_NAME,coloumns,selection,selectionArgs,null,null,null);
        int count = cursor.getCount();
        cursor.close();
        db.close();

        if(count>0)
             return true;
        else
             return false;

    }

}

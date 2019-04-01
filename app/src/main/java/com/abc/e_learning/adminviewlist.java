package com.abc.e_learning;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class adminviewlist extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminviewlist);

        DatabaseConnection dbconn =new DatabaseConnection(this);
        TextView textView = findViewById(R.id.textView3);
        Cursor cursor = dbconn.ViewData();
        StringBuilder stringBuilder = new StringBuilder();
        while (cursor.moveToNext())
        {
            stringBuilder.append("Video Link" + cursor.getString(5));
        }
        textView.setText(stringBuilder);
    }
}

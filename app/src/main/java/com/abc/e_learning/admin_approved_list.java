package com.abc.e_learning;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class admin_approved_list extends AppCompatActivity
{
   EditText mapprovedlist;
   Button   msavesapprovedlist;
   ListView linkslist;
   DatabaseConnection dba;

   ArrayList<String>  listItem;
   ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_approved_list);

        dba = new DatabaseConnection(this);

        mapprovedlist = (EditText) findViewById(R.id.edit_approved);
        msavesapprovedlist = (Button) findViewById(R.id.button_approved);
        linkslist= (ListView) findViewById(R.id.list_approved);

        ViewData();
        msavesapprovedlist.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               String link = mapprovedlist.getText().toString();
                mapprovedlist.setText("");
                listItem.clear();
                ViewData();

            }
        });

    }

    private void ViewData()
    {
        Cursor cursor = dba.ViewData();

        if (cursor.getCount() == 0 )
        {
            Toast.makeText(this,"Data Not Present!",Toast.LENGTH_SHORT).show();
        }
        else
        {
            while (cursor.moveToNext())
            {
                listItem.add(cursor.getString(5));
            }
            adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listItem);
            linkslist.setAdapter(adapter);
        }
    }


}

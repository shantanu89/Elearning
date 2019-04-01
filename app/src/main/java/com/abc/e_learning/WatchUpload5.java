package com.abc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WatchUpload5 extends AppCompatActivity
{

    Button watchdof;
    Button uploaddof;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_upload5);

        watchdof = (Button) findViewById(R.id.watch_vediodof);
        uploaddof =(Button)  findViewById(R.id.upload_vediodod);


        watchdof.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent watchdof = new Intent(WatchUpload5.this,VideoActivitydos.class);
                startActivity(watchdof);
            }
        });

        uploaddof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
              Intent uploadintent5 =new Intent(WatchUpload5.this,UploadActivity1.class);
              startActivity(uploadintent5);
            }
        });
    }
}

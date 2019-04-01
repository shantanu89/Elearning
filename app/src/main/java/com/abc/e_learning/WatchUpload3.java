package com.abc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WatchUpload3 extends AppCompatActivity
{
    Button watchdbms;
    Button uploaddbms;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_upload3);

        watchdbms = (Button) findViewById(R.id.watch_vediodbms);
        uploaddbms = (Button) findViewById(R.id.upload_vediodbms);


        watchdbms.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent watchdbms = new Intent(WatchUpload3.this,VideoActivityDbms.class);
                startActivity(watchdbms);
            }
        });

        uploaddbms.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               Intent uploadintent3 = new Intent(WatchUpload3.this,UploadActivity1.class);
               startActivity(uploadintent3);
            }
        });
    }
}

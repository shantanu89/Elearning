package com.abc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WatchUpload2 extends AppCompatActivity
{

    Button mwatchoops;
    Button muploadoops;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_upload2);

        mwatchoops = (Button) findViewById(R.id.watch_vedioops);
        muploadoops = (Button) findViewById(R.id.upload_vediodoops);


        mwatchoops.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent newoops= new Intent(WatchUpload2.this,VideoActivityoops.class);
                startActivity(newoops);
            }
        });

        muploadoops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               Intent uploadintent1 = new Intent(WatchUpload2.this,UploadActivity1.class);
               startActivity(uploadintent1);
            }
        });
     }
}

package com.abc.e_learning;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WatchUpload extends AppCompatActivity
{
    Button mwatch;
    Button mupload;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_upload);



        mwatch  = (Button) findViewById(R.id.watch_vedio);
        mupload = (Button) findViewById(R.id.upload_vedio);

        mwatch.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent newwatch = new Intent(WatchUpload.this, VideoActivity.class);
                startActivity(newwatch);
            }
        });

        mupload.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                    Intent newupload = new Intent(WatchUpload.this,UploadActivity1.class);
                    startActivity(newupload);
            }
        });
    }
}

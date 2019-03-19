package com.abc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WatchUpload4 extends AppCompatActivity
{

    Button watchdf;
    Button uploaddf;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_upload4);

        watchdf=(Button)findViewById(R.id.watch_vediodf);
        uploaddf=(Button)findViewById(R.id.upload_vediodf);


        watchdf.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent watchdf = new Intent(WatchUpload4.this,VideoActivitydf.class);
                startActivity(watchdf);
            }
        });
    }
}

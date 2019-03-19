package com.abc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WatchUpload1 extends AppCompatActivity
{

    Button mwatchdcfm;
    Button muploaddcfm;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_upload1);

        mwatchdcfm = (Button) findViewById(R.id.watch_vediodcfm);
        muploaddcfm =(Button)  findViewById(R.id.upload_vediodcfm);


        mwatchdcfm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent newdcfm =new Intent(WatchUpload1.this,VideoActivitydcfm.class);
                startActivity(newdcfm);
            }
        });
    }
}

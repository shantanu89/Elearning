package com.abc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthYear extends AppCompatActivity
{
    Button mdf;
    Button mdos;
    Button mics;
    Button mlp  ;
    Button mmcom  ;
    Button mtcpip ;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_year);

        mdf=(Button) findViewById(R.id.s_df);
        mdos=(Button) findViewById(R.id.s_dos);
        mics=(Button) findViewById(R.id.s_ics);
        mlp=(Button) findViewById(R.id.s_lp);
        mmcom=(Button) findViewById(R.id.s_mcom);
        mtcpip=(Button) findViewById(R.id.s_tcpip);

        mdf.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent watch1 = new Intent(FourthYear.this,WatchUpload4.class);
                startActivity(watch1);

            }
        });

        mdos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent watch2 = new Intent(FourthYear.this,WatchUpload5.class);
                startActivity(watch2);

            }
        });

        mics.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent watch3 = new Intent(FourthYear.this,WatchUpload.class);
                startActivity(watch3);

            }
        });

        mlp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent watch4 = new Intent(FourthYear.this,WatchUpload.class);
                startActivity(watch4);

            }
        });

        mmcom.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent watch5 = new Intent(FourthYear.this,WatchUpload.class);
                startActivity(watch5);

            }
        });

        mtcpip.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent watch6 = new Intent(FourthYear.this,WatchUpload.class);
                startActivity(watch6);

            }
        });
    }
}

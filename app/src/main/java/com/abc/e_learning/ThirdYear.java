package com.abc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdYear extends AppCompatActivity
{
    Button moops;
    Button mdbms;
    Button mcg;
    Button msepm;
    Button mai;
    Button mdp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_year);

        moops  = (Button)findViewById(R.id.s_oops);
        mdbms  = (Button)findViewById(R.id.s_dbms);
        mcg    = (Button)findViewById(R.id.s_cg);
        msepm  = (Button)findViewById(R.id.s_sepm);
        mai    = (Button)findViewById(R.id.s_ai);
        mdp    = (Button)findViewById(R.id.s_dp);

        moops.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent wua = new Intent(ThirdYear.this,WatchUpload2.class);
                startActivity(wua);
            }
        });

        mdbms.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent wub = new Intent(ThirdYear.this,WatchUpload3.class);
                startActivity(wub);
            }
        });

        mcg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent wuc = new Intent(ThirdYear.this,WatchUpload.class);
                startActivity(wuc);
            }
        });

        msepm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent wud = new Intent(ThirdYear.this,WatchUpload.class);
                startActivity(wud);
            }
        });

        mai.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent wue = new Intent(ThirdYear.this,WatchUpload.class);
                startActivity(wue);
            }
        });

        mdp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent wuf = new Intent(ThirdYear.this,WatchUpload.class);
                startActivity(wuf);
            }
        });
    }
}

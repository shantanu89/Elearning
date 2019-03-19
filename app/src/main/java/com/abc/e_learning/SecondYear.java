package com.abc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondYear extends AppCompatActivity
{
    Button maclpd;
    Button mdcfm;
    Button mcao;
    Button mtfcs;
    Button mos;
    Button msp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_year);

        maclpd = (Button)findViewById(R.id.s_acpld);
        mdcfm  = (Button)findViewById(R.id.s_dcfm);
        mcao   = (Button)findViewById(R.id.s_cao);
        mtfcs  = (Button)findViewById(R.id.s_tfcs);
        mos    = (Button)findViewById(R.id.s_os);
        msp    = (Button)findViewById(R.id.s_sp);

        maclpd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent wp1 = new Intent(SecondYear.this,WatchUpload.class);
                startActivity(wp1);
            }
        });

        mdcfm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent wp2 = new Intent(SecondYear.this,WatchUpload1.class);
                startActivity(wp2);
            }
        });

        mcao.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent wp3 = new Intent(SecondYear.this,WatchUpload.class);
                startActivity(wp3);
            }
        });

        mtfcs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent wp4 = new Intent(SecondYear.this,WatchUpload.class);
                startActivity(wp4);
            }
        });

        mos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent wp5 = new Intent(SecondYear.this,WatchUpload.class);
                startActivity(wp5);
            }
        });

        msp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent wp6 = new Intent(SecondYear.this,WatchUpload.class);
                startActivity(wp6);
            }
        });
    }

}

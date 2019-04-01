package com.abc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class After_admin_Login extends AppCompatActivity
{
   Button mviewlist;
   Button mapprvedlist;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_admin__login);

        mviewlist = (Button) findViewById(R.id.view_list);
        mapprvedlist = (Button) findViewById(R.id.approved_list);

        mviewlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent newintent = new Intent(getApplicationContext(),adminviewlist.class);
                startActivity(newintent);
            }
        });

        mapprvedlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent newintent = new Intent(After_admin_Login.this,admin_approved_list.class);
                startActivity(newintent);
            }
        });
    }
}

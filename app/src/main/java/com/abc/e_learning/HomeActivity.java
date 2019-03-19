package com.abc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity
{

    Button mButtonSecondyear;
    Button mButtonThirdYear;
    Button mButtonForthyear;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mButtonSecondyear=(Button)findViewById(R.id.second_year);
        mButtonThirdYear=(Button)findViewById(R.id.third_year);
        mButtonForthyear=(Button)findViewById(R.id.fourth_year);

        mButtonSecondyear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent jumpsecondyear = new Intent(HomeActivity.this,SecondYear.class);
                startActivity(jumpsecondyear);
            }
        });

        mButtonThirdYear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
              Intent jumpthirdyear = new Intent(HomeActivity.this,ThirdYear.class);
              startActivity(jumpthirdyear);
            }
        });

        mButtonForthyear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent jumpfourthyear = new Intent(HomeActivity.this,FourthYear.class);
                startActivity(jumpfourthyear);
            }
        });
    }
}

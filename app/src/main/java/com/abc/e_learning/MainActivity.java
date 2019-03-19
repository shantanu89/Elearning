package com.abc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.function.BooleanSupplier;

public class MainActivity extends AppCompatActivity

{
    DatabaseConnection db;
    EditText mTextUsername;
    EditText mTextPassword;
    Button   mButtonLogin;
    Button mButtonAdmin;
    TextView mTextViewRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db=new DatabaseConnection(this);

        mTextUsername=(EditText)findViewById(R.id.edittext_username);
        mTextPassword=(EditText)findViewById(R.id.edittext_password);
        mButtonLogin=(Button)findViewById(R.id.button_Login);
        mButtonAdmin=(Button) findViewById(R.id.Button_Admin);
        mTextViewRegister=(TextView) findViewById(R.id.textview_register);


        mButtonAdmin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent AdminIntent =new Intent(MainActivity.this,AdminActivity.class);
                startActivity(AdminIntent);
            }
        });

        mTextViewRegister.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               Intent registerIntent =new Intent(MainActivity.this,RegesterActivity.class);
               startActivity(registerIntent);
            }
        });

        mButtonLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String user = mTextUsername.getText().toString().trim();
                String pwd  = mTextPassword.getText().toString().trim();
                Boolean res = db.checkUser(user,pwd);

                if(res == true)
                {
                    Intent HomeIntent=new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(HomeIntent);
                }

                else
                {
                    Toast.makeText(MainActivity.this,"Loggin Failed!",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}

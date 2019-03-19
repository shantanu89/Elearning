package com.abc.e_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegesterActivity extends AppCompatActivity
{

    DatabaseConnection db;
    EditText mTextUsername;
    EditText mTextEmaild;
    EditText mMobileNo;
    EditText mTextPassword;
    EditText MTextCPassword;
    Button mButtonSave;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regester);

        db = new DatabaseConnection(this);

        mTextUsername = (EditText) findViewById(R.id.edittext_username);
        mTextEmaild = (EditText) findViewById(R.id.edittext_emailid);
        mMobileNo = (EditText) findViewById(R.id.edittext_mobileno);
        mTextPassword = (EditText) findViewById(R.id.edittext_password);
        MTextCPassword = (EditText) findViewById(R.id.edittext_confirmpassword);
        mButtonSave=(Button) findViewById(R.id.button_Login);

        mButtonSave.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
             String user=mTextUsername.getText().toString().trim();
             String eid =mTextEmaild.getText().toString().trim();
             String Mno =mMobileNo.toString().trim();
             String pwd =mTextPassword.getText().toString().trim();
             String cpwd=MTextCPassword.getText().toString().trim();

             if (pwd.equals(cpwd))
             {
                 long val=db.addUser(user,eid,Mno,pwd);


                 if(val>0)
                 {
                     Toast.makeText(RegesterActivity.this, "You have Registered Successfully", Toast.LENGTH_SHORT).show();
                     Intent movetoLogin = new Intent(RegesterActivity.this, MainActivity.class);
                     startActivity(movetoLogin);
                 }
                 else
                 {
                     Toast.makeText(RegesterActivity.this, "Registration Failed!", Toast.LENGTH_SHORT).show();
                 }
             }
             else
             {
                 Toast.makeText(RegesterActivity.this,"Password is not matching",Toast.LENGTH_SHORT).show();
             }
             }
        });


    }
}

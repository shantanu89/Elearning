package com.abc.e_learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UploadActivity1 extends AppCompatActivity
{
    Button mupload;
    DatabaseConnection db1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload1);

        db1 = new DatabaseConnection(this);

        mupload = (Button) findViewById(R.id.upload_vedio);

        mupload.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String vidiouploadactivity=mupload.getText().toString().trim();

                long val=db1.adduser1(vidiouploadactivity);

                Toast.makeText(UploadActivity1.this,"Saved Successfully!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

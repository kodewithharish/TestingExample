package com.kodewithharish.testingexample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.kodewithharish.testingexample.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn=findViewById(R.id.login);
        EditText username_edit=findViewById(R.id.username);
        EditText password_edt=findViewById(R.id.password);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(Constants.email_Validator(username_edit.getText().toString()) && Constants.isValidPassword(password_edt.getText().toString()))
                {
                    startActivity(new Intent(MainActivity.this,SecondActivity.class));

                }

            }
        });
    }
}
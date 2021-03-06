package com.example.joseramirez.horasbeca_extension;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        int age = intent.getIntExtra("age", -1);

        TextView tvWelcomeMsg = (TextView) findViewById(R.id.tvWelcomeMsg);
        EditText etUserName = (EditText) findViewById(R.id.etUserName);
        EditText etAge = (EditText) findViewById(R.id.etAge);

        // Display user details
        String message = name + " Bienvenido a Horas Beca-Extension";
        tvWelcomeMsg.setText(message);
        etUserName.setText(username);
        etAge.setText(age + "");
    }
}

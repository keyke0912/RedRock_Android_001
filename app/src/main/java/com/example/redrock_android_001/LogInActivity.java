package com.example.redrock_android_001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        Button btn_logIn = (Button) findViewById(R.id.btn_logIn);
        //test
        btn_logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LogInActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LogInActivity.this, DisplayActivity.class));
            }
        });
    }
}
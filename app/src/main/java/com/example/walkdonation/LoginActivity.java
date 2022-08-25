package com.example.walkdonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageButton start_btn = (ImageButton) findViewById(R.id.login);

        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InformationActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Duksungs님! 어서오세요!\n오늘도 힘차게 걸어봐요!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
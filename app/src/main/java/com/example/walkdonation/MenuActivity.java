package com.example.walkdonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton ranking_btn = (ImageButton) findViewById(R.id. ranking_menu);
        ImageButton donation_btn = (ImageButton) findViewById(R.id. donation_menu);
        ImageButton trashcan_btn = (ImageButton) findViewById(R.id. trashcan_menu);
        ImageButton challenge_btn = (ImageButton) findViewById(R.id. challenge_menu);

        ranking_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RankingActivity.class);
                startActivity(intent);
            }
        });

        donation_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DonationActivity.class);
                startActivity(intent);
            }
        });

        trashcan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TrashMapActivity.class);
                startActivity(intent);
            }
        });

        challenge_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChallengeActivity.class);
                startActivity(intent);
            }
        });


    }
}
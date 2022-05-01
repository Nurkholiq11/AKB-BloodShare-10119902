package com.example.bloodshare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class VerifyAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);

        Button button = findViewById(R.id.btn_VerifyAccountToUser);
        button.setOnClickListener(v -> move());
    }

    public void move() {
        Intent intent = new Intent(VerifyAccountActivity.this, UserActivity.class);
        startActivity(intent);
    }

}
package com.example.bloodshare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        Button button = findViewById(R.id.btn_VerifyToVerifyAccount);
        button.setOnClickListener(v -> move());
    }

    public void move() {
        Intent intent = new Intent(VerifyActivity.this, VerifyAccountActivity.class);
        startActivity(intent);
    }

}
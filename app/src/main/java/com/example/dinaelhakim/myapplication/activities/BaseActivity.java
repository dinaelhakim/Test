package com.example.dinaelhakim.myapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dinaelhakim.myapplication.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    <T> void navigateTo(Class<T> activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}

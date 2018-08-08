package com.example.dinaelhakim.myapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dinaelhakim.myapplication.R;

public class ImplicitIntentActivity extends AppCompatActivity {

    private Button dialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.implicit_intent_layout);
        dialButton = (Button) findViewById(R.id.btn_dial);
        dialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ImplicitIntentActivity.this, "Test Implicit Intent", Toast.LENGTH_LONG).show();
                Intent implicitIntent = new Intent();
                implicitIntent.setAction(Intent.ACTION_DIAL);
                ImplicitIntentActivity.this.startActivity(implicitIntent);
            }
        });
    }
}

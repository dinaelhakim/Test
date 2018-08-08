package com.example.dinaelhakim.myapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.dinaelhakim.myapplication.R;
import com.example.dinaelhakim.myapplication.adapters.MainRecyclerViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mainRecyclerView;
    private String[] mainTopicsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);
        mainRecyclerView = findViewById(R.id.main_recycler_view);
        mainTopicsList = getResources().getStringArray(R.array.main_topics_list);
        createRecyclerViewActions();
        mainRecyclerView.setAdapter(new MainRecyclerViewAdapter(mainTopicsList, createRecyclerViewActions()));
        mainRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mainRecyclerView.setHasFixedSize(true);  //to increase performance

    }

    private ArrayList<View.OnClickListener> createRecyclerViewActions() {
        ArrayList<View.OnClickListener> recyclerViewListenersList = new ArrayList<>();
        recyclerViewListenersList.add(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ImplicitIntentActivity.class);
                startActivity(intent);
            }
        });
        return recyclerViewListenersList;
    }
}

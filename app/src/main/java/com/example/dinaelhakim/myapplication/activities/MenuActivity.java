package com.example.dinaelhakim.myapplication.activities;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.dinaelhakim.myapplication.R;

public class MenuActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ((TextView) findViewById(R.id.text_view)).setText(R.string.menu_attributes_declaration);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.simple_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.menu_item_main_activity: {
                navigateTo(MenuActivity.class);
                break;
            }
            case R.id.menu_item_implicit_intent_activity: {
                navigateTo(ImplicitIntentActivity.class);
                break;
            }
            case R.id.menu_item_menu_activity: {
                navigateTo(MenuActivity.class);
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}

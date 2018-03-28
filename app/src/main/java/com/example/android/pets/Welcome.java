package com.example.android.pets;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Mohammed Maaz S on 07-02-18.
 */

public class Welcome extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Welcome.this,CatalogActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }
}

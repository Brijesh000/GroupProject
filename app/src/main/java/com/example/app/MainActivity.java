package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        setTitle("Group Project");

    }

    public void Login(View view) {
        Intent M = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(M);
    }

    public void AboutUs(View view) {
        Intent M = new Intent(this,AboutUs.class);
        startActivity(M);
    }

    public void ContactUs(View view) {
        Intent M = new Intent(this,ContactUs.class);
        startActivity(M);
    }
}
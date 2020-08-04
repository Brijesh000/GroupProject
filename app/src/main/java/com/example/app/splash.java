package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //splash screen

        new Handler().postDelayed(
                new Runnable(){
                    @Override
                    public void run() {
                        Intent i = new Intent(splash.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                }, 3000
        );

        if (Build.VERSION.SDK_INT >=21) {
            getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
        }
    }
}
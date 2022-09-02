package com.example.islam360;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash.this, main_screen.class);
                startActivity(intent);
                finish();
            }
        }, 4000);

    }
}
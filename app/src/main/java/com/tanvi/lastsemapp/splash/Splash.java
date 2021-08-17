package com.tanvi.lastsemapp.splash;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;

import com.tanvi.lastsemapp.R;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;


import androidx.appcompat.app.AppCompatActivity;

import com.tanvi.lastsemapp.MainActivity;
import com.tanvi.lastsemapp.preferences.SharedPrefUtils;
import com.tanvi.lastsemapp.authentication.AuthenticationActivity;
import com.tanvi.lastsemapp.utils.Constants;


public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                if(SharedPrefUtils.getBooleanData(Splash.this, Constants.IS_LOGGED_IN)){
                    startActivity(new Intent(Splash.this, MainActivity.class));
                } else {
                    startActivity(new Intent(Splash.this, AuthenticationActivity.class));
//                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                }
                finish();
            }
        }, 2500);

    }
}
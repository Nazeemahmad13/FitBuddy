package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        Thread thread= new Thread() {
            public void run (){
                try {
                    Thread.sleep(3000);
                }
                catch ( Exception exception){
                    exception.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(SplashScreen.this ,Register.class);
                    startActivity(intent);
                    finish();


                }
            }
        };thread.start();
    }
}
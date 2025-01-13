package com.example.restaurantapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.example.restaurantapp.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Show splash screen for 3 seconds and then navigate to LoginActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Check if activity is still in the foreground before launching the next activity
                if (!SplashScreenActivity.this.isFinishing()) {
                    Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }, 3000); // 3-second delay
    }
}

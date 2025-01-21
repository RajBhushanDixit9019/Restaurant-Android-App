package com.example.restaurantapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantapp.activities.LoginActivity;
import com.example.restaurantapp.R;
import com.example.restaurantapp.common.utils.RoleManager;

public class MainActivity extends AppCompatActivity {

    private Button btnAdmin, btnChef, btnCustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdmin = findViewById(R.id.btnAdmin);
        btnChef = findViewById(R.id.btnChef);
        btnCustomer = findViewById(R.id.btnCustomer);

        btnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RoleManager.setUserRole(MainActivity.this, "admin");
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        btnChef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RoleManager.setUserRole(MainActivity.this, "chef");
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        btnCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RoleManager.setUserRole(MainActivity.this, "customer");
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
    }
}

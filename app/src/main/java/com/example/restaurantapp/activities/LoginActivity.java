package com.example.restaurantapp.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantapp.R;
import com.example.restaurantapp.admin.AdminDashboardActivity;
import com.example.restaurantapp.chef.ChefDashboardActivity;
import com.example.restaurantapp.common.utils.RoleManager;
import com.example.restaurantapp.customer.CustomerDashboardActivity;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    private Button buttonToRegister;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        buttonToRegister = findViewById(R.id.buttonToRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userRole = RoleManager.getUserRole(LoginActivity.this);

                // Redirect user to the corresponding dashboard
                if ("admin".equals(userRole)) {
                    startActivity(new Intent(LoginActivity.this, AdminDashboardActivity.class));
                } else if ("chef".equals(userRole)) {
                    startActivity(new Intent(LoginActivity.this, ChefDashboardActivity.class));
                } else if ("customer".equals(userRole)) {
                    startActivity(new Intent(LoginActivity.this, CustomerDashboardActivity.class));
                }
            }
        });
        buttonToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, CustomerRegistrationActivity.class));
            }
        });
    }
}

package com.example.restaurantapp.activities;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);

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
    }
}

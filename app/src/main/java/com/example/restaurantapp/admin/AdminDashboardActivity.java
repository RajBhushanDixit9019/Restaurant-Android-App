package com.example.restaurantapp.admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantapp.R;

public class AdminDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        // Initialize buttons
        Button btnManageMenu = findViewById(R.id.btnManageMenu);
        Button btnManageUsers = findViewById(R.id.btnManageUsers);
        Button btnViewReports = findViewById(R.id.btnViewReports);

        // Set click listener for managing menu
        btnManageMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ManageMenuActivity
                Intent intent = new Intent(AdminDashboardActivity.this, ManageMenuActivity.class);
                startActivity(intent);
            }
        });

        // Set click listener for managing users
        btnManageUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ManageUsersActivity
                Intent intent = new Intent(AdminDashboardActivity.this, ManageUsersActivity.class);
                startActivity(intent);
            }
        });

        // Set click listener for viewing reports
        btnViewReports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ViewReportsActivity
                Intent intent = new Intent(AdminDashboardActivity.this, ViewReportsActivity.class);
                startActivity(intent);
            }
        });
    }
}

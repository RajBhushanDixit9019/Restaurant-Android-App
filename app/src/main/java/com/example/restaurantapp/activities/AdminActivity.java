package com.example.restaurantapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.restaurantapp.R;

public class AdminActivity extends AppCompatActivity {

    private Button btnManageOrders;
    private Button btnViewReports;
    private Button btnManageUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        // Initialize buttons with updated IDs
        btnManageOrders = findViewById(R.id.btnManageOrders);
        btnViewReports = findViewById(R.id.btnViewReports);
        btnManageUsers = findViewById(R.id.btnManageUsers);

        // Set button listeners
        btnManageOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle manage orders - navigate to ManageOrdersActivity
                Intent intent = new Intent(AdminActivity.this, ManageOrdersActivity.class);
                startActivity(intent);
            }
        });

        btnViewReports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle view reports - navigate to ViewReportsActivity
                Intent intent = new Intent(AdminActivity.this, ViewReportsActivity.class);
                startActivity(intent);
            }
        });

        btnManageUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle manage users - navigate to ManageUsersActivity
                Intent intent = new Intent(AdminActivity.this, ManageUsersActivity.class);
                startActivity(intent);
            }
        });
    }
}

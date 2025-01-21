package com.example.restaurantapp.customer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantapp.R;

public class CustomerDashboardActivity extends AppCompatActivity {

    private Button btnViewMenu;
    private Button btnOrderHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_dashboard);

        // Initialize buttons
        btnViewMenu = findViewById(R.id.btnViewMenu);
        btnOrderHistory = findViewById(R.id.btnOrderHistory);

        // Set click listener for viewing menu
        btnViewMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ViewMenuActivity
                Intent intent = new Intent(CustomerDashboardActivity.this, ViewMenuActivity.class);
                startActivity(intent);
            }
        });

        // Set click listener for order history
        btnOrderHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to OrderHistoryActivity
                Intent intent = new Intent(CustomerDashboardActivity.this, OrderHistoryActivity.class);
                startActivity(intent);
            }
        });
    }
}

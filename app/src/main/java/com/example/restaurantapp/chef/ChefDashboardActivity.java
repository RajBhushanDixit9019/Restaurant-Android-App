package com.example.restaurantapp.chef;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantapp.R;

public class ChefDashboardActivity extends AppCompatActivity {

    private Button btnViewOrders;
    private Button btnMarkOrderComplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef_dashboard);

        // Initialize buttons
        btnViewOrders = findViewById(R.id.btnViewOrders);
        btnMarkOrderComplete = findViewById(R.id.btnMarkOrderComplete);

        // Set click listener for viewing orders
        btnViewOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ViewOrdersActivity
                Intent intent = new Intent(ChefDashboardActivity.this, ViewOrdersActivity.class);
                startActivity(intent);
            }
        });

        // Set click listener for marking order complete
        btnMarkOrderComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to MarkOrderCompleteActivity
                Intent intent = new Intent(ChefDashboardActivity.this, MarkOrderCompleteActivity.class);
                startActivity(intent);
            }
        });
    }
}

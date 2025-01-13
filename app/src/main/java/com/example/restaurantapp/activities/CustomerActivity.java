package com.example.restaurantapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantapp.R;

public class CustomerActivity extends AppCompatActivity {

    private Button btnViewMenu;
    private Button btnViewOrderHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        // Initialize buttons with updated IDs
        btnViewMenu = findViewById(R.id.btnViewMenu);
        btnViewOrderHistory = findViewById(R.id.btnViewOrderHistory);

        // Set button listeners
        btnViewMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open MenuActivity when View Menu button is clicked
                Intent intent = new Intent(CustomerActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        btnViewOrderHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open OrderHistoryActivity when View Order History button is clicked
                Intent intent = new Intent(CustomerActivity.this, OrderHistoryActivity.class);
                startActivity(intent);
            }
        });
    }
}

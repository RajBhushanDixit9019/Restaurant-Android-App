package com.example.restaurantapp.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantapp.R;

public class ChefActivity extends AppCompatActivity {

    private Button btnViewOrders;
    private Button btnMarkOrderAsCompleted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef);

        // Initialize buttons with updated IDs
        btnViewOrders = findViewById(R.id.btnViewOrders);
        btnMarkOrderAsCompleted = findViewById(R.id.btnMarkOrderAsCompleted);

        // Set button listeners

        // Listener for "View Orders" button
        btnViewOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle view orders
                viewOrders();
            }
        });

        // Listener for "Mark Order As Completed" button
        btnMarkOrderAsCompleted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle mark order as completed
                markOrderAsCompleted();
            }
        });
    }

    // Function to handle the view orders functionality
    private void viewOrders() {
        // Code to fetch and display the list of orders for the chef
        // You could show a new screen or dialog with the list of orders here
        // For now, let's show a simple Toast message as a placeholder
        Toast.makeText(ChefActivity.this, "Viewing Orders", Toast.LENGTH_SHORT).show();
    }

    // Function to handle the mark order as completed functionality
    private void markOrderAsCompleted() {
        // Code to mark an order as completed
        // In a real application, you would update the order status in your database
        // For now, we'll show a placeholder Toast message
        Toast.makeText(ChefActivity.this, "Order Marked as Completed", Toast.LENGTH_SHORT).show();
    }
}

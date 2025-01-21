package com.example.restaurantapp.chef;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantapp.R;

public class MarkOrderCompleteActivity extends AppCompatActivity {

    private Button btnCompleteOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mark_order_complete);

        btnCompleteOrder = findViewById(R.id.btnCompleteOrder);

        // Set click listener for completing the order
        btnCompleteOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle order completion
                Toast.makeText(MarkOrderCompleteActivity.this, "Order marked as complete", Toast.LENGTH_SHORT).show();
                finish(); // Close the activity after marking complete
            }
        });
    }
}

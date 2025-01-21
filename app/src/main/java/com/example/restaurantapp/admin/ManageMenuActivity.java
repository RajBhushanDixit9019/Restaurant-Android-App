package com.example.restaurantapp.admin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantapp.R;

public class ManageMenuActivity extends AppCompatActivity {

    private Button btnAddItem;
    private Button btnEditItem;
    private Button btnRemoveItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_menu);

        // Initialize buttons
        btnAddItem = findViewById(R.id.btnAddItem);
        btnEditItem = findViewById(R.id.btnEditItem);
        btnRemoveItem = findViewById(R.id.btnRemoveItem);

        // Set button actions
        btnAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle add item
            }
        });

        btnEditItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle edit item
            }
        });

        btnRemoveItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle remove item
            }
        });
    }
}

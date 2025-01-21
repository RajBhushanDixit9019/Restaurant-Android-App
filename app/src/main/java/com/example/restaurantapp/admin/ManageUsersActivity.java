package com.example.restaurantapp.admin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantapp.R;

public class ManageUsersActivity extends AppCompatActivity {

    private Button btnViewUsers;
    private Button btnDeleteUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_users);

        // Initialize buttons
        btnViewUsers = findViewById(R.id.btnViewUsers);
        btnDeleteUser = findViewById(R.id.btnDeleteUser);

        // Set button actions
        btnViewUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle view users
            }
        });

        btnDeleteUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle delete user
            }
        });
    }
}

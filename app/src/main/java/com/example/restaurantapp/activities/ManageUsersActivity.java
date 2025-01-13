package com.example.restaurantapp.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.restaurantapp.R;

public class ManageUsersActivity extends AppCompatActivity {

    private Button btnAddUser;
    private Button btnRemoveUser;
    private Button btnViewUserList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_users);

        // Initialize buttons
        btnAddUser = findViewById(R.id.btnAddUser);
        btnRemoveUser = findViewById(R.id.btnRemoveUser);
        btnViewUserList = findViewById(R.id.btnViewUserList);

        // Set button listeners
        btnAddUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle adding user
            }
        });

        btnRemoveUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle removing user
            }
        });

        btnViewUserList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle viewing user list
            }
        });
    }
}

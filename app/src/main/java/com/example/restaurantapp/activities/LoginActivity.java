package com.example.restaurantapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantapp.R;

public class LoginActivity extends AppCompatActivity {

    private EditText edtUsername;
    private EditText edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize UI elements with updated IDs
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        // Set login button click listener
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtUsername.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                // Check if fields are empty
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please enter both username and password", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Perform login logic
                if (username.equals("admin") && password.equals("admin123")) {
                    // Go to AdminActivity for admin user
                    Intent intent = new Intent(LoginActivity.this, AdminActivity.class);
                    startActivity(intent);
                    finish(); // Close the login activity so the user cannot navigate back
                } else if (username.equals("chef") && password.equals("chef123")) {
                    // Go to ChefActivity for chef user
                    Intent intent = new Intent(LoginActivity.this, ChefActivity.class);
                    startActivity(intent);
                    finish(); // Close the login activity
                } else if (username.equals("customer") && password.equals("customer123")) {
                    // Go to CustomerActivity for customer user
                    Intent intent = new Intent(LoginActivity.this, CustomerActivity.class);
                    startActivity(intent);
                    finish(); // Close the login activity
                } else {
                    // Show error message for invalid credentials
                    Toast.makeText(LoginActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

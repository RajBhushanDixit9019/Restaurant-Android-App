package com.example.restaurantapp.admin;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantapp.R;

public class ViewReportsActivity extends AppCompatActivity {

    private TextView tvReports;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_reports);

        tvReports = findViewById(R.id.tvReports);

        // Display some reports (for now, we just display a placeholder text)
        tvReports.setText("Displaying Reports...");
    }
}

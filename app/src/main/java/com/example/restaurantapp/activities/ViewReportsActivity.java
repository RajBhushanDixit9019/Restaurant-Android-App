package com.example.restaurantapp.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.restaurantapp.R;

public class ViewReportsActivity extends AppCompatActivity {

    private Button btnViewSalesReport;
    private Button btnViewInventoryReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_reports);

        // Initialize buttons
        btnViewSalesReport = findViewById(R.id.btnViewSalesReport);
        btnViewInventoryReport = findViewById(R.id.btnViewInventoryReport);

        // Set button listeners
        btnViewSalesReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle viewing sales report
            }
        });

        btnViewInventoryReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle viewing inventory report
            }
        });
    }
}

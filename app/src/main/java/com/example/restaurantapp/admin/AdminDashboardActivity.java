package com.example.restaurantapp.admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.restaurantapp.R;

public class AdminDashboardActivity extends AppCompatActivity {

    String Root_Frag = "root_fragment";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        // Initialize buttons
        Button btnManageMenu = findViewById(R.id.btnManageMenu);
        Button btnManageStaff = findViewById(R.id.btnManageStaff);
        Button btnViewReports = findViewById(R.id.btnViewReports);

        loadFrag(new ManageMenu(), 0);
        // Set click listener for managing menu
        btnManageMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ManageMenuActivity
                //Intent intent = new Intent(AdminDashboardActivity.this, ManageMenuActivity.class);
                //startActivity(intent);
                loadFrag(new ManageMenu(), 0);
            }
        });

        // Set click listener for managing users
        btnManageStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ManageUsersActivity
                //Intent intent = new Intent(AdminDashboardActivity.this, ManageUsersActivity.class);
                //startActivity(intent);
                loadFrag(new ManageStaff(), 0);
            }
        });

        // Set click listener for viewing reports
        btnViewReports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ViewReportsActivity
                //Intent intent = new Intent(AdminDashboardActivity.this, ViewReportsActivity.class);
                //startActivity(intent);
                loadFrag(new ViewReports(), 0);
            }
        });
    }
    // flag 0 for add, 1 for replace
    public void loadFrag(Fragment fragment_name, int flag)
    {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (flag == 0) {
            ft.add(R.id.FL, fragment_name);

            fm.popBackStack(Root_Frag, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            ft.addToBackStack(Root_Frag);
        }
        else {
            ft.replace(R.id.FL, fragment_name);
            ft.addToBackStack(null);
        }

        ft.commit();
    }
}

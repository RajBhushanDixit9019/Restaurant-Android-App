package com.example.restaurantapp.customer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.restaurantapp.R;

public class CustomerDashboardActivity extends AppCompatActivity {

    private Button btnViewMenu;
    private Button btnOrderHistory;

    String Root_Frag = "root_fragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_dashboard);

        // Initialize buttons
        btnViewMenu = findViewById(R.id.btnViewMenu);
        btnOrderHistory = findViewById(R.id.btnOrderHistory);

        loadFrag(new ViewMenu(), 0);
        // Set click listener for viewing menu
        btnViewMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ViewMenuActivity
               // Intent intent = new Intent(CustomerDashboardActivity.this, ViewMenuActivity.class);
               // startActivity(intent);
                loadFrag(new ViewMenu(), 0);

            }
        });

        // Set click listener for order history
        btnOrderHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to OrderHistoryActivity
                //Intent intent = new Intent(CustomerDashboardActivity.this, OrderHistoryActivity.class);
                //startActivity(intent);
                loadFrag(new OrderHistory(), 0);
            }
        });
    }
    public void loadFrag(Fragment fragment_name, int flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if(flag == 0){
            ft.add(R.id.FL, fragment_name);

            fm.popBackStack(Root_Frag, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            ft.addToBackStack(Root_Frag);

        }else{
            ft.replace(R.id.FL, fragment_name);
           ft.addToBackStack(null);
        }
        ft.commit();
    }
}

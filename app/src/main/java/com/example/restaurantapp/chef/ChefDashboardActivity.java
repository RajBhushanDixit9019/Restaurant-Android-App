package com.example.restaurantapp.chef;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.restaurantapp.R;

public class ChefDashboardActivity extends AppCompatActivity {

    String Root_Frag = "root_fragment";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef_dashboard);

        // Initialize buttons
        Button btnViewOrders = findViewById(R.id.btnViewOrders);
        Button btnMarkOrderComplete = findViewById(R.id.btnMarkOrderComplete);

        loadFrag(new ViewOrders(), 0);
        // Set click listener for viewing orders
        btnViewOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ViewOrdersActivity
                //Intent intent = new Intent(ChefDashboardActivity.this, ViewOrdersActivity.class);
               // startActivity(intent);
                loadFrag(new ViewOrders(), 0);
            }
        });

        // Set click listener for marking order complete
        btnMarkOrderComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to MarkOrderCompleteActivity
                //Intent intent = new Intent(ChefDashboardActivity.this, MarkOrderCompleteActivity.class);
                //startActivity(intent);
                loadFrag(new ViewCompletedOrders(), 0);
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

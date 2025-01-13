package com.example.restaurantapp.activities;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.restaurantapp.R;
import com.example.restaurantapp.adapters.MenuAdapter;
import com.example.restaurantapp.models.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    private ListView lvMenuItems;
    private List<MenuItem> menuItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Initialize the ListView
        lvMenuItems = findViewById(R.id.lvMenuItems);

        // Create sample data (you can fetch real data from a server or database)
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Pizza", "Cheese and tomato pizza", 10.99));
        menuItems.add(new MenuItem("Burger", "Beef burger with fries", 8.99));
        menuItems.add(new MenuItem("Pasta", "Penne pasta with marinara sauce", 12.50));

        // Create and set the adapter
        MenuAdapter menuAdapter = new MenuAdapter(this, menuItems);
        lvMenuItems.setAdapter(menuAdapter);
    }
}

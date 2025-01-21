package com.example.restaurantapp.customer;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.restaurantapp.R;
import com.example.restaurantapp.common.models.MenuItem;
import java.util.ArrayList;
import java.util.List;

public class ViewMenuActivity extends AppCompatActivity {

    private List<MenuItem> menuItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_menu);

        // Initialize the menu item list
        menuItemList = new ArrayList<>();

        // Add menu items with name, price, and description
        menuItemList.add(new MenuItem("Pizza", 8.99, "Delicious cheese pizza"));
        menuItemList.add(new MenuItem("Burger", 5.49, "Juicy beef burger with fries"));
        menuItemList.add(new MenuItem("Pasta", 12.99, "Creamy pasta with mushrooms"));

        // You can now display the menu items in the UI or process them as needed
    }
}

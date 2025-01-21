package com.example.restaurantapp.chef;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantapp.R;
import com.example.restaurantapp.common.models.MenuItem;
import com.example.restaurantapp.common.models.Order;
import java.util.ArrayList;
import java.util.List;

public class ViewOrdersActivity extends AppCompatActivity {

    // Sample order list
    private List<Order> orderList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_orders);

        // Initialize order list
        orderList = new ArrayList<>();

        // Create some menu items and add them to an order
        List<MenuItem> menuItemList = new ArrayList<>();
        menuItemList.add(new MenuItem("Pizza", 9.99, "Delicious cheese pizza"));  // Add a menu item with description
        menuItemList.add(new MenuItem("Burger", 5.49, "Juicy beef burger"));  // Another menu item with description

        // Create an order with menu items
        Order order = new Order("Order 1", "Customer 1", menuItemList, 15.48, "Pending", "2025-01-14");

        // Add order to orderList
        orderList.add(order);

        // You can now proceed to display the orderList in your view (e.g., through a RecyclerView or other UI components)
    }
}

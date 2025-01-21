package com.example.restaurantapp.customer;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.restaurantapp.R;
import com.example.restaurantapp.common.models.MenuItem;
import com.example.restaurantapp.common.models.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderHistoryActivity extends AppCompatActivity {

    private List<Order> orderHistoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);

        // Initialize the order history list
        orderHistoryList = new ArrayList<>();

        // Create a sample MenuItem list
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Pizza", 9.99, "Delicious pizza with cheese"));

        // Add an order to the history list
        orderHistoryList.add(new Order("Order 1", "Customer1", menuItems, 9.99, "Completed", "2025-01-14"));

        // You can continue adding more orders similarly...
    }
}

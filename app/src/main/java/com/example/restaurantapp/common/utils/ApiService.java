package com.example.restaurantapp.common.utils;

import android.util.Log;

import com.example.restaurantapp.common.models.MenuItem;
import com.example.restaurantapp.common.models.Order;

import java.util.ArrayList;
import java.util.List;

public class ApiService {

    // Simulated API methods (Replace with actual API calls)
    public static List<MenuItem> fetchMenuItems() {
        // Simulate fetching menu items from a backend
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Pizza", 12.99, "Cheese pizza with tomato sauce"));
        menuItems.add(new MenuItem("Burger", 9.99, "Beef patty with cheese and veggies"));
        return menuItems;
    }

    public static void placeOrder(Order order) {
        // Simulate sending order to backend
        Log.d("ApiService", "Order placed: " + order.getOrderId() + ", Status: " + order.getOrderStatus());
    }

    public static void updateOrderStatus(String orderId, String status) {
        // Simulate updating order status
        Log.d("ApiService", "Order ID: " + orderId + " updated to status: " + status);
    }
}

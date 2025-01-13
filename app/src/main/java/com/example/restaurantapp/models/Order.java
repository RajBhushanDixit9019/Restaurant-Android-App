package com.example.restaurantapp.models;

public class Order {
    private String orderId;
    private String customerName;
    private String items;

    public Order(String orderId, String customerName, String items) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getItems() {
        return items;
    }
}

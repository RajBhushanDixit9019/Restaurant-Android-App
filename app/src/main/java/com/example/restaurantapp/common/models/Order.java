package com.example.restaurantapp.common.models;

import java.util.List;

public class Order {

    private String orderId;
    private String customerId;
    private List<MenuItem> menuItems;
    private double totalPrice;
    private String orderStatus; // Pending, Completed, etc.
    private String orderDate; // Optional: you can store the order's date if needed.

    // Updated constructor to accept all necessary fields
    public Order(String orderId, String customerId, List<MenuItem> menuItems, double totalPrice, String orderStatus, String orderDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.menuItems = menuItems;
        this.totalPrice = totalPrice;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
    }

    // Getter and Setter methods
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}

package com.example.restaurantapp.common.models;

public class MenuItem {

    private String itemName;
    private double price;
    private String description;  // Added description as the third parameter

    // Constructor with three parameters: name, price, and description
    public MenuItem(String itemName, double price, String description) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;  // Store the description
    }

    // Getter and setter methods
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

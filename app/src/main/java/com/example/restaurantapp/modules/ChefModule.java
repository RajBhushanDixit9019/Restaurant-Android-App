package com.example.restaurantapp.modules;

public class ChefModule {
    private String chefId;
    private String chefName;
    private String specialty;

    // Constructor
    public ChefModule(String chefId, String chefName, String specialty) {
        this.chefId = chefId;
        this.chefName = chefName;
        this.specialty = specialty;
    }

    // Getter and Setter methods
    public String getChefId() {
        return chefId;
    }

    public void setChefId(String chefId) {
        this.chefId = chefId;
    }

    public String getChefName() {
        return chefName;
    }

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}

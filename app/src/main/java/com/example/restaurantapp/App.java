package com.example.restaurantapp;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.restaurantapp.utils.Constants;
import com.example.restaurantapp.utils.DatabaseHelper;

public class App extends Application {

    private static App instance;
    private static DatabaseHelper databaseHelper;
    private static SharedPreferences sharedPreferences;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        // Initialize shared preferences
        sharedPreferences = getSharedPreferences(Constants.PREF_USER, Context.MODE_PRIVATE);

        // Initialize database helper
        databaseHelper = new DatabaseHelper(getApplicationContext());
    }

    // Singleton instance to access the Application class globally
    public static App getInstance() {
        return instance;
    }

    // Get database helper
    public static DatabaseHelper getDatabaseHelper() {
        return databaseHelper;
    }

    // Get shared preferences
    public static SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    // Method to store user info in SharedPreferences
    public static void storeUserInfo(String userId, String username, String role) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Constants.PREF_USER_ID, userId);
        editor.putString(Constants.PREF_USER_ROLE, role);
        editor.putString(Constants.PREF_USER, username);
        editor.apply();
    }

    // Method to retrieve user info from SharedPreferences
    public static String getUserInfo(String key) {
        return sharedPreferences.getString(key, null);
    }

    // Method to clear user info from SharedPreferences
    public static void clearUserInfo() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(Constants.PREF_USER);
        editor.remove(Constants.PREF_USER_ID);
        editor.remove(Constants.PREF_USER_ROLE);
        editor.apply();
    }

    // Method to check if user is logged in
    public static boolean isUserLoggedIn() {
        return sharedPreferences.contains(Constants.PREF_USER_ID);
    }
}

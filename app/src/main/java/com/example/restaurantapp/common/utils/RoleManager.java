package com.example.restaurantapp.common.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class RoleManager {

    private static final String PREF_NAME = "userRolePrefs";
    private static final String ROLE_KEY = "userRole";

    // Save user role
    public static void setUserRole(Context context, String role) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(ROLE_KEY, role);
        editor.apply();
    }

    // Get user role
    public static String getUserRole(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(ROLE_KEY, "none"); // Default is "none"
    }

    // Clear user role
    public static void clearUserRole(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(ROLE_KEY);
        editor.apply();
    }
}

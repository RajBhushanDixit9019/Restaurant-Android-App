package com.example.restaurantapp.utils;

public class Constants {

    // API Base URL
    public static final String BASE_URL = "https://api.restaurantapp.com/";

    // Endpoints
    public static final String LOGIN_ENDPOINT = BASE_URL + "login";
    public static final String GET_MENU_ENDPOINT = BASE_URL + "menu";
    public static final String CREATE_ORDER_ENDPOINT = BASE_URL + "order/create";

    // Database Constants
    public static final String DATABASE_NAME = "restaurant_db";
    public static final int DATABASE_VERSION = 1;

    // Error Messages
    public static final String ERROR_NETWORK = "Network error. Please try again.";
    public static final String ERROR_LOGIN = "Invalid username or password.";
    public static final String ERROR_EMPTY_FIELDS = "Please fill in all fields.";

    // SharedPreferences Keys
    public static final String PREF_USER = "user";
    public static final String PREF_USER_ID = "user_id";
    public static final String PREF_USER_ROLE = "user_role";
}

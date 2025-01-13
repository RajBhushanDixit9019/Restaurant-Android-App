package com.example.restaurantapp.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkUtils {

    // Check if device is connected to the internet
    public static boolean isConnectedToInternet(Context context) {
        ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

    // Check if a URL is reachable (for API calls or server checking)
    public static boolean isServerReachable(String urlString) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setConnectTimeout(5000); // Timeout 5 seconds
            urlConnection.connect();

            // If response code is HTTP_OK, the server is reachable
            return urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Example of an AsyncTask to check if a server is reachable
    public static class ServerCheckTask extends AsyncTask<String, Void, Boolean> {

        @Override
        protected Boolean doInBackground(String... urls) {
            return isServerReachable(urls[0]);
        }

        @Override
        protected void onPostExecute(Boolean result) {
            if (result) {
                // Server is reachable
            } else {
                // Server is not reachable
            }
        }
    }
}

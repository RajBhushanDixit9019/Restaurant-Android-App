// MenuAdapter.java
package com.example.restaurantapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.restaurantapp.R;
import com.example.restaurantapp.models.MenuItem;

import java.util.List;

public class MenuAdapter extends BaseAdapter {

    private Context context;
    private List<MenuItem> menuItems;

    public MenuAdapter(Context context, List<MenuItem> menuItems) {
        this.context = context;
        this.menuItems = menuItems;
    }

    @Override
    public int getCount() {
        return menuItems.size();
    }

    @Override
    public Object getItem(int position) {
        return menuItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // If view is not reusable, inflate the layout
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.menu_item_layout, parent, false);
        }

        // Get the current menu item
        MenuItem currentItem = menuItems.get(position);

        // Bind data to the views
        TextView itemName = convertView.findViewById(R.id.menu_item_name);
        TextView itemDescription = convertView.findViewById(R.id.menu_item_description);
        TextView itemPrice = convertView.findViewById(R.id.menu_item_price);

        itemName.setText(currentItem.getName());
        itemDescription.setText(currentItem.getDescription());
        itemPrice.setText("$" + currentItem.getPrice());

        return convertView;
    }
}

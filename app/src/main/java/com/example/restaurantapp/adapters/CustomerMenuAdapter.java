package com.example.restaurantapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.restaurantapp.R;
import com.example.restaurantapp.models.MenuItem;
import java.util.List;

public class CustomerMenuAdapter extends RecyclerView.Adapter<CustomerMenuAdapter.MenuItemViewHolder> {

    private Context context;
    private List<MenuItem> menuItemList;

    public CustomerMenuAdapter(Context context, List<MenuItem> menuItemList) {
        this.context = context;
        this.menuItemList = menuItemList;
    }

    @Override
    public MenuItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_menu, parent, false);
        return new MenuItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuItemViewHolder holder, int position) {
        MenuItem menuItem = menuItemList.get(position);
        holder.menuItemName.setText(menuItem.getName());
        holder.menuItemDescription.setText(menuItem.getDescription());
        holder.menuItemPrice.setText(String.valueOf(menuItem.getPrice()));
    }

    @Override
    public int getItemCount() {
        return menuItemList.size();
    }

    public static class MenuItemViewHolder extends RecyclerView.ViewHolder {
        TextView menuItemName, menuItemDescription, menuItemPrice;

        public MenuItemViewHolder(View itemView) {
            super(itemView);
            menuItemName = itemView.findViewById(R.id.menu_item_name);
            menuItemDescription = itemView.findViewById(R.id.menu_item_description);
            menuItemPrice = itemView.findViewById(R.id.menu_item_price);
        }
    }
}

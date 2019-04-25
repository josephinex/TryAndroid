package com.example.lesson3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ItemAdapter extends RecyclerView.Adapter {

    LayoutInflater mInflater;

    String[] items;

    String[] prices;

    String[] descriptions;

    public ItemAdapter(Context context, String[] items, String[] prices, String[] descriptions) {
        this.items = items;
        this.prices = prices;
        this.descriptions = descriptions;
        this.mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.my_listview_details, null);
        TextView nameTextView = view.findViewById(R.id.name);
        TextView descriptionTextView = view.findViewById(R.id.description);
        TextView priceTextView = view.findViewById(R.id.price);

        String name = items[i];
        String description = descriptions[i];
        String price = prices[i];

        nameTextView.setText(name);
        descriptionTextView.setText(description);
        priceTextView.setText(price);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override
    public long getItemId(int position) {
        return items[position].hashCode();
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}

package com.example.assignment2;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {
    private MainActivity mParentActivity;
    private ArrayList<Restaurant> mRestaurants;

    //Creates listener which links to respective restaurant Id
    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Restaurant restaurant = (Restaurant) v.getTag();

            Context context = v.getContext();
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra(DetailFragment.ARG_ITEM_ID, restaurant.getId());
            context.startActivity(intent);

        }
    };

    //Constructor
    public RestaurantAdapter(MainActivity parent, ArrayList<Restaurant> restaurants) {
        mParentActivity = parent;
        mRestaurants = restaurants;
    }

    //Create Viewholder class for restaurant_list_row
    public static class RestaurantViewHolder extends RecyclerView.ViewHolder  {
        public TextView name, cuisine, area, rating;
        public ImageView cover;
        public Button menu;
        public Button direction;

        public RestaurantViewHolder(View v) {
            super(v);
            name = v.findViewById(R.id.name);
            area = v.findViewById(R.id.area);
            cuisine = v.findViewById(R.id.cuisine);
            rating = v.findViewById(R.id.rating);
            cover = v.findViewById(R.id.cover);
            menu = v.findViewById(R.id.menu);
            direction = v.findViewById(R.id.direction);
        }
    }

    //Inflate restaurant_list_row and return view
    @Override
    public RestaurantAdapter.RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_row, parent, false);
        return new RestaurantViewHolder(v);
    }

    //Replace contents of a view with respective data
    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position) {
        final Restaurant restaurant = mRestaurants.get(position);

        //Sets listener
        holder.itemView.setOnClickListener(mOnClickListener);

        holder.name.setText(restaurant.getName());
        holder.cuisine.setText(restaurant.getCuisine().toUpperCase());
        holder.area.setText(restaurant.getArea());
        holder.rating.setText(restaurant.getRatings());
        holder.itemView.setTag(restaurant);
        int res = holder.itemView.getResources().getIdentifier("cover" + restaurant.getId(),"drawable","com.example.assignment2");
        holder.cover.setImageResource(res);

        //Link to menu on click
        holder.menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mParentActivity.startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(restaurant.getMenu())));
            }
        });

        //Link to google maps direction on click
        holder.direction.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mParentActivity.startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/maps/dir//" + restaurant.getAddress())));
            }
        });
    }

    //Return the size of dataset
    @Override
    public int getItemCount() {
        return mRestaurants.size();
    }

}
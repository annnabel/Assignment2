package com.example.assignment2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.text.NumberFormat;

public class DetailFragment extends Fragment {
    public static final String ARG_ITEM_ID = "item_id";
    private Restaurant mRestaurant;

    public DetailFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Gets item_id and renames activity to name of respective restaurant
        if(getArguments().containsKey(ARG_ITEM_ID)) {
            mRestaurant = Restaurant.getRestaurant(getArguments().getString(ARG_ITEM_ID));
            this.getActivity().setTitle(mRestaurant.getName());
        }
    }

    //Inflate fragment and return view
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_detail, container, false);

        if(mRestaurant != null) {
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            ((TextView) v.findViewById(R.id.name)).setText(mRestaurant.getName());
            ((TextView) v.findViewById(R.id.area)).setText(mRestaurant.getArea());
            ((TextView) v.findViewById(R.id.cuisine)).setText(mRestaurant.getCuisine().toUpperCase());
            ((TextView) v.findViewById(R.id.rating)).setText(mRestaurant.getRatings());
            ((TextView) v.findViewById(R.id.cost)).setText("Cost for two - $"+mRestaurant.getCost()+" (approx.)");
            ((TextView) v.findViewById(R.id.hours)).setText(mRestaurant.getHours());
            ((TextView) v.findViewById(R.id.address)).setText(mRestaurant.getAddress());
            ((TextView) v.findViewById(R.id.phone)).setText("+"+mRestaurant.getNumber());
            ((TextView) v.findViewById(R.id.email)).setText(mRestaurant.getEmail());
            ((TextView) v.findViewById(R.id.website)).setText(mRestaurant.getWebsite());
            int res = v.getResources().getIdentifier("logo" + mRestaurant.getId(),"drawable","com.example.assignment2");
            ((ImageView) v.findViewById(R.id.logo)).setImageResource(res);
        }

        return v;
    }
}

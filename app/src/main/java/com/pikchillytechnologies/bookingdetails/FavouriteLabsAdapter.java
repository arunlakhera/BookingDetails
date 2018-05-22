package com.pikchillytechnologies.bookingdetails;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FavouriteLabsAdapter extends ArrayAdapter<FavouriteLabs> {

    LayoutInflater inflter;
    FavouriteLabs favourite;

    public FavouriteLabsAdapter(Context context, List<FavouriteLabs> favouriteList){
        super(context,0, favouriteList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null){
            convertView = inflter.from(getContext()).inflate(R.layout.activity_favourite_labs_listview,parent,false);
        }

        favourite = getItem(position);



        TextView txtPathologyName = convertView.findViewById(R.id.textview_PathologyName);
        TextView txtPathologyAdd = convertView.findViewById(R.id.textview_PathologyAdd);
        TextView txtPathologyPincode = convertView.findViewById(R.id.textview_PathologyPinCode);

        txtPathologyName.setText(String.valueOf(favourite.getmLabName()));
        txtPathologyAdd.setText(String.valueOf(favourite.getmLabAddress()));
        txtPathologyPincode.setText(String.valueOf(favourite.getmPincode()));


        return convertView;

    }

}

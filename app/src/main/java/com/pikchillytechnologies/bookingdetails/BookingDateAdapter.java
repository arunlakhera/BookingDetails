package com.pikchillytechnologies.bookingdetails;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Movie;
import android.support.annotation.NonNull;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BookingDateAdapter extends RecyclerView.Adapter<BookingDateAdapter.ViewHolder> {

    private List<BookingDateTimeModel> dateList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtDate, txtDay;

        public ViewHolder(View view) {
            super(view);
            txtDate = (TextView) view.findViewById(R.id.date_text);
            txtDay = view.findViewById(R.id.day_text);
        }
    }

    public BookingDateAdapter(List<BookingDateTimeModel> dateList) {
        this.dateList = dateList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.booking_data_recyclerview, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        BookingDateTimeModel bookDate = dateList.get(position);
        holder.txtDate.setText(bookDate.getmDate());

        if(String.valueOf(bookDate.getmDay()).equals("S")) {
            holder.txtDay.setTextColor(Color.GRAY);
            holder.txtDay.setText(bookDate.getmDay());
        }else {
            holder.txtDay.setText(bookDate.getmDay());
        }

    }

    @Override
    public int getItemCount() {
        return dateList.size();
    }

}
